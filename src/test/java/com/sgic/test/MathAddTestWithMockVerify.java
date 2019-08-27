package com.sgic.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import com.sgic.Maths;

public class MathAddTestWithMockVerify {
	Maths mathobj;
	
	@Before
	public void create() {
		mathobj=mock(Maths.class);
		when(mathobj.add(2, 1)).thenReturn(3);
	}
	
	@Test
	public void test() {
		//assertSame(3,mathobj.add(2, 1));
		assertEquals(3,mathobj.add(2, 1));
		verify(mathobj).add(eq(2), eq(1));
		verify(mathobj,times(1)).add(2, 1);
	}
}
