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

WebUI.navigateToUrl('https://www.klikindomaret.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_Klik Indomaret, Easy  Safe Online Shopping/a_Masuk  Daftar'))

WebUI.setText(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_KlikIndomaret, Easy  Safe Online Shopping/input_Masuk_Email'), 
    'raflyrizkyinriawan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_KlikIndomaret, Easy  Safe Online Shopping/input_Masuk_Password'), 
    'FhGOQJ2Pd3fuWjJkXP7UmA==')

WebUI.click(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_KlikIndomaret, Easy  Safe Online Shopping/button_Submit'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.klikindomaret.com/product/modem-wifi-4g-hgspeed-telkoms')

WebUI.click(findTestObject('Klik Indomaret Login and Checkout Item/Page_TELKOMSEL ORBIT PRO 2 MODEM WIFI 4G HIGH SPEED BONUS DATA 150GB  KlikIndomaret/a_Oke Mengerti'))

WebUI.click(findTestObject('Klik Indomaret Login and Checkout Item/Page_TELKOMSEL ORBIT PRO 2 MODEM WIFI 4G HIGH SPEED BONUS DATA 150GB  KlikIndomaret/button_Beli'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_Rapoo M10 PLUS E WHITE  KlikIndomaret/img_Produk Virtual_loading'))

WebUI.navigateToUrl('https://www.klikindomaret.com/checkout')

WebUI.click(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_Klik Indomaret, Easy  Safe Online Shopping/button_Pilih Opsi Pengiriman'))

WebUI.click(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_Klik Indomaret, Easy  Safe Online Shopping/button_Bayar'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_Klik Indomaret, Easy  Safe Online Shopping/div_Transfer BankBCA Virtual Account'))

WebUI.click(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_Klik Indomaret, Easy  Safe Online Shopping/button_Bayar Sekarang'))

WebUI.click(findTestObject('Object Repository/Klik Indomaret Login and Checkout Item/Page_Klik Indomaret, Easy  Safe Online Shopping/div_Kode Pembayaran'))

WebUI.delay(5)

WebUI.closeBrowser()

