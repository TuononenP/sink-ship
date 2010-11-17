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
package gui.windows.tests;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.LayoutManager;

import types.Size;

import gui.Gui;
import gui.panels.Players;

/**
 * Shows players window.
 * 
 * @author Petri Tuononen
 */
public class PlayersTest extends Gui {
	
	private static final long serialVersionUID = -7065695218306220370L;
	
	private static LayoutManager layout;
	
	public PlayersTest(Dimension d, LayoutManager layout) {
		super(new Dimension(400, 500), new BorderLayout());
		PlayersTest.layout=layout;
		getFrame().add(new Players(new Size(100, 200)));
		getFrame().pack();
		Gui.centerPanelToScreen();
	}

	public static void main(String[] args) {
		new PlayersTest(getDimension(), layout);
	}

}
