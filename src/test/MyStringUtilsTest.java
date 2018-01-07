package test;

//import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

public class MyStringUtilsTest {

	public void setUp() throws Exception {
	}

	public void tearDown() throws Exception {
	}

	public void teststartsWithIgnoreCase() {
		MyStringUtils sutils = new MyStringUtils();
		String str1 = "ABC";
		String str2 = "qwe";
//		assertTrue(sutils.startsWithIgnoreCase(str1, "a"));
//		assertTrue(sutils.startsWithIgnoreCase(str2, "q"));
		
	}
	
	public void testTokenizeToStringArray() {
		MyStringUtils sutils = new MyStringUtils();
		String str1 = "I am a student";
		String str2 = "hello,word";
		int temp1 = sutils.tokenizeToStringArray(str1, " ").length;
		int temp2 = sutils.tokenizeToStringArray(str2, ",").length;
//        assertEquals(temp1, 4);
//        assertEquals(temp2, 2);
		
	}
	
	public void testToDelimitedString() {
		StringUtilsEx sutils = new StringUtilsEx();
		List<Double> list = new ArrayList<>();
		list.add(2.3);
		list.add(6.8);
		String result = sutils.toDelimitedString(list, " ");
//		assertEquals(result.length(),3 );
		
	}

}
