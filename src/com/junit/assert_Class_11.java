package com.junit;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class assert_Class_11 {
	@Ignore
	@Test
	public void test1() {
		int a=10, b=20;
		//Assert.assertTrue(a<b);
		Assert.assertFalse(a>b);
	}
	
	@Ignore
	@Test
	public void test2() {
		String name1="pratixa";
		String name2=null;
		
		//Assert.assertNull(name2);
		Assert.assertNotNull(name1);
	}

	@Ignore
	@Test
	public void test3() {
		int a=10, b=11;
		//Assert.assertEquals(b, a);
		String name1="Pratixa", name2="pratixa";
		Assert.assertSame(name1, name2);  // case sensitive
	}
	
	@Ignore
	@Test
	public void test4() {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,5};
		Assert.assertArrayEquals(b, a);
	}
	
	@Test
	public void test5() {
		fail("self failed!!!");
	}	
	
	
}
