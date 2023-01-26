package com.mthuilot;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
		MainFrame MainFrame = new MainFrame();
		MainFrame.setLayout(new BoxLayout(MainFrame.getContentPane(), BoxLayout.Y_AXIS));
		MainFrame.TopPanel TopPanel = new MainFrame.TopPanel();
		MainFrame.UserPanel UserPanel = new MainFrame.UserPanel();
		MainFrame.PassPanel passPanel = new MainFrame.PassPanel();
		MainFrame.EmptyPanel emptyPanel = new MainFrame.EmptyPanel();
		MainFrame.BottomPanel BottomPanel = new MainFrame.BottomPanel();
		MainFrame.TopPanel.MainIcon mainICon = new com.mthuilot.MainFrame.TopPanel.MainIcon();
		MainFrame.UserPanel.UserLabel userLabel = new com.mthuilot.MainFrame.UserPanel.UserLabel();
		MainFrame.UserPanel.UserText userText = new com.mthuilot.MainFrame.UserPanel.UserText();
		MainFrame.PassPanel.PassLabel passLabel = new com.mthuilot.MainFrame.PassPanel.PassLabel();
		MainFrame.PassPanel.PassText passText = new com.mthuilot.MainFrame.PassPanel.PassText();
		MainFrame.BottomPanel.LoginButton loginButton = new com.mthuilot.MainFrame.BottomPanel.LoginButton();
		MainFrame.BottomPanel.RegisterButton registerButton = new com.mthuilot.MainFrame.BottomPanel.RegisterButton();
		MainFrame.BottomPanel.OrLabel orLabel = new com.mthuilot.MainFrame.BottomPanel.OrLabel();







		MainFrame.add(TopPanel);
		MainFrame.add(UserPanel);
		MainFrame.add(passPanel);
		MainFrame.add(emptyPanel);
		MainFrame.add(BottomPanel);
		TopPanel.add(mainICon);
		UserPanel.add(userLabel);
		UserPanel.add(userText);
		passPanel.add(passLabel);
		passPanel.add(passText);
		BottomPanel.add(loginButton);
		BottomPanel.add(orLabel);
		BottomPanel.add(registerButton);



		MainFrame.pack();
		MainFrame.setVisible(true);



    }
}
