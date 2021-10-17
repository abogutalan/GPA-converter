import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import GPAcalculator.*;

public class TestConversions
{
	// Set up anything that you need prior to the tests in the @Before
	// declaration area
	GPAconverterTool myGPAconverter;

	@Before public void setup() {
		// get the converter so that the system can function
		myGPAconverter = GPAconverterTool.getReference();
	}

	@Test public void test100percent() {
		int grade = 100;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A+", letter);
	}

	@Test public void test95percent() {
		int grade = 95;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A+", letter);
	}

	@Test public void test90percent() {
		int grade = 90;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A+", letter);
	}

	@Test public void test89percent() {
		int grade = 89;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A", letter);
	}

	@Test public void test87percent() {
		int grade = 87;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A", letter);
	}

	@Test public void test85percent() {
		int grade = 85;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A", letter);
	}

	@Test public void test84percent() {
		int grade = 84;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A-", letter);
	}

	@Test public void test82percent() {
		int grade = 82;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A-", letter);
	}

	@Test public void test80percent() {
		int grade = 80;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("A-", letter);
	}

	@Test public void test79percent() {
		int grade = 79;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("B+", letter);
	}

	@Test public void test78percent() {
		int grade = 78;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("B+", letter);
	}

	@Test public void test77percent() {
		int grade = 77;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("B+", letter);
	}

	@Test public void test76percent() {
		int grade = 76;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("B", letter);
	}

	@Test public void test74_5percent() {
		double grade = 74.5;
		String letter = myGPAconverter.getLetterForNumericGrade((int)grade);
		assertEquals("B", letter);
	}

	@Test public void test73percent() {
		int grade = 73;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("B", letter);
	}

	@Test public void test72percent() {
		int grade = 72;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("B-", letter);
	}

	@Test public void test71percent() {
		int grade = 71;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("B-", letter);
	}

	@Test public void test70percent() {
		int grade = 70;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("B-", letter);
	}

	@Test public void test69percent() {
		int grade = 69;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("C+", letter);
	}

	@Test public void test68percent() {
		int grade = 68;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("C+", letter);
	}

	@Test public void test67percent() {
		int grade = 67;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("C+", letter);
	}

	@Test public void test66percent() {
		int grade = 66;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("C", letter);
	}
	
	@Test public void test64_5percent() {
		double grade = 64.5;
		String letter = myGPAconverter.getLetterForNumericGrade((int)grade);
		assertEquals("C", letter);
	}

	@Test public void test63percent() {
		int grade = 63;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("C", letter);
	}

	@Test public void test62percent() {
		int grade = 62;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("C-", letter);
	}

	@Test public void test61percent() {
		int grade = 61;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("C-", letter);
	}

	@Test public void test60percent() {
		int grade = 60;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("C-", letter);
	}

	@Test public void test59percent() {
		int grade = 59;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("D+", letter);
	}

	@Test public void test58percent() {
		int grade = 58;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("D+", letter);
	}

	@Test public void test57percent() {
		int grade = 57;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("D+", letter);
	}

	@Test public void test56percent() {
		int grade = 56;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("D", letter);
	}

	@Test public void test54_5percent() {
		double grade = 54.5;
		String letter = myGPAconverter.getLetterForNumericGrade((int)grade);
		assertEquals("D", letter);
	}

	@Test public void test53percent() {
		int grade = 53;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("D", letter);
	}

	@Test public void test52percent() {
		int grade = 52;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("D-", letter);
	}

	@Test public void test51percent() {
		int grade = 51;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("D-", letter);
	}

	@Test public void test50percent() {
		int grade = 50;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("D-", letter);
	}

	@Test public void test49percent() {
		int grade = 49;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("F", letter);
	}
	
	@Test public void test24_5percent() {
		double grade = 24.5;
		String letter = myGPAconverter.getLetterForNumericGrade((int)grade);
		assertEquals("F", letter);
	}

	@Test public void test0percent() {
		int grade = 0;
		String letter = myGPAconverter.getLetterForNumericGrade(grade);
		assertEquals("F", letter);
	}

}
