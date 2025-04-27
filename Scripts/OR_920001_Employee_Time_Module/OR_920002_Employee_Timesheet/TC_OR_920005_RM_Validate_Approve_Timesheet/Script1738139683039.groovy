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

// Clicking on the 'Time' menu link
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Validate_and_Reject_Approve/Page_OrangeHRM/a_Time'))

// Clicking on the 'View' button
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Validate_and_Reject_Approve/Page_OrangeHRM/button_View'))

// Verifying if the 'Approve' button exists within 2 seconds
Boolean isRejectButtonExist = WebUI.verifyElementPresent(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Validate_and_Reject_Approve/Page_OrangeHRM/button_Approve'),
	2, FailureHandling.OPTIONAL)

// Conditional check if the 'Approve' button exists
if (isRejectButtonExist) {
	// Adding a 5-second delay
	WebUI.delay(5)

	// Comment indicating the 'Approve' button exists
	WebUI.comment('Approve button exist.')

	// Clicking on the 'Approve' button
	WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Validate_and_Reject_Approve/Page_OrangeHRM/button_Approve'))
} else {
	// Comment indicating the 'Approve' button does not exist
	WebUI.comment('Approve button does not exist.')
}

// Adding a 5-second delay
WebUI.delay(5)

// Closing the browser
WebUI.closeBrowser()
