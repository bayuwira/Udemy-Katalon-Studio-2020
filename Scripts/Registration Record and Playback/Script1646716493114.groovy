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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.setText(findTestObject('Login Page/Registration Section/input_Email address_email_create'), 'bayuwira@test.com')

WebUI.click(findTestObject('Login Page/Registration Section/button_Create an account'))

WebUI.click(findTestObject('Registration Page/Personal Information Section/input_gender Mr'))

WebUI.setText(findTestObject('Registration Page/Personal Information Section/input__customer_firstname'), 'Bayu')

WebUI.setText(findTestObject('Registration Page/Personal Information Section/input__customer_lastname'), 'Wira')

WebUI.setEncryptedText(findTestObject('Registration Page/Personal Information Section/input__passwd'), '5xx1bkCcAlw=')

WebUI.selectOptionByValue(findTestObject('Registration Page/Personal Information Section/select_dob days'),
	'1', true)

WebUI.selectOptionByValue(findTestObject('Registration Page/Personal Information Section/select_dob months'),
	'1', true)

WebUI.selectOptionByValue(findTestObject('Registration Page/Personal Information Section/select_dob years'),
	'1999', true)

WebUI.click(findTestObject('Registration Page/Personal Information Section/checkbox_Sign Up_newsletter'))

WebUI.click(findTestObject('Registration Page/Personal Information Section/checkbox_Partners Special Offer'))

WebUI.setText(findTestObject('Registration Page/Address Section/input__address1'), 'address on email')

WebUI.setText(findTestObject('Registration Page/Address Section/input_Company_company'), 'Tokped')

WebUI.setText(findTestObject('Registration Page/Address Section/input_Address (Line 2)_address2'), 'nimo')

WebUI.setText(findTestObject('Registration Page/Address Section/input__city'), 'Denpasar')

WebUI.selectOptionByValue(findTestObject('Registration Page/Address Section/select_states'),
	'2', true)

WebUI.setText(findTestObject('Registration Page/Address Section/input__postcode'), '80354')

WebUI.setText(findTestObject('Registration Page/Address Section/textarea_Additional information_other'), 'no additional information')

WebUI.setText(findTestObject('Registration Page/Address Section/input_Home phone_phone'), '085085085085')

WebUI.setText(findTestObject('Registration Page/Address Section/input__phone_mobile'), '085085085085')

WebUI.setText(findTestObject('Registration Page/Address Section/input__alias'), 'My address yes')

WebUI.click(findTestObject('Registration Page/button_Register'))

WebUI.click(findTestObject('My Account Page/span_My personal information'))

WebUI.closeBrowser()