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

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_Login'))

WebUI.setText(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    'raflyrizkyinriawan@gmail.com')

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/span_Lanjut'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/p_Whatsapp'))

WebUI.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.bukalapak.com/p/motor-471/aksesoris-motor/led-hid-bohlam/4g3ksog-jual-lampu-led-tembak-sorot-laser-2-warna-original-luminos-q2?from=category&section=reco')

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Jual LAMPU LED TEMBAK SOROT LASER 2 WA_0c2bb5/button_Beli Sekarang'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/span_Pilih metode bayar'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/input_Terakhir kamu pakai_payment-category'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_-- Pilih --'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_BCA'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/span_Bayar dengan Virtual Account'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/a_Lihat Detail Pesanan'))

WebUI.closeBrowser()

