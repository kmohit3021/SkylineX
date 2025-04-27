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
WebUI.comment('Clicking on the Time module in the navigation bar.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/a_Time'))

// Expand the "Project Info" dropdown
WebUI.comment('Expanding the Project Info dropdown menu.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/i_Project Info_oxd-icon bi-chevron-down'))

// Select the "Projects" option
WebUI.comment('Selecting the Projects option from the dropdown.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/a_Projects'))

// Click the "Add" button to create a new project
WebUI.comment('Clicking on the Add button to create a new project.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/button_Add'))

// Set the project name
WebUI.comment('Setting the project name.')
WebUI.setText(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'),
	Project_Name)

// Set the customer name
WebUI.comment('Setting the customer name.')
WebUI.setText(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/input'), Customer_Name)

// Add a delay to allow the UI to load
WebUI.comment('Adding a 2-second delay to allow the UI to load.')
WebUI.delay(2)

// Search for the company in the search box
WebUI.comment('Clicking on the company search box.')
WebUI.click(findTestObject('Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/Company_Search'))

// Set the project description
WebUI.comment('Entering the project description.')
WebUI.setText(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/textarea_Description_oxd-textarea oxd-texta_fed1e5'),
	Project_Descriptions)

// Add another delay for the UI to stabilize
WebUI.comment('Adding a 2-second delay for UI stabilization.')
WebUI.delay(2)

// Set the project admin
WebUI.comment('Entering the project admin details.')
WebUI.setText(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/input_1'),
	Project_Admin)

// Add another delay for consistency
WebUI.comment('Adding a 2-second delay for consistency.')
WebUI.delay(2)

// Perform a second company search if necessary
WebUI.comment('Clicking on the company search box again, if required.')
WebUI.click(findTestObject('Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/Company_Search'))

// Save the project details
WebUI.comment('Clicking the Save button to save project details.')
WebUI.click(findTestObject('Object Repository/Customers_and_Projects/Add_Customers_Projects/Page_OrangeHRM/button_Save'))

// Add a delay to ensure the process completes
WebUI.comment('Adding a final 2-second delay to ensure the process completes.')
WebUI.delay(2)

// Add an additional delay for confirmation
WebUI.comment('Adding another 2-second delay for confirmation.')
WebUI.delay(2)