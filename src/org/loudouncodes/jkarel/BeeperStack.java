package org.loudouncodes.jkarel;


import java.awt.*;
import java.awt.geom.Rectangle2D;

/*
 * Copyright (C) Andy Street 2007
 *
 * This software is licensed under the GNU Public License v3.
 * See attached file LICENSE.TXT or contact the author for more information.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of Version 3 of the GNU General Public License as
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * The BeeperStack is a renderable object that keeps track of its location on
 * the world and it's number of beepers.
 * @author Andy Street, alstreet@vt.edu, 2007
 */
public class BeeperStack extends Item {

	private final int RADIUS = 12;

	private int numBeepers = 1;

	/**
	 * Constructs a BeeperStack at the specified location with the
	 * specified number of beepers.
	 */
	public BeeperStack(int x, int y, int beepers) {
		super(x, y);

		if (beepers < 1 && beepers != Arena.INFINITY) {
			Arena.logger.warning("Invalid amount of beepers: "
			                   + beepers + "...  Setting to 1...");
			beepers = 1;
		}

		numBeepers = beepers;
	}

	/**
	 * Returns the number of beepers in the BeeperStack.
	 */
	public int getBeepers() {
		return numBeepers;
	}

	/**
	 * Renders the beeper stack at the specified pixel locations using
	 * the specified Graphics object.
	 */
	public void render(Graphics g, int x, int y) {
    
		g.setColor(Color.black);
		g.fillOval(x - RADIUS, y - RADIUS, RADIUS * 2, RADIUS * 2);

		String text;
		if (numBeepers == Arena.INFINITY)
			text = "\u221E "; //The infinity sign
		else
			text = "" + numBeepers;

		Font f = Arena.getBeeperFont();

		FontMetrics fm = g.getFontMetrics(f);
		Rectangle2D bounds = fm.getStringBounds(text, g);

		g.setColor(Color.white);
		g.drawString(text, (int)(x - bounds.getWidth() / 2),
		             (int)(y + bounds.getHeight() / 2));
	}

}
