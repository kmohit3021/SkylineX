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

// Open browser
WebUI.comment('Opening the browser')
WebUI.openBrowser('')

// Navigate to OrangeHRM login page
WebUI.comment('Navigating to the application URL')
WebUI.navigateToUrl(GlobalVariable.URL)

// Enter username
WebUI.comment('Entering the Employee Username')
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/input_Username_username'), Employee_Username)

// Enter password
WebUI.comment('Entering the Employee Password')
WebUI.setEncryptedText(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/input_Password_password'),
	Employee_Password)

// Click Login button
WebUI.comment('Clicking on Login button')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/button_Login'))

// Navigate to Time module
WebUI.comment('Navigating to Time module')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/a_Time'))

// Expand Attendance dropdown
WebUI.comment('Expanding Attendance dropdown')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/i_Attendance_oxd-icon bi-chevron-down'))

// Click on Punch In/Out option
WebUI.comment('Selecting Punch In/Out option')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/a_Punch InOut'))

// Enter note for punch-in
WebUI.comment('Entering a note for Punch-in')
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'),
	'Punch-in for the day. Ready to start the tasks!')

// Click on Punch In button
WebUI.comment('Clicking on Punch In button')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/button_In'))

// Wait for 2 seconds
WebUI.comment('Waiting for 2 seconds before closing the browser')
WebUI.delay(2)
