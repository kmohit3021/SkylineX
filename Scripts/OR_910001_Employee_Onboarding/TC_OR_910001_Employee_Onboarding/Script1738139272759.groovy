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

// Navigate to the PIM module
WebUI.comment('Step 1: Click on the PIM module link')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/a_PIM'))

// Click the Add button to add a new employee
WebUI.comment('Step 2: Click the "Add" button to add a new employee')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/button_Add'))

// Click on the first name input field
WebUI.comment('Step 3: Focus on the "First Name" input field')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_firstName'))

// Enter the first name
WebUI.comment('Step 4: Enter the employee\'s first name')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    Firstname)

// Enter the last name
WebUI.comment('Step 5: Enter the employee\'s last name')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    Lastname)

// Clear the employee ID field
WebUI.comment('Step 6: Clear the default value in the "Employee ID" field')

WebUI.clearText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

// Enter the new employee ID
WebUI.comment('Step 7: Set the employee ID field with a new value')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    '')

//WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
//    EmployeeID)
// Toggle the switch for the "Employee ID" option
WebUI.comment('Step 8: Toggle the switch related to the Employee ID')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/span_Employee Id_oxd-switch-input oxd-switc_efe210'))

// Retrieve the entered first name, convert to lowercase, and store in a variable
WebUI.comment('Step 9: Retrieve the entered first name and convert it to lowercase')

String firstname = WebUI.getAttribute(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    'value').toLowerCase()

// Retrieve the entered last name, convert to lowercase, and store in a variable
WebUI.comment('Step 10: Retrieve the entered last name and convert it to lowercase')

String lastname = WebUI.getAttribute(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    'value').toLowerCase()

// Concatenate the first name and last name to create a username
WebUI.comment('Step 11: Concatenate the first and last names to generate a username')

String username = (firstname + '.') + lastname

// Set the username field with the generated username
WebUI.comment('Step 12: Set the username field with the generated username')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    username)

// Set the password field with an encrypted password
WebUI.comment('Step 13: Enter an encrypted password into the password field')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    EmployeePassword)

// Set the confirm password field with an encrypted password
WebUI.comment('Step 14: Enter an encrypted password into the confirm password field')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input-_a3aecb'), 
    EmployeePassword)

// Click the Save button to complete the employee onboarding
WebUI.comment('Step 15: Click the "Save" button to finalize adding the new employee')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/button_Save'))

WebUI.delay(2)

