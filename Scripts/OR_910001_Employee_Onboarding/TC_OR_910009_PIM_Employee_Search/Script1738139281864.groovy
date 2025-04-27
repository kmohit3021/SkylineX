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

