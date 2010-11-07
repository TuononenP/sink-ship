/*
Copyright (C) 2010 Petri Tuononen

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;

import types.Coordinates;

/**
 * 
 * @author Petri Tuononen
 *
 */
public class DrawComponents {

	/**
	 * @uml.property  name="menuHeight"
	 */
	int menuHeight;
	
	/**
	 * @uml.property  name="boardWidth"
	 */
	int boardWidth;
	
	/**
	 * @uml.property  name="boardHeight"
	 */
	int boardHeight;
	
	/**
	 * Draws the board.
	 * 
	 * @param g Graphics
	 */
	public void drawBoard(Graphics g) {
		//get menubar height
		menuHeight = 0; //Gui.getMenubar().getHeight();

		//draw the background sea color
		boardWidth = BoardGui.getBoard().getMatrixSize().getWidth()*
				     BoardGui.getBoard().getBlockSize().getWidth();
		boardHeight = BoardGui.getBoard().getMatrixSize().getHeight()*
					  BoardGui.getBoard().getBlockSize().getHeight();
		g.setColor(ColorSettings.getSeaColor());
		int x=0, y=menuHeight; //take into an account the height of the menubar
		g.fillRect(x, y, boardWidth, boardHeight);

		//draw the horizontal lines
		g.setColor(ColorSettings.getLineColor());
		for (int i=1; i<=BoardGui.getBoard().getMatrixSize().getWidth(); i++) {
			g.fillRect(x, i*BoardGui.getBoard().getBlockSize().getHeight()-BoardGui.getLineWidth(),
					boardWidth, BoardGui.getLineWidth());
		}

		//draw the vertical lines
		for (int i=1; i<=BoardGui.getBoard().getMatrixSize().getHeight(); i++) {
			g.fillRect(i*BoardGui.getBoard().getBlockSize().getWidth()-BoardGui.getLineWidth(), x,
					BoardGui.getLineWidth(), boardWidth);
		}
	}
	
	/**
	 * Draws an x on top of the selected square.
	 * @param g Graphics
	 */
	public void drawX() {
		//get the coordinates of the upper left corner of the clicked square
		Coordinates coords = Calculations.getUpperLeftCornerCoordinates(
				Square.getClickedSquare().getX(), Square.getClickedSquare().getY()
				);
		//paint diagonal line starting from upper-left corner to bottom-right corner
		BoardGui.getG1().drawLine(
				coords.getX(),
				coords.getY(),
				coords.getX()+BoardGui.getBoard().getBlockSize().getWidth()-BoardGui.getLineWidth(),
				coords.getY()+BoardGui.getBoard().getBlockSize().getHeight()-BoardGui.getLineWidth()
				);
		//paint diagonal line starting from upper-right corner to bottom-left corner
		BoardGui.getG1().drawLine(
				coords.getX()-BoardGui.getLineWidth()+BoardGui.getBoard().getBlockSize().getWidth()-BoardGui.getLineWidth(),
				coords.getY(),
				coords.getX()-BoardGui.getLineWidth(),
				coords.getY()+BoardGui.getBoard().getBlockSize().getHeight()-BoardGui.getLineWidth()
				);
	}
	
	 /** Draws ships.
	 * @param g Graphics
	 */
	public void drawShips(Graphics g) {

	}

	/**
	 * Draws a horizontal aligned ship.
	 * @param startX
	 * @param endX
	 * @param color
	 */
	public void drawHorizontalShip(int startX, int endX, Color color) {
		//TODO: Implement draw horizontal ship
//		paintSquare(startX, endX, color);
//		Coordinates coords = getUpperLeftCornerCoordinates(startX, endX);
//		paintSquare(coords.getX(), coords.getY(), color);
	}	

	/**
	 * Draws a vertical aligned ship.
	 * @param startY
	 * @param endY
	 * @param color Color
	 */
	public void drawVerticalShip(int startY, int endY, Color color) {
		//TODO: Implement draw vertical ship
//		paintSquare(startY, endY, color);
	}	
	
}
