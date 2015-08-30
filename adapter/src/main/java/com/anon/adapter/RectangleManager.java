package com.anon.adapter;

/**
 * @author swathi on 8/30/15.
 */
public class RectangleManager implements Shape {
	private Shape shape;

	public RectangleManager() {
		this.shape = new Rectangle();
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		shape.draw(x1, y1, x2, y2);
	}
}
