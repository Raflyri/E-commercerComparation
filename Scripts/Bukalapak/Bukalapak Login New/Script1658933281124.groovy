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

WebUI.navigateToUrl('https://www.bukalapak.com/')

WebUI.click(findTestObject('Object Repository/Bukalapak Login New/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_Login'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login New/Page_Login ke Akun  Bukalapak/div_Nomor handphone atau email'))

WebUI.setText(findTestObject('Object Repository/Bukalapak Login New/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    'raflyrizkyinriawan@gmail.com')

WebUI.click(findTestObject('Object Repository/Bukalapak Login New/Page_Login ke Akun  Bukalapak/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login New/Page_Login ke Akun  Bukalapak/div_Whatsappdikirim ke --0136'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login New/Page_Login ke Akun  Bukalapak/div_Kode rahasia'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login New/Page_Login ke Akun  Bukalapak/div_Kode rahasia'))

WebUI.setText(findTestObject('Object Repository/Bukalapak Login New/Page_Login ke Akun  Bukalapak/input_Nomor hilang atau tidak aktif_bl-text_eb5b69'), 
    '56784')

WebUI.click(findTestObject('Object Repository/Bukalapak Login New/Page_Login ke Akun  Bukalapak/button_Verifikasi'))

WebUI.closeBrowser()

