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

// Open the browser
WebUI.comment('Step 1: Open a new browser instance')

WebUI.openBrowser('')

// Navigate to the login page of OrangeHRM
WebUI.comment('Step 2: Navigate to the OrangeHRM login page')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

// Enter the username in the username field
WebUI.comment('Step 3: Enter the username into the username input field')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Username_username'), GlobalVariable.Username)

// Enter the password in the password field (encrypted)
WebUI.comment('Step 4: Enter the encrypted password into the password input field')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Password_password'), GlobalVariable.Password)

// Click the login button
WebUI.comment('Step 5: Click the login button to submit the login form')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/button_Login'))

