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

WebUI.openBrowser('file:///Users/bayuwirab/Documents/CODE/learn-SDET/course-api-framework-python/sample%20sites/learnks1-home.html')

WebUI.delay(1)

WebUI.click(findTestObject('Sample Sites handling alerts and iframe/Home Page/button_Open an ALERT box'))

if (WebUI.waitForAlert(5)) {
    println(WebUI.getAlertText())

    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Sample Sites handling alerts and iframe/Home Page/button_Open a CONFIRM box'))

if (WebUI.waitForAlert(3)) {
	
    println(WebUI.getAlertText())

    WebUI.dismissAlert()
}

WebUI.verifyElementText(findTestObject('Object Repository/Sample Sites handling alerts and iframe/Home Page/span_Confirmation Alert'), 
    'You pressed Cancel!')

WebUI.click(findTestObject('Sample Sites handling alerts and iframe/Home Page/button_Open a PROMPT box'))

WebUI.setAlertText('Test Prompt')

if (WebUI.waitForAlert(3)) {
	
    println(WebUI.getAlertText())
	
    WebUI.acceptAlert()
}

WebUI.verifyElementText(findTestObject('Sample Sites handling alerts and iframe/Home Page/span_ppromptButtonResponse'), 
    'Hello Test Prompt, how are you today?')

WebUI.delay(3)

WebUI.closeBrowser()

