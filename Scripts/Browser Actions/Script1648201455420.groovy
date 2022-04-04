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

WebUI.navigateToUrl('file:///Users/bhagyesh/Downloads/Download-Sample-Site/learnks1-home.html')

WebUI.setText(findTestObject('Object Repository/Browser Actions/Page_LearnKS Home/input_Frame 1  Personal Info_firstName'), 
    'Bhagyesh')

WebUI.setText(findTestObject('Object Repository/Browser Actions/Page_LearnKS Home/input_Frame 1  Personal Info_lastName'), 
    'Nanwani')

WebUI.setText(findTestObject('Object Repository/Browser Actions/Page_LearnKS Home/input_Frame 2  Address_streetAddress'), 
    'Las Street')

WebUI.setText(findTestObject('Object Repository/Browser Actions/Page_LearnKS Home/input_Frame 2  Address_addressLine2'), 
    'FL Tower')

WebUI.setText(findTestObject('Object Repository/Browser Actions/Page_LearnKS Home/input_Frame 2  Address_postCode'), '340982')

WebUI.click(findTestObject('Object Repository/Browser Actions/Page_LearnKS Home/a_LOGIN'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(4)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.closeBrowser()

request = WS.sendRequest(findTestObject('Get User'))

response = WS.sendRequest(findTestObject('REST User Operations/Get User'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'data.last_name', 'Weaver')



