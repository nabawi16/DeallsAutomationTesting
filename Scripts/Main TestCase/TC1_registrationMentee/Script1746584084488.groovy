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

WebUI.navigateToUrl('https://job-portal-user-dev-skx7zw44dq-et.a.run.app/sign-up')

WebUI.click(findTestObject('Object Repository/Page_Register  Dealls/a_Sign Up With Email'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_name_fullName'), 'asrea')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/p_Actively looking for the next 3 months'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_WhatsApp Number_whatsapp'), '6282249873145')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Email_email'), 'kukutastrea@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_LinkedIn (Optional)_linkedInUrl'), 'https://www.linkedin.com/in/ahmad-nabawi-2448341b4/')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Last Education Institution_campus'), 'Universitas Banten Jaya')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/button_Add Universitas Banten Jaya'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/div_Freshgrad_1'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya_1'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/path'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_PerusahaanNama Institusi_companyName'), 'PT Pencari Cinta Sejati')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/button_Add PT Pencari Cinta Sejati'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/div_C-level'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Peran_roleName'), 'admin')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/div_Administration'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Tanggal Mulai_startDate'), '01/2016')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Tanggal Selesai_endDate'), '01/2025')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Set Kata Sandi_password'), '+hPwV60zg50EAksWxXVIFw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Konfirmasi Kata Sandi_passwordConfirmation'), 
    '+hPwV60zg50EAksWxXVIFw==')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Konfirmasi Kata Sandi_checkPrivacyPolicy'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Lowongan Kerja Terbaru Hari Ini Mei 20_4e5ddd/div_Welcome to Dealls750 companies are wait_83fa53'))

WebUI.click(findTestObject('Object Repository/Page_Lowongan Kerja Terbaru Hari Ini Mei 20_4e5ddd/div_LokerMentoringPerusahaanEventsAI CV Ana_a5e262'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://job-portal-user-dev-skx7zw44dq-et.a.run.app/sign-up')

WebUI.click(findTestObject('Object Repository/Page_Register  Dealls/a_Sign Up With Email'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_name_fullName'), 'astrea')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_WhatsApp Number_whatsapp'), '082249873145')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Email_email'), '')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_WhatsApp Number_whatsapp'), '6282249873145')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Email_email'), 'kukutastrea@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_LinkedIn (Optional)_linkedInUrl'), 'https://www.linkedin.com/in/ahmad-nabawi-2448341b4/')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Last Education Institution_campus'), 'Universitas Banten Jaya')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/button_Add Universitas Banten Jaya'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/div_Freshgrad'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya_1'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/path'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_PerusahaanNama Institusi_companyName'), 'PT Pencari Cinta Sejati')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/button_Add PT Pencari Cinta Sejati'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/div_C-level'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Peran_roleName'), 'admin')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/div_Administration'))

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Tanggal Mulai_startDate'), '01/2016')

WebUI.setText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Tanggal Selesai_endDate'), '01/2025')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Selanjutnya_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Set Kata Sandi_password'), '+hPwV60zg50EAksWxXVIFw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Konfirmasi Kata Sandi_passwordConfirmation'), 
    '+hPwV60zg50EAksWxXVIFw==')

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/input_Konfirmasi Kata Sandi_checkPrivacyPolicy'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding  Dealls/span_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Lowongan Kerja Terbaru Hari Ini Mei 20_4e5ddd/div_Welcome to Dealls750 companies are wait_83fa53'))

WebUI.click(findTestObject('Object Repository/Page_Lowongan Kerja Terbaru Hari Ini Mei 20_4e5ddd/div_LokerMentoringPerusahaanEventsAI CV Ana_a5e262'))

WebUI.closeBrowser()

