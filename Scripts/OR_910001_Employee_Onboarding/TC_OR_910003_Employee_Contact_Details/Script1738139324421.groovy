import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// WebUI.Comment: Click on the 'PIM' menu item under the 'Employee-Onboarding' section
WebUI.comment('Clicking on the "PIM" menu item to navigate to the Employee Onboarding section.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/a_PIM'))

// WebUI.Comment: Enter the employee's full name into the input field for search
WebUI.comment('Entering the employee full name in the search field to search for the employee.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input'), 
    Fullname)

// WebUI.Comment: Click the 'Search' button to search for the employee using the entered full name
WebUI.comment('Clicking the "Search" button to initiate the employee search.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/button_Search'))

// WebUI.Comment: Click on the 'Actions' button next to the employee's details in the search results
WebUI.comment('Clicking on the "Actions" button next to the employee details to open additional options.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/div_Actions_oxd-table-cell oxd-padding-cell'))

// WebUI.Comment: Click on the 'Contact Details' link to navigate to the employee's contact information page
WebUI.comment('Navigating to the "Contact Details" page of the selected employee.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/a_Contact Details'))

/////
// WebUI.Comment: Enter the first line of the employee's street address in the 'Street 1' input field
WebUI.comment('Entering the first line of the employee address in the "Street 1" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_Street 1_oxd-input oxd-input--focus'), 
    Street1)

////
// WebUI.Comment: Enter the second line of the employee's street address in the 'Street 2' input field
WebUI.comment('Entering the second line of the employee address in the "Street 2" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_Street 2_oxd-input oxd-input--active'), 
    Street2)

// WebUI.Comment: Enter the city of the employee in the 'City' input field
WebUI.comment('Entering the employee city in the "City" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_City_oxd-input oxd-input--active'), 
    City)

// WebUI.Comment: Enter the state or province of the employee in the 'StateProvince' input field
WebUI.comment('Entering the employee state or province in the "StateProvince" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_StateProvince_oxd-input oxd-input--active'), 
    State)

// WebUI.Comment: Enter the employee's ZIP or postal code in the 'ZipPostal Code' input field
WebUI.comment('Entering the employee ZIP or postal code in the "ZipPostal Code" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_ZipPostal Code_oxd-input oxd-input--active'), 
    ZipCode)

// WebUI.Comment: Click on the dropdown icon to open the dropdown menu for selecting a country
WebUI.comment('Clicking the dropdown icon to select the country.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

// WebUI.Comment: Select the country from the dropdown by matching the 'Country' value passed as a parameter
WebUI.comment('Selecting the country from the dropdown based on the "Country" parameter.')

WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', 
        [('value') : Country]))

// WebUI.Comment: Enter the employee's home telephone number in the 'Home' phone number input field
WebUI.comment('Entering the employee\'s home telephone number in the "Home" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_Home_oxd-input oxd-input--focus'), 
    Tel_Home)

// WebUI.Comment: Enter the employee's mobile telephone number in the 'Mobile' phone number input field
WebUI.comment('Entering the employee\'s mobile telephone number in the "Mobile" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_Mobile_oxd-input oxd-input--focus'), 
    Tell_Mobile)

// WebUI.Comment: Enter the employee's work telephone number in the 'Work' phone number input field
WebUI.comment('Entering the employee\'s work telephone number in the "Work" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_Work_oxd-input oxd-input--focus'), 
    Tel_Work)

// WebUI.Comment: Enter the employee's work email address in the 'Work Email' input field
WebUI.comment('Entering the employee\'s work email address in the "Work Email" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_Work Email_oxd-input oxd-input--active'), 
    Email_Work)

// WebUI.Comment: Enter the employee's other email address in the 'Other Email' input field
WebUI.comment('Entering the employee\'s other email address in the "Other Email" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/input_Other Email_oxd-input oxd-input--focu_8ec2d9'), 
    Email_Other)

// WebUI.Comment: Click the 'Save' button to save the employee's contact details
WebUI.comment('Clicking the "Save" button to save the employee\'s contact details.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Contact_Details_Objects/Page_OrangeHRM/button_Save'))

WebUI.delay(2)

