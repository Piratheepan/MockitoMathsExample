package com.sgic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sgic.Rectangle;

@Service
public class Calculator {
	private Rectangle rectangle;

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	public int getArea() {
		return rectangle.getLength()*rectangle.getWidth();
	}
	
}
