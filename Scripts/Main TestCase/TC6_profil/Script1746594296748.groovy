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

WebUI.openBrowser(GlobalVariable.G_LoginURL)

WebUI.callTestCase(findTestCase('General Login/Login'), [('email') : 'kukutastrea@gmail.com', ('password') : 'astrea!6'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Lowongan Kerja Terbaru Hari Ini Mei 20_4e5ddd/svg'))

WebUI.click(findTestObject('Object Repository/Page_Lowongan Kerja Terbaru Hari Ini Mei 20_4e5ddd/span_Lihat Halaman Profil'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dealls  Pengalaman  Preferensi/div_astreaAdministration at PT Pencari Cint_c7367b'), 
    GlobalVariable.G_Timeout)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

