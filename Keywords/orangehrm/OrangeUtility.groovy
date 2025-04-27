package orangehrm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

public class OrangeUtility {

	/**
	 * Validating if the text of a web element not empty.
	 * @param testObject - The Test Object of the web element
	 * @return boolean - true if the text matches, false otherwise
	 */
	@Keyword
	def boolean isTextEmpty(TestObject testObject) {

		String actualText = WebUI.getAttribute(testObject, 'value')

		if (actualText != '') {
			WebUI.comment("Validation failed: Text has value '${actualText}'")
			return false
		} else {
			WebUI.comment("Validation passed: Text has no value '${actualText}'")
			return true
		}
	}

	/**
	 * Validating if the text of a web element matches the expected value.
	 * @param testObject - The Test Object of the web element
	 * @param expectedText - The expected text value
	 * @return boolean - true if the text matches, false otherwise
	 */
	@Keyword
	def boolean validateText(TestObject testObject, String expectedText) {

		String actualText = WebUI.getAttribute(testObject, 'value')

		if (actualText == expectedText) {
			WebUI.comment("Validation passed: Text matches '${expectedText}'")
			return true
		} else {
			WebUI.comment("Validation failed: Expected '${expectedText}', but found '${actualText}'")
			return false
		}
	}
}
