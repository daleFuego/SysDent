package com.sysdent.panel.login;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sysdent.panel.Panel;
import com.sysdent.utils.Log;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

/*****************************
 * Project: SysDent
 * Class:   LoginPanel
 * Author:  Magdalena Matusiak
 * Created: 23.09.2017
 *****************************/

public class LoginPanel extends Panel {

    public LoginPanel(JFrame parent) {
	super(parent);
	setBackground(SystemColor.window);

	GridBagLayout gridBagLayout = (GridBagLayout) getLayout();
	gridBagLayout.columnWidths = new int[] { 0, 0, 25, 0, 0 };
	gridBagLayout.rowHeights = new int[] { 115, 0, 0, 0, 0 };
	gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0 };

	JLabel lblEnterCredentials = new JLabel("Enter credentials");
	lblEnterCredentials.setFont(new Font("Tahoma", Font.BOLD, 11));
	GridBagConstraints gbc_lblEnterCredentials = new GridBagConstraints();
	gbc_lblEnterCredentials.gridwidth = 2;
	gbc_lblEnterCredentials.insets = new Insets(0, 0, 5, 5);
	gbc_lblEnterCredentials.gridx = 0;
	gbc_lblEnterCredentials.gridy = 0;
	add(lblEnterCredentials, gbc_lblEnterCredentials);

	JLabel lblId = new JLabel("ID");
	GridBagConstraints gbc_lblId = new GridBagConstraints();
	gbc_lblId.anchor = GridBagConstraints.EAST;
	gbc_lblId.insets = new Insets(0, 0, 5, 5);
	gbc_lblId.gridx = 1;
	gbc_lblId.gridy = 1;
	add(lblId, gbc_lblId);

	textFieldId = new JTextField();
	GridBagConstraints gbc_textFieldId = new GridBagConstraints();
	gbc_textFieldId.gridwidth = 3;
	gbc_textFieldId.insets = new Insets(0, 0, 5, 5);
	gbc_textFieldId.fill = GridBagConstraints.HORIZONTAL;
	gbc_textFieldId.gridx = 2;
	gbc_textFieldId.gridy = 1;
	add(textFieldId, gbc_textFieldId);
	textFieldId.setColumns(10);

	JLabel lblLogin = new JLabel("Login");
	GridBagConstraints gbc_lblLogin = new GridBagConstraints();
	gbc_lblLogin.anchor = GridBagConstraints.EAST;
	gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
	gbc_lblLogin.gridx = 1;
	gbc_lblLogin.gridy = 2;
	add(lblLogin, gbc_lblLogin);

	textFieldLogin = new JTextField();
	GridBagConstraints gbc_textFieldLogin = new GridBagConstraints();
	gbc_textFieldLogin.gridwidth = 3;
	gbc_textFieldLogin.insets = new Insets(0, 0, 5, 5);
	gbc_textFieldLogin.fill = GridBagConstraints.HORIZONTAL;
	gbc_textFieldLogin.gridx = 2;
	gbc_textFieldLogin.gridy = 2;
	add(textFieldLogin, gbc_textFieldLogin);
	textFieldLogin.setColumns(10);

	Box horizontalBox = Box.createHorizontalBox();
	GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
	gbc_horizontalBox.weightx = 0.1;
	gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
	gbc_horizontalBox.gridx = 0;
	gbc_horizontalBox.gridy = 2;
	add(horizontalBox, gbc_horizontalBox);

	JLabel lblPassword = new JLabel("Password");
	GridBagConstraints gbc_lblPassword = new GridBagConstraints();
	gbc_lblPassword.anchor = GridBagConstraints.EAST;
	gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
	gbc_lblPassword.gridx = 1;
	gbc_lblPassword.gridy = 3;
	add(lblPassword, gbc_lblPassword);

	passwordField = new JPasswordField();
	GridBagConstraints gbc_passwordField = new GridBagConstraints();
	gbc_passwordField.gridwidth = 3;
	gbc_passwordField.insets = new Insets(0, 0, 5, 5);
	gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
	gbc_passwordField.gridx = 2;
	gbc_passwordField.gridy = 3;
	add(passwordField, gbc_passwordField);

	JButton btnExit = new JButton("Exit");
	btnExit.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		Log.log("Exiting system from LoginPanel");
		System.exit(0);
	    }
	});
	GridBagConstraints gbc_btnExit = new GridBagConstraints();
	gbc_btnExit.insets = new Insets(0, 0, 0, 5);
	gbc_btnExit.gridx = 3;
	gbc_btnExit.gridy = 4;
	add(btnExit, gbc_btnExit);

	JButton btnLogin = new JButton("Login");
	btnLogin.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		// TODO
	    }
	});
	GridBagConstraints gbc_btnLogin = new GridBagConstraints();
	gbc_btnLogin.gridx = 4;
	gbc_btnLogin.gridy = 4;
	add(btnLogin, gbc_btnLogin);
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2288323158823022411L;
    private JTextField textFieldId;
    private JTextField textFieldLogin;
    private JPasswordField passwordField;
}
