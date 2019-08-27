package com.sgic.test;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.sgic.Maths;

public class MathAddTestWithMock {
	Maths mathObj;
	
	//Maths mathObj1=new Maths();
	
	@Before
	public void create() {
		mathObj=Mockito.mock(Maths.class);
		Mockito.when(mathObj.add(2,1)).thenReturn(5);
	}
	
	@Test
	public void test() {
		assertSame(5,mathObj.add(2, 1));
	}
}
