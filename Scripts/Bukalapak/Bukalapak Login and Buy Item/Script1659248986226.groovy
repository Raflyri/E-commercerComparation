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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_Login'))

WebUI.setText(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    'raflyrizkyinriawan@gmail.com')

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Login ke Akun  Bukalapak/button_Lanjut'))

WebUI.click(findTestObject('Bukalapak Login and Buy Item 2/Page_Login ke Akun  Bukalapak/p_Whatsapp'))

WebUI.delay(15, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.bukalapak.com/p/komputer/grosir-komputer/4h425l7-jual-mouse-logitech-g603-light-speed-wireless-gaming-mouse-garansi-resmi?from=list-product&pos=1&keyword=logitech%20g603&funnel=omnisearch&product_owner=normal_seller&cf=1&ssa=0&sort_origin=weekly_sales_ratio%3Adesc&search_sort_default=false&promoted=0&search_query_id=c56409d9d1492e449ad2f06da9eebc6c_301542_1658650557309&acf=1')

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Jual Mouse Logitech G603 Light Speed W_aadd98/button_Masukkan Keranjang'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Jual Mouse Logitech G603 Light Speed W_aadd98/button_Lihat Keranjang'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Keranjang Belanja Anda - Ayo Jual Beli Online/input'))
WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Keranjang Belanja Anda - Ayo Jual Beli Online/button_Lanjut ke Pembayaran'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/button_Pilih metode bayar'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_Virtual Account'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/div_-- Pilih --'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/div_BCA'))

WebUI.click(findTestObject('Object Repository/Bukalapak Login and Buy Item 2/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/span_Bayar dengan Virtual Account'))

WebUI.delay(5)

WebUI.closeBrowser()

