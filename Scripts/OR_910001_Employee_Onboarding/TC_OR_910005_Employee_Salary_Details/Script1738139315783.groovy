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

// WebUI.Comment: Click on the 'PIM' menu item to navigate to the Employee Salary section
WebUI.comment('Clicking on the "PIM" menu item to navigate to the Employee Salary section.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/a_PIM'))

// WebUI.Comment: Enter the employee full name in the search field to find the specific employee
WebUI.comment('Entering the employee full name in the search field to search for the employee.')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/input'), Fullname)

// WebUI.Comment: Click on the 'Search' button to initiate the employee search
WebUI.comment('Clicking the "Search" button to search for the employee using the entered full name.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/button_Search'))

// WebUI.Comment: Click on the specific employee from the search results
WebUI.comment('Selecting the specific employee from the search results to view their salary details.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/div_0034008'))

// WebUI.Comment: Click on the 'Salary' link to navigate to the salary section of the employee
WebUI.comment('Navigating to the "Salary" section for the selected employee.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/a_Salary'))

// WebUI.Comment: Click on the 'Add' button to add salary details for the selected employee
WebUI.comment('Clicking on the "Add" button to begin adding salary details for the selected employee.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/button_Add'))

// WebUI.Comment: Enter the salary component in the 'Salary Component' input field
WebUI.comment('Entering the salary component in the "Salary Component" field.')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/input_Salary Component_oxd-input oxd-input--focus'),
	Salary_Component)

// WebUI.Comment: Click on the dropdown to select the pay grade for the employee
WebUI.comment('Clicking the dropdown to select the pay grade for the employee.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

// WebUI.Comment: Select the pay grade from the dropdown based on the 'Pay_Grade' parameter
WebUI.comment('Selecting the pay grade from the dropdown based on the provided "Pay_Grade" value.')
WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown',
		[('value') : Pay_Grade]), FailureHandling.STOP_ON_FAILURE)

// WebUI.Comment: Click on the dropdown to select the pay frequency
WebUI.comment('Clicking on the pay frequency dropdown to select the employee\'s pay frequency.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

// WebUI.Comment: Select the pay frequency from the dropdown based on the 'Pay_Frequency' parameter
WebUI.comment('Selecting the pay frequency from the dropdown based on the provided "Pay_Frequency" value.')
WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown',
		[('value') : Pay_Frequency]), FailureHandling.STOP_ON_FAILURE)

// WebUI.Comment: Click on the dropdown to select the salary currency
WebUI.comment('Clicking the dropdown to select the salary currency for the employee.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2'))

// WebUI.Comment: Select the salary currency from the dropdown based on the 'Salary_Currency' parameter
WebUI.comment('Selecting the salary currency from the dropdown based on the provided "Salary_Currency" value.')
WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown',
		[('value') : Salary_Currency]), FailureHandling.STOP_ON_FAILURE)

// WebUI.Comment: Enter the salary amount in the 'Amount' input field
WebUI.comment('Entering the salary amount in the "Amount" field.')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/input_Amount_oxd-input oxd-input--focus'),
	Amount)

// WebUI.Comment: Enter comments related to the salary in the 'Comments' textarea field
WebUI.comment('Entering any comments related to the salary in the "Comments" field.')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/textarea_Comments_oxd-textarea oxd-textarea_6464fb'),
	Salary_Comments)

// WebUI.Comment: Click on the 'Save' button to save the salary details
WebUI.comment('Clicking the "Save" button to save the salary details for the employee.')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Salary_2/Page_OrangeHRM/button_Save'))

// WebUI.Comment: Add a short delay to allow for the save action to complete
WebUI.comment('Adding a 3-second delay to allow for the save action to complete.')
WebUI.delay(3)

