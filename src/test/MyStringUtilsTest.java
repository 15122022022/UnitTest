package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Suite;

public class MyStringUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void teststartsWithIgnoreCase() {
		MyStringUtils sutils = new MyStringUtils();
		String str1 = "ABC";
		String str2 = "qwe";
		assertTrue(sutils.startsWithIgnoreCase(str1, "a"));
		assertTrue(sutils.startsWithIgnoreCase(str2, "q"));
		
	}
	
	@Test
	public void testTokenizeToStringArray() {
		MyStringUtils sutils = new MyStringUtils();
		String str1 = "I am a student";
		String str2 = "hello,word";
		int temp1 = sutils.tokenizeToStringArray(str1, " ").length;
		int temp2 = sutils.tokenizeToStringArray(str2, ",").length;
        assertEquals(temp1, 4);
        assertEquals(temp2, 2);
		
	}
	
	@Test
	public void testToDelimitedString() {
		StringUtilsEx sutils = new StringUtilsEx();
		List<Double> list = new ArrayList<>();
		list.add(2.3);
		list.add(6.8);
		String result = sutils.toDelimitedString(list, " ");
		assertEquals(result.length(),3 );
		
	}

}
