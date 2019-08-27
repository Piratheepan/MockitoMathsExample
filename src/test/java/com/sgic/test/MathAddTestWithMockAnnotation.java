package com.sgic.test;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.sgic.Maths;

public class MathAddTestWithMockAnnotation {
	@Mock
	Maths mathObj;
	
//  if we use initMocks then do not need this
//	@Rule
//	public MockitoRule rule=MockitoJUnit.rule();
	
	@Before
	public void create() {
		//mathObj=Mockito.mock(Maths.class);
		MockitoAnnotations.initMocks(this);
		Mockito.when(mathObj.add(2,1)).thenReturn(5);
	}
	
	@Test
	public void test() {
		assertSame(5,mathObj.add(2, 1));
	}
}
