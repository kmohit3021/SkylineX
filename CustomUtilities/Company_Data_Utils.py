import csv
import os
import random
from faker import Faker

# Initialize Faker for generating fake data
faker = Faker()

# Set the output file path
file_path = "{YourPath}/Project_Data.csv"

# List of predefined company names
company_names = ["Accenture", "GE Digital", "Nasdaq", "NVIDIA", "RedBull", "Vodafone"]

# Project admin name
project_admin = "Mahtab Siddique"

# Function to generate project data
def generate_project_data():
    company_name = random.choice(company_names)
    project_name = faker.company()
    project_description = faker.text(max_nb_chars=100)
    return [company_name, project_name, project_description, project_admin]

# Generate and save project data
def save_project_data(file_path, num_records=100):
    # Ensure directory exists
    os.makedirs(os.path.dirname(file_path), exist_ok=True)
    
    # Define CSV headers
    headers = ["CompanyName", "ProjectName", "ProjectDescription", "ProjectAdmin"]
    
    # Generate data
    data = [generate_project_data() for _ in range(num_records)]
    
    # Write data to CSV
    with open(file_path, mode="w", newline="", encoding="utf-8") as file:
        writer = csv.writer(file)
        writer.writerow(headers)
        writer.writerows(data)
    
    print(f"Project data successfully saved to: {file_path}")

# Execute the function
save_project_data(file_path)
