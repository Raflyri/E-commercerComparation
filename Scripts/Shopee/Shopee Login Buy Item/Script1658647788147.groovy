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

WebUI.navigateToUrl('https://shopee.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Shopee Login and Checkout/Page_Login sekarang untuk mulai berbelanja _a6a865/input_Log in dengan QR_loginKey'), 
    'raflyrizkyinriawan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Shopee Login and Checkout/Page_Login sekarang untuk mulai berbelanja _a6a865/input_Log in dengan QR_password'), 
    'FhGOQJ2Pd3fuWjJkXP7UmA==')

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Login sekarang untuk mulai berbelanja _a6a865/button_Log in'))

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Verifikasi melalui link'))

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_OK'))

WebUI.delay(20)

WebUI.navigateToUrl('https://shopee.co.id/Logitech-G603-Lightspeed-Mouse-Gaming-Wireless-Bluetooth-i.39400356.820590661?sp_atk=676d8ec6-c468-4510-875d-b52b87dd51a9&xptdk=676d8ec6-c468-4510-875d-b52b87dd51a9')

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Jual Logitech G603 Lightspeed Mouse Ga_3f7b52/button_masukkan keranjang'))

WebUI.navigateToUrl('https://shopee.co.id/cart')

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Keranjang Belanja/div_Logitech G Official Shop_stardust-check_cb5604'))

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Keranjang Belanja/span_checkout'))

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_Transfer Bank'))

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Bank BCA (Dicek Otomatis)Hanya menerima_4fa77a'))

WebUI.click(findTestObject('Object Repository/Shopee Login and Checkout/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_Buat Pesanan'))

WebUI.doubleClick(findTestObject('Object Repository/Shopee Login and Checkout/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Buat Pesanan_loading-spinner-popup'))

WebUI.delay(20)

WebUI.closeBrowser()

