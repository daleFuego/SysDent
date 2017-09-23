package com.sysdent.panel;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import com.sysdent.utils.Log;

/*****************************
 * Project: SysDent
 * Class:   DefineUtils
 * Author:  Magdalena Matusiak
 * Created: 23.09.2017
 *****************************/

public class Panel extends JPanel {

    private Point initialClick;

    public Panel() {
	setInits();
    }

    public Panel(JFrame parent) {
	setInits();

	addMouseListener(new MouseListener() {

	    @Override
	    public void mousePressed(MouseEvent arg0) {
		initialClick = arg0.getPoint();
		getComponentAt(initialClick);
	    }

	    @Override
	    public void mouseClicked(MouseEvent e) {
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	    }

	    @Override
	    public void mouseReleased(MouseEvent e) {
	    }

	});

	addMouseMotionListener(new MouseMotionListener() {

	    @Override
	    public void mouseMoved(MouseEvent arg0) {
	    }

	    @Override
	    public void mouseDragged(MouseEvent arg0) {
		// get location of Window
		int thisX = parent.getLocation().x;
		int thisY = parent.getLocation().y;

		// Determine how much the mouse moved since the initial click
		int xMoved = (thisX + arg0.getX()) - (thisX + initialClick.x);
		int yMoved = (thisY + arg0.getY()) - (thisY + initialClick.y);

		// Move window to this position
		int X = thisX + xMoved;
		int Y = thisY + yMoved;
		parent.setLocation(X, Y);
	    }
	});

    }

    private void setInits() {
	setBorder(new LineBorder(new Color(0, 0, 0)));
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[] { 0 };
	gridBagLayout.rowHeights = new int[] { 0 };
	gridBagLayout.columnWeights = new double[] { Double.MIN_VALUE };
	gridBagLayout.rowWeights = new double[] { Double.MIN_VALUE };
	setLayout(gridBagLayout);

	try {
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
		| UnsupportedLookAndFeelException e) {
	    Log.error(e.getMessage());
	}
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -3152376146700482865L;
}