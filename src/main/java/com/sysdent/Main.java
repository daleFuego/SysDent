package com.sysdent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sysdent.panel.login.LoginPanel;
import com.sysdent.utils.DefineUtils;
import com.sysdent.utils.Log;
import com.sysdent.utils.ResourceLoader;

/*****************************
 * Project: SysDent
 * Class:   Main
 * Author:  Magdalena Matusiak
 * Created: 23.09.2017
 *****************************/

public class Main extends JFrame {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2099168367348254574L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Log.log("Start SysDent");
		    Main frame = new Main();
		    frame.setVisible(true);
		    Log.log("End SysDent");
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public Main() {
    	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 445, 150);
	setUndecorated(true);
	setIconImage(ResourceLoader.getIconImage(DefineUtils.PATH_ICON_LOGO_MAIN));
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));

	LoginPanel loginPanel = new LoginPanel(this);
	contentPane.add(loginPanel);
	
	setContentPane(contentPane);
    }

}
