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

//Randomize the Qualification Type
int randomInt = new Random().nextInt((5 - 1) + 1) + 1

//Click by WebElement
switch (randomInt) {
    case 1:
        WebUI.scrollToElement(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Qualification type PTC'), 
            3)

        WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Qualification type PTC'))

        break
    case 2:
        WebUI.scrollToElement(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Qualification type TUP'), 
            3)

        WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Qualification type TUP'))

        break
    case 3:
        WebUI.scrollToElement(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Qualification type TUA'), 
            3)

        WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Qualification type TUA'))

        break
    case 4:
        WebUI.scrollToElement(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Qualification type ATU'), 
            3)

        WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Qualification type ATU'))

        break
    case 5:
        WebUI.scrollToElement(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Other details'), 
            3)

        WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Other details'))

        WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Other details'), 
            'Other Qualification Type')

        break
}

