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

WebUI.callTestCase(findTestCase('Usables/OpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/CookieSection/button_prihlasit'))

WebUI.verifyElementPresent(findTestObject('AccountPage_login/LoginSection/h1_Pihlen'), 2)

WebUI.verifyElementText(findTestObject('AccountPage_login/LoginSection/h1_Pihlen'), 'Přihlášení')

WebUI.setText(findTestObject('AccountPage_login/LoginSection/input_email'), email)

WebUI.setText(findTestObject('AccountPage_login/LoginSection/input_password'), password)

WebUI.click(findTestObject('AccountPage_login/LoginSection/button_prihlasit'))

WebUI.verifyElementText(findTestObject('AccountPage_login/LoginSection/span_Neplatn uivatelsk jmno nebo heslo'), 'Neplatné uživatelské jméno nebo heslo')

WebUI.delay(3)

WebUI.closeBrowser()

