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

WebUI.maximizeWindow()

WebUI.navigateToUrl('file:///Users/bayuwirab/Documents/CODE/learn-SDET/course-api-framework-python/sample%20sites/learnks1-home.html')

WebUI.click(findTestObject('Sample Sites handling alerts and iframe/Home Page/a_LOGIN'))

WebUI.switchToWindowTitle('LearnKS Log in')

WebUI.setText(findTestObject('Sample Sites handling alerts and iframe/Login Page/input_Log in_userName'), 'adminTest')

WebUI.setEncryptedText(findTestObject('Sample Sites handling alerts and iframe/Login Page/input_Log in_password'), 'MDqz8hE2zEXL0RLtB/SuEw==')

WebUI.click(findTestObject('Sample Sites handling alerts and iframe/Login Page/button_Login'))

WebUI.switchToWindowTitle('Page Submitted')

WebUI.verifyElementText(findTestObject('Sample Sites handling alerts and iframe/Page Submitted Page/h1_Page Submitted'), 
    'Page Submitted')

WebUI.closeWindowIndex('1')

WebUI.delay(3)

WebUI.closeBrowser()

