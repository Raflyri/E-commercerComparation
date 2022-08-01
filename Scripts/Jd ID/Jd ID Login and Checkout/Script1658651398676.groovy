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

WebUI.navigateToUrl('https://www.jd.id')

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/s_Ambil Segera_close'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/button_Nanti Dulu'))

WebUI.navigateToUrl('https://ulogin.jd.id/pc/new/login?ReturnUrl=https%3A%2F%2Fwww.jd.id%2F')

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/div_SMS_inputAccountPanel'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/input'))

WebUI.setText(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/input'), 
    'raflyrizkyinriawan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/input_1'), 
    'FhGOQJ2Pd3fuWjJkXP7UmA==')

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/span_SMS_off'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.ID  Toko Online Terpercaya Indonesi_743705/div_Masuk'))

WebUI.delay(15)

WebUI.navigateToUrl('https://www.jd.id/product/logitech-g603-wireless-gaming-mouse_10161538/100366251.html?keyword=logitech%20g603')

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_Jual LOGITECH G603 Wireless Gaming Mou_e29620/span_Masukkan Ke Troli'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_Troli/a_Checkout'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_Konfirmasi pesanan/div_Online Payment'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_Konfirmasi pesanan/a_Bayar'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_Konfirmasi pesanan/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.id Spesialis online shopping anda u_b25e83/span_Bank Transfer'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.id Spesialis online shopping anda u_b25e83/img'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.id Spesialis online shopping anda u_b25e83/div_Pilih Bank_bg-list-item'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.id Spesialis online shopping anda u_b25e83/a_Bayar Rp 659,000'))

WebUI.click(findTestObject('Object Repository/Jd ID Login and Checkout/Page_JD.id Spesialis online shopping anda u_b25e83/div_Nomor Rekening 7210203407898685'))

WebUI.delay(20)

WebUI.closeBrowser()

