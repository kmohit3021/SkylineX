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

// Click on the "PIM" tab to access the Employee Management section
WebUI.comment('Step 1: Click on the "PIM" tab to access the Employee Management section')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/a_PIM'))

// Set the search text for employee name (e.g., "Alice Johnson") in the search input field
WebUI.comment('Step 2: Set the employee name "Alice Johnson" in the search input field')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/input'), Fullname)

// Click on the "Search" button to search for the employee
WebUI.comment('Step 3: Click the "Search" button to search for the employee')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/button_Search'))

/// ************* Search Option Above ************** ///
// Select an employee record by clicking on the corresponding employee ID
WebUI.comment('Step 1: Select the employee record by clicking on the employee ID')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/div_0034008'))

// Navigate to the "Job" tab in the employee details
WebUI.comment('Step 2: Click on the "Job" tab in the employee details section')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/a_Job'))

// Open the calendar to select a "Joined Date"
WebUI.comment('Step 3: Open the date picker for "Joined Date"')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/i_Joined Date_oxd-icon bi-calendar oxd-date_38329e'))

// Select a specific date (e.g., 31st) from the calendar
WebUI.comment('Step 4: Select the 31st as the "Joined Date"')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/div_31'))

// Adjust dropdown selections (e.g., job details or employment type)
WebUI.comment('Step 5: Open the dropdown menu to make selections (e.g., job title, employment type)')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', 
        [('value') : Job_Title]))

WebUI.comment('Step 6: Select the desired job option from the dropdown')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', 
        [('value') : Job_Category]))

WebUI.comment('Step 7: Select the desired job category from the dropdown')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2'))

WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', 
        [('value') : Sub_Unit]))

WebUI.comment('Step 8: Select the desired sub-category from the dropdown')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2_3'))

WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', 
        [('value') : Location]))

WebUI.comment('Step 9: Finalize the job details by selecting the appropriate options from the dropdown')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2_3_4'))

WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', 
        [('value') : Employee_Status]))

// Save the changes made to the job details
WebUI.comment('Step 10: Click the "Save" button to save the updated job details for the employee')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Jobs_Objects/Page_OrangeHRM/button_Save'))

WebUI.delay(2)

