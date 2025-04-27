"""
-----------------------------------------------------------------------------------------
Employee Data Generator for OrangeHRM Global Demonstration Project
-----------------------------------------------------------------------------------------
Author: Mahtab Siddique
Developer: Mahtab Siddique
Date: 2024-12-25
Description:
    This script generates synthetic employee data for testing purposes in the 
    OrangeHRM Global Demonstration project. It uses the Faker library to create 
    realistic employee information and saves it in a CSV file.

    Key Features:
    - Generates employee profiles with randomized personal details, job titles, 
      and salary structures.
    - Ensures unique Employee IDs.
    - Supports predefined job categories, pay grades, and other HR-related details.
    - Saves generated data into a structured CSV file for import into Katalon Script.

Dependencies:
    - Python 3.x
    - Faker library (pip install faker)

Usage:
    Run the script to generate and store employee data in the specified CSV file.
-----------------------------------------------------------------------------------------
"""

import csv
import random
import os
from faker import Faker
import string

# Initialize Faker for generating fake data
faker = Faker()

# Set the output file path
file_path = "{YourPath}/EmployeeDatas.csv"

# List of predefined data for specific fields
job_titles = [
    "AI Test Engineer", "API Automation Tester", 
    "Automation Architect", "CI/CD Test Engineer", 
    "Data Quality Engineer"
]
job_categories = ["Professionals", "Officials and Managers"]
sub_units = ["QA Tester", "Lead Developer", "Software Developer", "IT Manager", "Marketing Manager"]
marital_statuses = ["Married", "Single"]
genders = ["Male", "Female"]
countries = ["United States", "India"]
emp_nationality = ["American", "Indian"]
pay_grades = ["Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8"]
pay_frequencies = ["Monthly", "Bi-Weekly", "Weekly"]
currency = "United States Dollar"
emp_supervisor_name = "Mahtab Siddique"

# Function to generate alphanumeric license number
def generate_license_number():
    return ''.join(random.choices(string.ascii_uppercase + string.digits, k=10))

# Function to generate salary based on the grade
def generate_salary(grade):
    salary_ranges = {
        "Grade 1": (20000, 30000),
        "Grade 2": (30000, 40000),
        "Grade 3": (40000, 60000),
        "Grade 4": (60000, 80000),
        "Grade 5": (80000, 120000),
        "Grade 6": (120000, 150000),
        "Grade 7": (150000, 200000),
        "Grade 8": (200000, 1000000)
    }
    min_salary, max_salary = salary_ranges[grade]
    return random.randint(min_salary, max_salary)

# Function to generate phone number without special characters
def generate_phone_number():
    return ''.join(random.choices(string.digits, k=10))

# Function to generate employee data
def generate_employee_data(employee_id):
    first_name = faker.first_name()
    middle_name = faker.first_name()
    last_name = faker.last_name()
    username = f"{first_name.lower()}.{last_name.lower()}"
    password = "p7egalF197zCPQnMaznrNq5yBULcTkKN"
    license_number = generate_license_number()
    license_expiry = faker.date_between(start_date="+1y", end_date="+5y")
    nationality = faker.random_element(elements=emp_nationality)
    marital_status = faker.random_element(elements=marital_statuses)
    dob = faker.date_of_birth(minimum_age=18, maximum_age=60)
    gender = faker.random_element(elements=genders)
    street1 = faker.street_address()
    street2 = faker.secondary_address()
    city = faker.city()
    state = faker.state()
    zip_code = faker.zipcode()
    country = faker.random_element(elements=countries)
    home_phone = generate_phone_number()
    mobile_phone = generate_phone_number()
    work_phone = generate_phone_number()
    work_email = f"{username}@{faker.domain_name()}"
    other_email = f"{username}.other@{faker.domain_name()}"
    job_title = faker.random_element(elements=job_titles)
    job_category = faker.random_element(elements=job_categories)
    sub_unit = faker.random_element(elements=sub_units)
    location = "Office"
    employee_status = "Full-Time Permanent"
    salary_component = "Basic Pay"
    pay_grade = faker.random_element(elements=pay_grades)
    pay_frequency = faker.random_element(elements=pay_frequencies)
    salary = generate_salary(pay_grade)
    comments = f"Salary component: {salary_component}"
    supervisor_name = emp_supervisor_name
    reporting_method = "Direct"

    # Full Name 2 field
    full_name2 = f"{first_name} {last_name}"

    return [
        f"{first_name} {middle_name} {last_name}", full_name2, first_name, middle_name, last_name, username,
        password, employee_id, license_number, license_expiry, nationality, marital_status, dob, gender,
        street1, street2, city, state, zip_code, country, home_phone, mobile_phone, work_phone, work_email, 
        other_email, job_title, job_category, sub_unit, location, employee_status, salary_component, 
        pay_grade, pay_frequency, currency, salary, comments, supervisor_name, reporting_method
    ]

# Generate and save employee data
def save_employee_data(file_path):
    # Ensure directory exists
    os.makedirs(os.path.dirname(file_path), exist_ok=True)

    # Define CSV headers
    headers = [
        "Fullname", "FullName2", "FirstName", "MiddleName", "LastName", "UserName", "Password", 
        "EmployeeID", "LicenseNumber", "LicenseExpiry", "Nationality", "MaritalStatus", "DateOfBirth", 
        "Gender", "Street1", "Street2", "City", "State", "ZipCode", "Country", 
        "Telephone (Home)", "Telephone (Mobile)", "Telephone (Work)", 
        "EmailID (Work)", "Email (Other)", "Job_Title", "Job_Category", 
        "Sub_Unit", "Location", "Employee_Status", "Salary_Component", 
        "Pay_Grade", "Pay_Frequency", "Currency", "Amount", "Comments",
        "Supervisor_Name", "Reporting_Method"
    ]

    # Generate data for 100 employees
    data = [generate_employee_data(employee_id) for employee_id in range(10001, 10010)]

    # Write data to CSV
    with open(file_path, mode="w", newline="", encoding="utf-8") as file:
        writer = csv.writer(file)
        writer.writerow(headers)
        writer.writerows(data)

    print(f"Employee data successfully saved to: {file_path}")

# Execute the function
save_employee_data(file_path)

