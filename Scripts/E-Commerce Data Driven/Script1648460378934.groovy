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

WebUI.navigateToUrl('https://bstackdemo.com/')

WebUI.click(findTestObject('Object Repository/E-Commerce Data Driven/Page_StackDemo/a_Sign In'))

WebUI.click(findTestObject('Object Repository/E-Commerce Data Driven/Page_StackDemo/div_Select Username'))

WebUI.setText(findTestObject('Object Repository/E-Commerce Data Driven/Page_StackDemo/input_d_react-select-2-input'), tcUsername)

WebUI.sendKeys(findTestObject('Object Repository/E-Commerce Data Driven/Page_StackDemo/input_d_react-select-2-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/E-Commerce Data Driven/Page_StackDemo/div_Select Password'))

WebUI.setText(findTestObject('Object Repository/E-Commerce Data Driven/Page_StackDemo/input_demouser_react-select-3-input'), 
    tcPassword)

WebUI.sendKeys(findTestObject('Object Repository/E-Commerce Data Driven/Page_StackDemo/input_demouser_react-select-3-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/E-Commerce Data Driven/Page_StackDemo/button_Log In'))

WebUI.closeBrowser()

