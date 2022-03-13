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

WebUI.navigateToUrl('file:///Users/bayuwirab/Documents/CODE/learn-SDET/course-api-framework-python/sample%20sites/learnks1-home.html')

WebUI.switchToFrame(findTestObject('Sample Sites handling alerts and iframe/Home Page/Personal Info Frame/iframe_LOGIN_personalInfoFrame (1)'), 
    30, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Sample Sites handling alerts and iframe/Home Page/Personal Info Frame/input_Frame 1  Personal Info_firstName (1)'), 
    'Bayu Wira')

WebUI.setText(findTestObject('Object Repository/Sample Sites handling alerts and iframe/Home Page/Address Info Frame/input_Frame 1  Personal Info_lastName'), 
    'Brata')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Sample Sites handling alerts and iframe/Home Page/Address Info Frame/iframe_LOGIN_addressInfoFrame'), 
    0)

WebUI.setText(findTestObject('Sample Sites handling alerts and iframe/Home Page/Address Info Frame/input_Frame 2 Address_streetAddress'), 
    'Jalan')

WebUI.setText(findTestObject('Sample Sites handling alerts and iframe/Home Page/Address Info Frame/input_Frame 2  Address_addressLine2'), 
    'Singaraja')

WebUI.setText(findTestObject('Sample Sites handling alerts and iframe/Home Page/Address Info Frame/input_Frame 2 Address_postCode'), 
    '81119')

WebUI.delay(3)

WebUI.closeBrowser()

