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

WebUI.comment('Open the browser')
WebUI.openBrowser('')

WebUI.comment('Navigate to the application URL')
WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.comment('Maximize the browser window')
WebUI.maximizeWindow()

WebUI.comment('Enter username')
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/input_Username_username'), Employee_Username)

WebUI.comment('Enter encrypted password')
WebUI.setEncryptedText(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/input_Password_password'), Employee_Password)

WebUI.comment('Click the Login button')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/button_Login'))

WebUI.comment('Navigate to the Time module')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/a_Time'))

WebUI.comment('Expand the Attendance dropdown')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/i_Attendance_oxd-icon bi-chevron-down'))

WebUI.comment('Click on the Punch In/Out option')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/a_Punch InOut'))

WebUI.comment('Enter a note for Punch-out')
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'), 'Punch-out for the day. Completed today’s tasks.')

WebUI.comment('Click the Punch In button')
WebUI.click(findTestObject('Object Repository/Employee_Time_Module/PunchIn/Page_OrangeHRM/button_In'))

WebUI.comment('Wait for 2 seconds to observe the changes')
WebUI.delay(2)

WebUI.comment('Close the browser')
WebUI.closeBrowser()
