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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// WebUI.Comment: Click on the 'PIM' menu item to navigate to the Employee Personal Details section
WebUI.comment('Clicking on the "PIM" menu item to navigate to the Employee Personal Details section.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/span_PIM'))

// WebUI.Comment: Enter the employee full name in the search field to search for the employee
WebUI.comment('Entering the employee full name in the search field to find the specific employee.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/input'), 
    Employee_Fullname)

// WebUI.Comment: Click on the 'Search' button to start searching for the employee
WebUI.comment('Clicking the "Search" button to initiate the employee search based on the entered full name.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/button_Search'))

// WebUI.Comment: Click on the specific employee in the search result to select them
WebUI.comment('Clicking on the specific employee in the search results to view their personal details.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/div_0034008'))

// WebUI.Comment: Click on the 'Personal Details' link to navigate to the personal details section of the selected employee
WebUI.comment('Navigating to the "Personal Details" section for the selected employee.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/a_Personal Details'))

// WebUI.Comment: Enter the employee’s driving license number in the 'Driving License Number' input field
WebUI.comment('Entering the employee\'s driving license number in the "Driving License Number" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/input_concat(Driver, , s License Number)_ox_6ab805'), 
    Driving_License_Number)

// WebUI.Comment: Enter the license expiry date in the 'License Expiry Date' input field
WebUI.comment('Entering the employee\'s license expiry date in the "License Expiry Date" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/input_License Expiry Date_oxd-input oxd-inp_5d7d79'), 
    License_Expiry_Date)

// WebUI.Comment: Click on the dropdown to select nationality from the options
WebUI.comment('Clicking on the nationality dropdown to select the employee\'s nationality.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/div_-- Select --'))

// WebUI.Comment: Select the nationality from the dropdown based on the 'Employee_Nationality' parameter
WebUI.comment('Selecting the employee nationality from the dropdown based on the provided "Employee_Nationality" value.')

WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', 
        [('value') : Employee_Nationality]))

// WebUI.Comment: Click on the dropdown to select marital status from the options
WebUI.comment('Clicking on the marital status dropdown to select the employee\'s marital status.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/div_-- Select --_1'))

// WebUI.Comment: Select the marital status from the dropdown based on the 'Employee_Marital_Status' parameter
WebUI.comment('Selecting the employee marital status from the dropdown based on the provided "Employee_Marital_Status" value.')

WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', 
        [('value') : Employee_Marital_Status]))

// WebUI.Comment: Enter the employee's date of birth in the 'Date of Birth' input field
WebUI.comment('Entering the employee\'s date of birth in the "Date of Birth" field.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/input_Date of Birth_oxd-input oxd-input--focus'), 
    Employee_DOB)

// WebUI.Comment: Click on the radio button to select gender as 'Male'
WebUI.comment('Selecting the "Male" gender option by clicking on the corresponding radio button.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/span_Male_oxd-radio-input oxd-radio-input--_b0de6e'))

// WebUI.Comment: Click the 'Save' button to save the employee's personal details
WebUI.comment('Clicking the "Save" button to save the employee\'s personal details.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Personal_Details_Objects/Page_OrangeHRM/button_Save'))

WebUI.delay(2)

