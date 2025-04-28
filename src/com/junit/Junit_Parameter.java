package com.junit;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//////
@RunWith(Parameterized.class)  // when have to give set of parameters write this line

public class Junit_Parameter {

	// Initialize objects and variables
	AdditionDemo ad=new AdditionDemo();;
	int f_no, s_no, e_no;
	
//	@Before
//	public void before() {
//		ad = new AdditionDemo();
//	} 
	
	
	// constructor 
	public Junit_Parameter(int f_no,int s_no,int e_no) {
		
		this.f_no=f_no;
		this.s_no=s_no;
		this.e_no=e_no;
		
	}
		
	
	// with this annotation parameters are collected in collection(can't give directly 
	//so return parameters using method), and this return value will be assign in constructor 
	// parameters directly
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][]  {{1,2,3},{3,4,8},{5,6,11}});
	}
	
	// this method runs no of times automatically for given number of set of parameters
	@Test
	public void name() {
		System.out.println("My expected no is: "+e_no); // e_no is expected output 
		Assert.assertEquals(e_no, ad.sum(f_no, s_no)); //ad.sum(f_no, s_no) will give actual optput
	}
	
}
