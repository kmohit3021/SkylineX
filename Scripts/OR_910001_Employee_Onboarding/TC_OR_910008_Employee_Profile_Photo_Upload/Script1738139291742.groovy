import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.support.Color as Color
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Open the browser
WebUI.comment('Opening the browser.')

WebUI.openBrowser('')

// Navigate to the OrangeHRM login page
WebUI.comment('Navigating to the OrangeHRM login page.')

WebUI.navigateToUrl('http://orange.katalon.com/web/index.php/auth/login')

WebUI.maximizeWindow()

// Enter the username
WebUI.comment('Entering the username.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/input_Username_username'), 
    GlobalVariable.Username)

// Enter the password
WebUI.comment('Entering the password.')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/input_Password_password'), 
    GlobalVariable.Password)

// Click the login button
WebUI.comment('Clicking the login button.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/button_Login'))

// Navigate to the PIM module
WebUI.comment('Navigating to the PIM module.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/a_PIM'))

// Search for the employee by name
WebUI.comment('Searching for the employee by name.')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/input'), 
    'Sandra Barber')

// Click the search button
WebUI.comment('Clicking the search button.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/button_Search'))

// Select the employee from the search results
WebUI.comment('Selecting the employee from the search results.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/div_10010'))

String Employee_Gender = CustomKeywords.'orangehrm.OrangeUtility.verifyGender'()

// Open the employee's profile photo section
WebUI.comment('Opening the employee profile photo section.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/img_Alice Johnson_employee-image'))

// Click the upload button to upload a new photo
WebUI.comment('Clicking the upload button to upload a new profile photo.')

// Determine the file path based on employee gender
WebUI.comment('Determining the file path for the profile photo based on the employee gender.')

String filePath

if (Employee_Gender == 'Male') {
    WebUI.comment('The employee is male; using the male avatar file.')

    filePath = (RunConfiguration.getProjectDir() + '/UploadFiles/man.png' // Replace with the actual file path
    // Replace with the actual file path
    )
} else {
    WebUI.comment('The employee is female; using the female avatar file.')

    filePath = (RunConfiguration.getProjectDir() + '/UploadFiles/woman.png')
}

WebUI.comment('Uploading the profile photo file.')

WebUI.uploadFile(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/file_input_locator'), 
    filePath)

WebUI.comment('Adding a 2-second delay to observe the file upload.')

WebUI.delay(2)

// Save the uploaded profile photo
WebUI.comment('Clicking the Save button to save the uploaded profile photo.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Profile_Photo_Upload_Objects/Page_OrangeHRM/button_Save'))

// Add a delay to observe the changes
WebUI.comment('Adding a 5-second delay to observe the saved changes.')

WebUI.delay(5)

// Close the browser
WebUI.comment('Closing the browser.')