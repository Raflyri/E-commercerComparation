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

WebUI.navigateToUrl('https://www.jd.id/')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.navigateToUrl('https://ulogin.jd.id/pc/new/login?ReturnUrl=https%3A%2F%2Fwww.jd.id%2F')

WebUI.setText(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/input'), 
    'raflyrizkyinriawan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/input_1'), 
    'FhGOQJ2Pd3fuWjJkXP7UmA==')

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/div_Masuk'))

WebUI.delay(20)

//WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/span_Kirim kode'))
//WebUI.delay(15, FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/div_Lanjutkan'))
WebUI.navigateToUrl('https://www.jd.id/product/logitech-b170-wireless-mouse-black_10114590/100262336.html?keyword=logitech')

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_Jual LOGITECH B170 Wireless Mouse - Bl_93565d/span_Masukkan Ke Troli'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_Troli/a_Checkout'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_Konfirmasi pesanan/a_Bayar'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_Konfirmasi pesanan/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.id Spesialis online shopping anda u_b25e83/div_Bank Transfer  Check Promo supported bank card'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.id Spesialis online shopping anda u_b25e83/div_Pilih Bank_bg-list-item'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.id Spesialis online shopping anda u_b25e83/a_Bayar Rp 96,500'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Buy Item/Page_JD.id Spesialis online shopping anda u_b25e83/a_Beranda'))

WebUI.delay(5)

WebUI.closeBrowser()

