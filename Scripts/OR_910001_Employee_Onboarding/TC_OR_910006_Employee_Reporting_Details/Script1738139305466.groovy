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
WebUI.comment('Navigating to the PIM module.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/a_PIM'))

// Search for the employee by their full name
WebUI.comment('Searching for the employee by their full name.')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/input'), Fullname)

// Click the search button
WebUI.comment('Clicking the search button.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/button_Search'))

// Select the employee from the search results
WebUI.comment('Selecting the employee from the search results.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/div_Actions_oxd-table-cell oxd-padding-cell'))

// Open the "Report-to" section for the employee
WebUI.comment('Opening the "Report-to" section for the employee.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/a_Report-to'))

// Click the "Add" button to add a reporting structure
WebUI.comment('Clicking the "Add" button to add a reporting structure.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/button_Add'))

// Enter the supervisor's name
WebUI.comment('Entering the supervisor name.')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/input_1'), Supervisor_Name)

// Add a small delay to ensure the dropdown is populated
WebUI.comment('Adding a delay to wait for the dropdown to populate.')
WebUI.delay(2)

// Select the supervisor from the dropdown
WebUI.comment('Selecting the supervisor from the dropdown.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_To_Objects/SearchName-Object-01'))

// Open the reporting method dropdown
WebUI.comment('Opening the reporting method dropdown.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

// Select the reporting method from the dropdown
WebUI.comment('Selecting the reporting method from the dropdown.')
WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown',
		[('value') : Reporting_Method]))

// Click the "Save" button to save the reporting details
WebUI.comment('Clicking the "Save" button to save the reporting details.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Reporting_Details_Objects/Page_OrangeHRM/button_Save'))

// Add a small delay to ensure the changes are saved
WebUI.comment('Adding a delay to wait for the changes to save.')
WebUI.delay(2)
