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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Cura Healthcare Service Website/Home Page/a_Make Appointment'))

WebUI.setText(findTestObject('Cura Healthcare Service Website/Login Page/input_Username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Cura Healthcare Service Website/Login Page/input_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Cura Healthcare Service Website/Login Page/button_Login'))

WebUI.selectOptionByValue(findTestObject('Cura Healthcare Service Website/Appointment Page/select_Tokyo CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Cura Healthcare Service Website/Appointment Page/input_Apply For Hospital Readmission'))

WebUI.click(findTestObject('Cura Healthcare Service Website/Appointment Page/input_Medicaid Programs'))

WebUI.click(findTestObject('Cura Healthcare Service Website/Appointment Page/div_Visit Date'))

WebUI.click(findTestObject('Cura Healthcare Service Website/Appointment Page/td_31'))

WebUI.setText(findTestObject('Cura Healthcare Service Website/Appointment Page/textarea_Comment'), 'Booking Doctor\'s Appointment')

WebUI.click(findTestObject('Cura Healthcare Service Website/Appointment Page/button_Book Appointment'))

WebUI.click(findTestObject('Cura Healthcare Service Website/Confirmation Page/a_Go to Homepage'))

WebUI.closeBrowser()

