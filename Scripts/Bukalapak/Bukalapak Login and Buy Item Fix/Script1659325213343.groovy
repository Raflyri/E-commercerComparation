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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.bukalapak.com/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_Login'))

WebUI.setText(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    'raflyrizkyinriawan@gmail.com')

WebUI.doubleClick(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/body_Login dulu, yuk   Nomor handphone atau_9e35f4'))

WebUI.doubleClick(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/p_Whatsapp'))

WebUI.delay(20)

//WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/input_Nomor hilang atau tidak aktif_bl-text_eb5b69'))

//WebUI.setText(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/input_Nomor hilang atau tidak aktif_bl-text_eb5b69'),'78380')

//WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Login ke Akun  Bukalapak/button_Verifikasi'))

WebUI.navigateToUrl('https://www.bukalapak.com/p/komputer/aksesoris-226/mouse/4gpzgha-jual-mouse-komputer-laptop-foomee-va13-ergonomic-design-mouse-wired-1200-dpi-1-7m-usb-cable-mouse-gaming-cctv-dvr-home-theater?from=homepage&source=fvt&panel=2&type=recommendation')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Jual Mouse Komputer Laptop Foomee VA13_e2dd16/button_Masukkan Keranjang'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Jual Mouse Komputer Laptop Foomee VA13_e2dd16/button_Lihat Keranjang'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Keranjang Belanja Anda - Ayo Jual Beli Online/input'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Keranjang Belanja Anda - Ayo Jual Beli Online/button_Lanjut ke Pembayaran'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/button_Pilih metode bayar'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_Virtual Account'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/svg_Terakhir kamu pakai_svg-icon svg-fill'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_BCA'))

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/button_Bayar dengan Virtual Account'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Bukalapak FIX/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/a_Lihat Detail Pesanan'))

WebUI.closeBrowser()

