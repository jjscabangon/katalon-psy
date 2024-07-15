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

//Randomize First Name
randomInt = (new Random().nextInt((32 - 1) + 1) + 1)

switch (randomInt) {
	case 1:
		GlobalVariable.firstname = 'AF Johan'
		break
	case 2:
		GlobalVariable.firstname = 'AR أحمد (Ahmed)'
		break
	case 3:
		GlobalVariable.firstname = 'AZ Hüseynov'
		break
	case 4:
		GlobalVariable.firstname = 'BG Иван (Ivan)'
		break
	case 5:
		GlobalVariable.firstname = 'BS Hadžić'
		break
	case 6:
		GlobalVariable.firstname = 'CN 伟 (Wei)'
		break
	case 7:
		GlobalVariable.firstname = 'CZ Novák'
		break
	case 8:
		GlobalVariable.firstname = 'DE Müller'
		break
	case 9:
		GlobalVariable.firstname = 'DU Jan'
		break
	case 10:
		GlobalVariable.firstname = 'ES García'
		break
	case 11:
		GlobalVariable.firstname = 'FR Jean'
		break
	case 12:
		GlobalVariable.firstname = 'GR Ιωάννης (Ioannis)'
		break
	case 13:
		GlobalVariable.firstname = 'HE דוד (David)'
		break
	case 14:
		GlobalVariable.firstname = 'HR Ivan'
		break
	case 15:
		GlobalVariable.firstname = 'HU László'
		break
	case 16:
		GlobalVariable.firstname = 'IN Raj'
		break
	case 17:
		GlobalVariable.firstname = 'IT Marco'
		break
	case 18:
		GlobalVariable.firstname = 'JP 太郎 (Taro)'
		break
	case 19:
		GlobalVariable.firstname = 'SL Janez'
		break
	case 20:
		GlobalVariable.firstname = 'KR 민준 (Min-jun)'
		break
	case 21:
		GlobalVariable.firstname = 'MK Иван (Ivan)'
		break
	case 22:
		GlobalVariable.firstname = 'NN Ole'
		break
	case 23:
		GlobalVariable.firstname = 'PL Jan'
		break
	case 24:
		GlobalVariable.firstname = 'PT João'
		break
	case 25:
		GlobalVariable.firstname = 'RO Andrei'
		break
	case 26:
		GlobalVariable.firstname = 'RU Иван (Ivan)'
		break
	case 27:
		GlobalVariable.firstname = 'SR Иван (Ivan)'
		break
	case 28:
		GlobalVariable.firstname = 'TH สมชาย (Somchai)'
		break
	case 29:
		GlobalVariable.firstname = 'TR Mehmet'
		break
	case 30:
		GlobalVariable.firstname = 'UK Іван (Ivan)'
		break
	case 31:
		GlobalVariable.firstname = 'UA Іван (Ivan)'
		break
	default:
		GlobalVariable.firstname = 'EN John'
		break
}

//Randomize Last Name
randomInt = (new Random().nextInt((32 - 1) + 1) + 1)

switch (randomInt) {
	case 1:
		GlobalVariable.lastname = 'Van der Merwe'
		break
	case 2:
		GlobalVariable.lastname = 'محمد (Mohamed)'
		break
	case 3:
		GlobalVariable.lastname = 'Hüseynov'
		break
	case 4:
		GlobalVariable.lastname = 'Иванов (Ivanov)'
		break
	case 5:
		GlobalVariable.lastname = 'Hadžić'
		break
	case 6:
		GlobalVariable.lastname = '王 (Wang)'
		break
	case 7:
		GlobalVariable.lastname = 'Novák'
		break
	case 8:
		GlobalVariable.lastname = 'Müller'
		break
	case 9:
		GlobalVariable.lastname = 'Jansen'
		break
	case 10:
		GlobalVariable.lastname = 'Rodríguez'
		break
	case 11:
		GlobalVariable.lastname = 'Dupont'
		break
	case 12:
		GlobalVariable.lastname = 'Παπαδόπουλος (Papadopoulos)'
		break
	case 13:
		GlobalVariable.lastname = '	כהן (Cohen)'
		break
	case 14:
		GlobalVariable.lastname = 'Horvat'
		break
	case 15:
		GlobalVariable.lastname = 'Kovács'
		break
	case 16:
		GlobalVariable.lastname = 'Kumar'
		break
	case 17:
		GlobalVariable.lastname = 'Rossi'
		break
	case 18:
		GlobalVariable.lastname = '鈴木 (Suzuki)'
		break
	case 19:
		GlobalVariable.lastname = 'Novak'
		break
	case 20:
		GlobalVariable.lastname = '김 (Kim)'
		break
	case 21:
		GlobalVariable.lastname = 'Стојанов (Stojanov)'
		break
	case 22:
		GlobalVariable.lastname = 'Hansen'
		break
	case 23:
		GlobalVariable.lastname = 'Kowalski'
		break
	case 24:
		GlobalVariable.lastname = 'Silva'
		break
	case 25:
		GlobalVariable.lastname = 'Popescu'
		break
	case 26:
		GlobalVariable.lastname = 'Иванов (Ivanov)'
		break
	case 27:
		GlobalVariable.lastname = 'Петровић (Petrović)'
		break
	case 28:
		GlobalVariable.lastname = 'สุวรรณ (Suwann)'
		break
	case 29:
		GlobalVariable.lastname = 'Yılmaz'
		break
	case 30:
		GlobalVariable.lastname = 'Іваненко (Ivanenko)'
		break
	case 31:
		GlobalVariable.lastname = 'Іваненко (Ivanenko)'
		break
	default:
		GlobalVariable.lastname = 'Smith'
		break
}