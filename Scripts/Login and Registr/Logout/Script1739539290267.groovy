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

WebUI.callTestCase(findTestCase('Login and Registr/Login'), [('email') : 'david.minarik1993@gmail.com', ('password') : 'Qwertf993'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage_LoginPage/UseradminSection/button_moje_alza'))

WebUI.verifyElementText(findTestObject('HomePage_LoginPage/UseradminSection/button_logout'), 'Odhlásit se')

WebUI.click(findTestObject('HomePage_LoginPage/UseradminSection/button_logout'))

url = WebUI.getUrl()

def url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://www.alza.cz/?logoutSuccess=1')

WebUI.verifyElementPresent(findTestObject('HomePage/CookieSection/button_prihlasit'), 3)

