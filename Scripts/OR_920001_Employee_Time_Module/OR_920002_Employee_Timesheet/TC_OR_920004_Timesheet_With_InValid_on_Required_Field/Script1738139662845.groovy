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
import org.openqa.selenium.WebElement as WebElement

// Open the browser
WebUI.comment('Opening the browser...')

WebUI.openBrowser('')

// Navigate to the application URL
WebUI.comment('Navigating to the application URL...')

WebUI.navigateToUrl(GlobalVariable.URL)

// Set username
WebUI.comment('Entering username...')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Username_username'), 
    UserName)

// Set password
WebUI.comment('Entering password...')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Password_password'), 
    UserPassword)

// Click login
WebUI.comment('Clicking the login button...')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Login'))

// Navigate to Time Module
WebUI.comment('Navigating to the Time module...')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/a_Time'))

// Navigate to Timesheets
WebUI.comment('Navigating to Timesheets...')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/li_Timesheets'))

// Navigate to My Timesheets
WebUI.comment('Navigating to My Timesheets...')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/li_My Timesheets'))

// Open calendar
WebUI.comment('Opening the calendar...')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/i_My Timesheet_oxd-icon bi-calendar oxd-dat_09406c'))

// Click today's date
WebUI.comment('Selecting today\'s date...')

WebUI.click(findTestObject('Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/calander_today_link'))

// Check if the 'Create Timesheet' button exists
WebUI.comment('Checking if the "Create Timesheet" button exists...')

Boolean isCreateButtonExist = WebUI.verifyElementPresent(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Create Timesheet'), 
    2, FailureHandling.OPTIONAL)

if (isCreateButtonExist) {
    WebUI.comment('Create Timesheet button found. Clicking on it...')

    WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Create Timesheet'))

    WebUI.delay(2)

    WebUI.comment('Clicking the Edit button...')

    WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Edit'))
} else {
    WebUI.comment('Edit button found. Clicking on it...')

    WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Edit'))
}

WebUI.delay(2)

// Check if company field is empty
WebUI.comment('Checking if the company text field is empty...')

Boolean companyTextEmpty = CustomKeywords.'orangehrm.OrangeUtility.isTextEmpty'(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'))

println('companyTextEmpty: ' + companyTextEmpty)

if (companyTextEmpty) {
    WebUI.comment('Setting company name as "Accenture"...')

    WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'), 'Accenture')

    WebUI.comment('Searching company name...')

    WebUI.click(findTestObject('Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/SearchBox'))

    WebUI.delay(2)

    WebUI.comment('Selecting the dropdown...')

    WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/SearchBox'))

    WebUI.delay(2)
}

// Fill input boxes with 8 hours if empty
WebUI.comment('Filling input boxes with 8 hours if they are empty...')

for (int i = 1; i <= 5; i++) {
    TestObject inputBox = new TestObject()

    inputBox.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, "(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[$i]")

    Boolean isHoursFilled = CustomKeywords.'orangehrm.OrangeUtility.isTextEmpty'(inputBox)

    println((('isHoursFilled: ' + isHoursFilled) + ' - ') + i)

    if (isHoursFilled) {
        WebUI.comment("Filling input box $i with 8 hours...")

        WebUI.setText(inputBox, '33')
		
		//////
		
		
		// Wait for 1 second
		WebUI.comment('Waiting for 1 second to allow validation')
		
		WebUI.delay(1)
		
		// Check if the error message is present
		WebUI.comment('Checking if the invalid data error message is present')
		
		boolean isElementPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/span_Should Be Less Than 24 and in HHMM or _0b674a'),
			0, FailureHandling.OPTIONAL)
		
		if (isElementPresent) {
			// If element exists, get the error message
			WebUI.comment('Error message found, fetching its text')
		
			String text = WebUI.getText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/span_Should Be Less Than 24 and in HHMM or _0b674a'),
				FailureHandling.OPTIONAL)
		
			KeywordUtil.markFailed('Invalid data error message EXIST')
		
			println('Invalid data error message: ' + text // If element does not exist, log the absence
				)
		} else {
			WebUI.comment('No error message found')
		
			KeywordUtil.markPassed('Invalid data message not exist.')
		
			println('Invalid data message not exist.')
		}
		
		
		//////
    }
}

// Save the timesheet
WebUI.comment('Saving the timesheet...')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Submit'))

WebUI.delay(2)

WebUI.comment('Timesheet process completed successfully.')

WebUI.closeBrowser()

