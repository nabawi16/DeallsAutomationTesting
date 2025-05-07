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

WebUI.setText(findTestObject('Object Repository/Page_Bergabung sebagai Mentor  Dealls/input_Optional, max. 1MB_mentor-onboarding__cb74e9'), 
    'astrea')

WebUI.setText(findTestObject('Object Repository/Page_Bergabung sebagai Mentor  Dealls/input_Optional, max. 1MB_mentor-onboarding_email'), 
    'kukutastrea@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Bergabung sebagai Mentor  Dealls/input_Optional, max. 1MB_mentor-onboarding__18dd99'), 
    '6282249873145')

WebUI.setText(findTestObject('Object Repository/Page_Bergabung sebagai Mentor  Dealls/input_Optional, max. 1MB_mentor-onboarding__048753'), 
    'https://www.linkedin.com/in/ahmad-nabawi-2448341b4/')

WebUI.setText(findTestObject('Object Repository/Page_Bergabung sebagai Mentor  Dealls/input_Optional, max. 1MB_mentor-onboarding__37cb4c'), 
    'https://www.instagram.com/')

WebUI.setText(findTestObject('Object Repository/Page_Bergabung sebagai Mentor  Dealls/input_Optional, max. 1MB_mentor-onboarding__d79753'), 
    '167263')

WebUI.click(findTestObject('Object Repository/Page_Bergabung sebagai Mentor  Dealls/span_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Page_Join as Mentor  Dealls/div_Hi, Welcome Back to DeallsSign InJoin I_d6ebfd'))

WebUI.closeBrowser()

