package forautomationpractice

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

import internal.GlobalVariable

public class User {
	/**
		* Login to automationpractice.com and use account default
		* @param user email address
		* @param user password
	*/
	@Keyword	
	def login(String emailAddress, String password) {
		WebUI.navigateToUrl(GlobalVariable.TestAutomationUrl)
		WebUI.click(findTestObject('Home Page/button_Sign in'))
		WebUI.setText(findTestObject('Login Page/Login Section/input_Email address_email'), emailAddress)
		WebUI.setText(findTestObject('Login Page/Login Section/input_Password_passwd'), password)
		WebUI.click(findTestObject('Login Page/Login Section/button_Sign in'))
	}
	
	/** 
	 * Logout from current user account 
	 * */
	@Keyword
	def logout() {
		WebUI.navigateToUrl(GlobalVariable.TestAutomationUrl)
	}
}
