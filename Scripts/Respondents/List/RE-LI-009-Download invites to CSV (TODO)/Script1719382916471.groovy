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

WebUI.callTestCase(findTestCase('Authentication/AU-001-Login'), [:], FailureHandling.STOP_ON_FAILURE)

ctr = 1

while (ctr <= 5) {
    WebUI.waitForPageLoad(5)

    WebUI.waitForElementClickable(findTestObject('Page-EN/Respondents/List/OR-RE-LI-Add new respondent/button_Add new respondent'), 
        5)

    WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/button_Add new respondent'))

    //Get Current Timestamp
    GlobalVariable.timestamp = new Date().format('MMddhhmmss')

    println(GlobalVariable.timestamp)

    //Randomize First Name
    randomInt = (new Random().nextInt((10 - 1) + 1) + 1)

    GlobalVariable.firstname = 'Auto'

    switch (randomInt) {
        case 1:
            GlobalVariable.firstname = '王伟 (Wáng Wěi)'

            break
        case 2:
            GlobalVariable.firstname = '李娜 (Lǐ Nà)'

            break
        case 3:
            GlobalVariable.firstname = '张强 (Zhāng Qiáng)'

            break
        case 4:
            GlobalVariable.firstname = '刘洋 (Liú Yáng)'

            break
        case 5:
            GlobalVariable.firstname = '陈杰 (Chén Jié)'

            break
        case 6:
            GlobalVariable.firstname = '杨静 (Yáng Jìng)'

            break
        case 7:
            GlobalVariable.firstname = '赵磊 (Zhào Lěi)'

            break
        case 8:
            GlobalVariable.firstname = '周婷 (Zhōu Tíng)'

            break
        case 9:
            GlobalVariable.firstname = '吴浩 (Wú Hào)'

            break
        default:
            GlobalVariable.firstname = '徐敏 (Xú Mǐn)'

            break
    }
    
    //Randomize Last Name
    randomInt = (new Random().nextInt((10 - 1) + 1) + 1)

    GlobalVariable.lastname = 'Auto'

    switch (randomInt) {
        case 1:
            GlobalVariable.lastname = '黄 (Huáng)'

            break
        case 2:
            GlobalVariable.lastname = '何 (Hé)'

            break
        case 3:
            GlobalVariable.lastname = '郑 (Zhèng)'

            break
        case 4:
            GlobalVariable.lastname = '谢 (Xiè)'

            break
        case 5:
            GlobalVariable.lastname = '宋 (Sòng)'

            break
        case 6:
            GlobalVariable.lastname = '罗 (Luó)'

            break
        case 7:
            GlobalVariable.lastname = '韩 (Hán)'

            break
        case 8:
            GlobalVariable.lastname = '唐 (Táng)'

            break
        case 9:
            GlobalVariable.lastname = '冯 (Féng)'

            break
        default:
            GlobalVariable.lastname = '潘 (Pān)'

            break
    }
    
    WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/input_Group Membership_firstName'), 
        GlobalVariable.firstname + ' Auto Bulk')

    WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/input_First Name_familyName'), 
        GlobalVariable.lastname)

    GlobalVariable.email = (('jjscabangon+' + GlobalVariable.timestamp) + '@gmail.com')

    WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/input_email'), 
        GlobalVariable.email)

    WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/button_Save'))

    ctr = (ctr + 1)
}

//Search for respondents
WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'), 
    'Auto Bulk')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.click(findTestObject('Page-EN/Respondents/List/OR-RE-LI-Download invites to CSV/div_Select all rows'))

//Invite multiple respondents
WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/div_Invite respondent(s) to assessment'))

WebUI.click(findTestObject('Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/button_Create invite and go next'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/button_Create invite and go next'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Page-EN/Respondents/List/OR-RE-LI-Download invites to CSV/span_Download csv'))

