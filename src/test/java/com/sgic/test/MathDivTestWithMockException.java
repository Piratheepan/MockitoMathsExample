package com.sgic.test;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import com.sgic.Maths;

public class MathDivTestWithMockException {
	@Mock
	Maths mathObj;
	
	@Before
	public void create() {
		MockitoAnnotations.initMocks(this);
		Mockito.when(mathObj.div(anyInt(), eq(0))).thenThrow(new ArithmeticException());
	}
	
	@Test(expected=ArithmeticException.class)
	public void test() {
		mathObj.div(1, 0);
	}
}
