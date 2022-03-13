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

for (int row=1; row<=findTestData('Test Data User Account Internal Data').getRowNumbers();row++) {
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl(GlobalVariable.TestAutomationUrl)
	
	WebUI.click(findTestObject('Home Page/button_Sign in'))
	
	WebUI.setText(findTestObject('Login Page/Login Section/input_Email address_email'), findTestData('Test Data User Account').getValue(1, row))
	
	WebUI.setText(findTestObject('Login Page/Login Section/input_Password_passwd'), findTestData('Test Data User Account').getValue(2, row))
	
	WebUI.click(findTestObject('Login Page/Login Section/button_Sign in'))
	
	WebUI.closeBrowser()
	
}
