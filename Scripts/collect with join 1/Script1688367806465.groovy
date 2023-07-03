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

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/p_Sales'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/p_Recurring payments'))

WebUI.click(findTestObject('Object Repository/Page_Recurring payments  nopCommerce admini_ef123c/p_Customers'))

WebUI.click(findTestObject('Object Repository/Page_Recurring payments  nopCommerce admini_ef123c/p_Activity Types'))

WebUI.click(findTestObject('Object Repository/Page_Activity Types  nopCommerce administration/p_Vendors'))

WebUI.click(findTestObject('Object Repository/Page_Vendors  nopCommerce administration/p_Online customers'))

WebUI.click(findTestObject('Object Repository/Page_Online customers  nopCommerce administration/a_Guest'))

WebUI.click(findTestObject('Object Repository/Page_Edit customer details  nopCommerce adm_ee9a0c/a_Logout'))

WebUI.closeBrowser()

