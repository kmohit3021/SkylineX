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

// Navigate to the "Time" module
WebUI.comment('Navigating to the Time module.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/a_Time'))

// Expand the "Project Info" dropdown
WebUI.comment('Expanding the Project Info dropdown menu.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/i_Project Info_oxd-icon bi-chevron-down'))

// Select the "Projects" option
WebUI.comment('Selecting the Projects option from the dropdown.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/li_Projects'))

// Search for a project by company name
WebUI.comment('Entering the company name to search for a project.')
WebUI.setText(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/input'), Company_name)

// Add a delay for UI stabilization
WebUI.comment('Adding a 2-second delay for UI stabilization.')
WebUI.delay(2)

// Select the company from the dropdown
WebUI.comment('Selecting the company from the search dropdown.')
WebUI.click(findTestObject('Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/Search_Dropdown_Object'))

// Enter the project name to search
WebUI.comment('Entering the project name to search.')
WebUI.setText(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/input_1'), Project_Name)

// Add another delay for UI stabilization
WebUI.comment('Adding another 2-second delay for UI stabilization.')
WebUI.delay(2)

// Select the project from the dropdown
WebUI.comment('Selecting the project from the search dropdown.')
WebUI.click(findTestObject('Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/Search_Dropdown_Object'))

// Click the "Search" button
WebUI.comment('Clicking the Search button to search for the project.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/button_Search'))

// Click the "Edit" button for the selected project
WebUI.comment('Clicking the Edit button for the selected project.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/i_Mahtab Siddique_oxd-icon bi-pencil-fill'))

// Define the list of activities to add
WebUI.comment('Defining the list of activities to add to the project.')
List<String> activities = [
	'Framework Design & Setup',
	'Test Case Creation',
	'Regression Test Execution',
	'Load Testing',
	'Integration Test Execution',
	'UAT Test Planning & Execution',
	'Exploratory Test Sessions',
	'Penetration Testing',
	'Test Data Preparation & Maintenance',
	'Mobile App Test Execution'
]

// Iterate through each activity in the list
WebUI.comment('Iterating through each activity in the list to add them to the project.')
for (String activity : activities) {
	
	// Click the "Add" button to add a new activity
	WebUI.comment('Clicking the Add button to add a new activity.')
	WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/button_Add'))
	
	// Enter the activity name
	WebUI.comment('Entering the activity name: ' + activity)
	WebUI.setText(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), activity)
	
	// Verify if the activity already exists
	WebUI.comment('Checking if the activity already exists.')
	Boolean isLabelExist = WebUI.verifyElementPresent(findTestObject('Object Repository/Customers_and_Projects/New_Objects1/Page_OrangeHRM/span_Already exists'), 2, FailureHandling.OPTIONAL)
	
	// Log the result of the existence check
	WebUI.comment('Element exists: ' + isLabelExist)
	println("Element exist: " + isLabelExist)
	
	if (isLabelExist) {
		// If the activity already exists, click the "Cancel" button
		WebUI.comment('Activity already exists. Clicking the Cancel button.')
		WebUI.click(findTestObject('Object Repository/Customers_and_Projects/New_Objects1/Page_OrangeHRM/button_Cancel'))
		WebUI.delay(2)
	} else {
		// If the activity does not exist, click the "Save" button
		WebUI.comment('Activity does not exist. Clicking the Save button to save the activity.')
		WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Project_Activities/Page_OrangeHRM/button_Save'))
		WebUI.delay(2)
	}
}


