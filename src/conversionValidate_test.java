import junit.framework.TestCase;

public class conversionValidate_test extends TestCase {
	
	conversionValidate cvObj = new conversionValidate();
	/*
	Test Number:	1
	Test Objective:	handle void inputs
	Test Type:	jUnit
	Input(s):	" "
	Expected Output: false
	 */
	
	public void testEmpty() {
		assertEquals(false, cvObj.Validateempty(""));
		
		
	}
	/*
	Test Number:	2
	Test Objective:	handle valid inputs
	Test Type:	jUnit
	Input(s):	" "
	Expected Output: false
	 */
	
	public void testNotEmpty() {
		assertEquals(true, cvObj.Validateempty("88"));
		
		
	}
	/*
	Test Number:	3
	Test Objective:	valid lower boundary input for celsius 
	Test Type:	jUnit
	Input(s):	-273.15
	Expected Output: true
	 */
	
	public void testLBVcelsius() {
		assertEquals(true, cvObj.ValidatenC("-273.15"));
		
		
	}
	/*
	Test Number:	4
	Test Objective:	valid higher boundary input for celsius 
	Test Type:	jUnit
	Input(s):	100
	Expected Output: true
	 */
	
	public void testHBVcelsius() {
		assertEquals(true, cvObj.ValidatenC("100"));
		
		
	}
	/*
	Test Number:	5
	Test Objective:	invalid higher boundary input for celsius 
	Test Type:	jUnit
	Input(s):	500
	Expected Output: false
	 */
	
	public void testHBVcelsiusLower() {
		assertEquals(false, cvObj.ValidatenC("-10000"));
		
		
	}
	/*
	Test Number:	6
	Test Objective:	invalid lower boundary input for celsius 
	Test Type:	jUnit
	Input(s):	-274
	Expected Output: false
	 */
	
	public void testLBVcelsiusLower() {
		assertEquals(false, cvObj.ValidatenC("-274"));
		
		
	}
	/*
	Test Number:	7
	Test Objective:	invalid lower boundary input for celsius 
	Test Type:	jUnit
	Input(s):	101
	Expected Output: false
	 */
	
	public void testLBVcelsiusHigher() {
		assertEquals(false, cvObj.ValidatenC("101"));
		
		
	}
	/*
	Test Number:	8
	Test Objective:	invalid higher boundary input for celsius 
	Test Type:	jUnit
	Input(s):	6000000
	Expected Output: false
	 */
	
	public void testHVcelsiusHigher() {
		assertEquals(false, cvObj.ValidatenC("600000"));
		
		
	}
	
	
	///// for Farherniet
	
	
	/*
	Test Number:	9
	Test Objective:	valid lower boundary input for Farherniet
	Test Type:	jUnit
	Input(s):	-460
	Expected Output: true
	 */
	
	public void testLBVFarherniet() {
		assertEquals(true, cvObj.ValidatenF("-460"));
		
		
	}
	/*
	Test Number:	10
	Test Objective:	valid higher boundary input for Farherniet
	Test Type:	jUnit
	Input(s):	212
	Expected Output: true
	 */
	
	public void testHBVFarherniet() {
		assertEquals(true, cvObj.ValidatenF("212"));
		
		
	}
	/*
	Test Number:  11
	Test Objective:	invalid higher boundary input for Farherniet
	Test Type:	jUnit
	Input(s):	-461
	Expected Output: false
	 */
	
	public void testHBVFarhernietLower() {
		assertEquals(false, cvObj.ValidatenF("-461"));
		
		
	}
	/*
	Test Number:	12
	Test Objective:	invalid lower boundary input for Farherniet
	Input(s):	-100000
	Expected Output: false
	 */
	
	public void testLBVFarhernietLower() {
		assertEquals(false, cvObj.ValidatenF("-100000"));
		
		
	}
	/*
	Test Number:	13
	Test Objective:	invalid lower boundary input for Farherniet
	Test Type:	jUnit
	Input(s):	213
	Expected Output: false
	 */
	
	public void testLBVFarhernietHigher() {
		assertEquals(false, cvObj.ValidatenF("213"));
		
		
	}
	/*
	Test Number:	14
	Test Objective:	invalid higher boundary input for Farherniet
	Test Type:	jUnit
	Input(s):	10000
	Expected Output: false
	 */
	
	public void testHVFarhernietHigher() {
		assertEquals(false, cvObj.ValidatenF("100000"));
		
		
	}
	/*
	Test Number:	15
	Test Objective:	valid input
	Test Type:	jUnit
	Input(s):	10000
	Expected Output: false
	 */
	
	public void testvalid() {
		assertEquals(true, cvObj.Validateinput("-45"));
		
		
	}
	/*
	Test Number:	16
	Test Objective:	invalid input like string or aplhanumeric
	Test Type:	jUnit
	Input(s):	10000
	Expected Output: false
	 */
	
	public void testInvalid() {
		assertEquals(false, cvObj.Validateinput("-d545dn"));
		
		
	}

}
