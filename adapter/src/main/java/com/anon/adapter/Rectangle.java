package com.anon.adapter;

/**
 * Adapter class
 * @author swathi on 8/30/15.
 */
public class Rectangle implements Shape {
	private LegacyRectangle legacyRectangle;

	public Rectangle() {
		this.legacyRectangle = new LegacyRectangle();
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		legacyRectangle.draw(x1, y1, x2, y2);
	}
}
