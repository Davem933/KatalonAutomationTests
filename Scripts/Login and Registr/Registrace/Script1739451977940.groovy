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

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('HomePage/CookieSection/cookie_accept'))

WebUI.click(findTestObject('HomePage/CookieSection/button_prihlasit'))

WebUI.verifyElementText(findTestObject('HomePage/LoginSection/Button_nova_registrace'), 'Nová registrace')

WebUI.click(findTestObject('HomePage/LoginSection/Button_nova_registrace'))

WebUI.sendKeys(findTestObject('RegistrPage/Registr_formular/input_prihlasovaci_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(5)

WebUI.setText(findTestObject('RegistrPage/Registr_formular/input_prihlasovaci_email'), email)

WebUI.setEncryptedText(findTestObject('RegistrPage/Registr_formular/input_Password'), 'BDea9yExMh9/SJ70UaR6Gg==')

WebUI.setEncryptedText(findTestObject('RegistrPage/Registr_formular/input_potvrzeni_hesla'), 'BDea9yExMh9/SJ70UaR6Gg==')

WebUI.setText(findTestObject('RegistrPage/Registr_formular/input_Telefon'), '720 777 666')

WebUI.scrollToElement(findTestObject('RegistrPage/Registr_formular/button_ulozit_formular_registrace'), 3)

WebUI.click(findTestObject('RegistrPage/Registr_formular/button_ulozit_formular_registrace'))

