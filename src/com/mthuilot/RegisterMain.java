package com.mthuilot;

import javax.swing.*;

public class RegisterMain{
    RegisterMain(){
        RegisterFrame registerFrame = new RegisterFrame();
         registerFrame.setLayout(new BoxLayout(registerFrame.getContentPane(), BoxLayout.Y_AXIS));
        RegisterFrame.RegisterIcon registerIcon = new RegisterFrame.RegisterIcon();
        RegisterFrame.RegisterName registerName = new RegisterFrame.RegisterName();
        RegisterFrame.RegisterSurname registerSurname = new RegisterFrame.RegisterSurname();
        RegisterFrame.RegisterPassOne registerPassOne = new RegisterFrame.RegisterPassOne();
        RegisterFrame.RegisterPassTwo registerPassTwo = new RegisterFrame.RegisterPassTwo();
        RegisterFrame.RegisterButtonDone registerButtonDone = new RegisterFrame.RegisterButtonDone();
        RegisterFrame.RegisterIcon.RegisterLogo registerLogo = new RegisterFrame.RegisterIcon.RegisterLogo();
        RegisterFrame.RegisterName.RegisterNameLabel registerNameLabel = new RegisterFrame.RegisterName.RegisterNameLabel();
        RegisterFrame.RegisterName.RegisterNameField registerNameField = new RegisterFrame.RegisterName.RegisterNameField();
        RegisterFrame.RegisterSurname.RegisterSurnameLabel registerSurnameLabel = new RegisterFrame.RegisterSurname.RegisterSurnameLabel();
        RegisterFrame.RegisterSurname.RegisterSurnameField registerSurnameField = new RegisterFrame.RegisterSurname.RegisterSurnameField();
        RegisterFrame.RegisterPassOne.RegisterPassLabel registerPassLabel = new RegisterFrame.RegisterPassOne.RegisterPassLabel();
        RegisterFrame.RegisterPassOne.RegisterPassField registerPassField = new RegisterFrame.RegisterPassOne.RegisterPassField();
        RegisterFrame.RegisterPassTwo.RegisterPassTwoField registerPassTwoField = new RegisterFrame.RegisterPassTwo.RegisterPassTwoField();
        RegisterFrame.RegisterButtonDone.RegisterBackButton registerBackButton = new RegisterFrame.RegisterButtonDone.RegisterBackButton();
       //RegisterFrame.RegisterButtonDone.RegOrLabel regOrLabel = new RegisterFrame.RegisterButtonDone.RegOrLabel();
        RegisterFrame.RegisterButtonDone.RegisterDoneButton registerDoneButton = new RegisterFrame.RegisterButtonDone.RegisterDoneButton();


        registerFrame.add(registerIcon);
        registerFrame.add(registerName);
        registerFrame.add(registerSurname);
        registerFrame.add(registerPassOne);
        registerFrame.add(registerPassTwo);
        registerFrame.add(registerButtonDone);
        registerIcon.add(registerLogo);
        registerName.add(registerNameLabel);
        registerName.add(registerNameField);
        registerSurname.add(registerSurnameLabel);
        registerSurname.add(registerSurnameField);
        registerPassOne.add(registerPassLabel);
        registerPassOne.add(registerPassField);
        registerPassTwo.add(registerPassTwoField);
        registerButtonDone.add(registerBackButton);
        //registerButtonDone.add(regOrLabel);
        registerButtonDone.add(registerDoneButton);

        registerFrame.pack();
        registerFrame.setVisible(true);
    }
}
