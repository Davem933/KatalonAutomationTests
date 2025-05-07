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

WebUI.click(findTestObject('HomePage_LoginPage/SideMenu_categorie/sidemenu'))

WebUI.click(findTestObject('HomePage_LoginPage/SideMenu_categorie/a_Notebooky'))

WebUI.click(findTestObject('HomePage_LoginPage/SideMenu_categorie/Text_notebooky'))

WebUI.verifyElementText(findTestObject('HomePage_LoginPage/SideMenu_categorie/Text_notebooky'), 'Notebooky')

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://www.alza.cz/notebooky/18842920.htm')

WebUI.closeBrowser()

