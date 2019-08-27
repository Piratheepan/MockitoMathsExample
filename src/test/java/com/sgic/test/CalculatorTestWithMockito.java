package com.sgic.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.MockitoAnnotations.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import com.sgic.Calculator;
import com.sgic.Rectangle;

public class CalculatorTestWithMockito {
	@Mock
	Rectangle rectangle;
	
	@Before
	public void create() {
		initMocks(this);
		when(rectangle.getLength()).thenReturn(20);
		when(rectangle.getWidth()).thenReturn(10);
	}
	
	@Test
	public void test() {
		Calculator c=new Calculator();
		c.setRectangle(rectangle);
		assertEquals(c.getArea(),200);
	}
}
