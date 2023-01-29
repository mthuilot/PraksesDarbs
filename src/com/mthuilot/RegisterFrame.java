package com.mthuilot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterFrame {
    RegisterFrame(){
        JFrame registerMain = new JFrame();
        registerMain.setTitle("Register | Rizz Academy©");
        registerMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("Rizz Academy-logos_black_resize.png");
        registerMain.setIconImage(image.getImage());
        registerMain.setPreferredSize(new Dimension(500, 800));
        registerMain.getContentPane().setBackground(new Color(0x5865F2));
        registerMain.setLayout(new BoxLayout(registerMain.getContentPane(), BoxLayout.Y_AXIS));
        registerMain.setResizable(false);
        registerMain.pack();
        registerMain.setLocationRelativeTo(null);



        JPanel regTopPanel = new JPanel();
        regTopPanel.setMaximumSize(new Dimension(500, 300));
        regTopPanel.setOpaque(false);

        JLabel regIcon = new JLabel();
        ImageIcon imageIcon = new ImageIcon("profileIconresizeTwo.png");
        regIcon.setIcon(imageIcon);
        regIcon.setHorizontalAlignment(JLabel.CENTER);
        regIcon.setVerticalAlignment(JLabel.CENTER);



        JPanel regNamePanel = new JPanel();
        regNamePanel.setMaximumSize(new Dimension(500, 100));
        regNamePanel.setOpaque(false);
        regNamePanel.setLayout(new BoxLayout(regNamePanel,BoxLayout.Y_AXIS));

        JLabel regNameLab = new JLabel();
        regNameLab.setText("name");
        regNameLab.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
        regNameLab.setMaximumSize(new Dimension(100,40));
        regNameLab.setAlignmentX(Component.CENTER_ALIGNMENT);
        regNameLab.setHorizontalAlignment(JLabel.CENTER);
        regNameLab.setForeground(Color.white);

        JTextField regNameText = new JTextField();
        regNameText.setMaximumSize(new Dimension(300,30));
        regNameText.setAlignmentX(Component.CENTER_ALIGNMENT);
        regNameText.setFont(new Font("Arial Rounded MT", Font.BOLD, 18));
        regNameText.setHorizontalAlignment(JTextField.CENTER);
        regNameText.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        regNameText.setOpaque(false);




        JPanel regUserPanel = new JPanel();
        regUserPanel.setMaximumSize(new Dimension(500, 100));
        regUserPanel.setLayout(new BoxLayout(regUserPanel,BoxLayout.Y_AXIS));
        regUserPanel.setOpaque(false);

        JLabel regUserLab = new JLabel();
        regUserLab.setText("username");
        regUserLab.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
        regUserLab.setMaximumSize(new Dimension(150,40));
        regUserLab.setAlignmentX(Component.CENTER_ALIGNMENT);
        regUserLab.setHorizontalAlignment(JLabel.CENTER);
        regUserLab.setForeground(Color.white);

        JTextField regUserText = new JTextField();
        regUserText.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
        regUserText.setAlignmentX(Component.CENTER_ALIGNMENT);
        regUserText.setMaximumSize(new Dimension(300,30));
        regUserText.setHorizontalAlignment(JTextField.CENTER);
        regUserText.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        regUserText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = regUserText.getText();
            }
        });
        regUserText.setOpaque(false);




        JPanel regPassPanel = new JPanel();
        regPassPanel.setMaximumSize(new Dimension(500, 100));
        regPassPanel.setLayout(new BoxLayout(regPassPanel,BoxLayout.Y_AXIS));
        regPassPanel.setOpaque(false);

        JLabel regPassLab = new JLabel();
        regPassLab.setText("password");
        regPassLab.setFont(new Font("Arial Rounded MT",Font.BOLD, 18));
        regPassLab.setMaximumSize(new Dimension(90,40));
        regPassLab.setAlignmentX(Component.CENTER_ALIGNMENT);
        regPassLab.setHorizontalAlignment(JLabel.CENTER);
        regPassLab.setForeground(Color.white);

        JPasswordField regPassText = new JPasswordField();
        regPassText.setMaximumSize(new Dimension(300,30));
        regPassText.setAlignmentX((Component.CENTER_ALIGNMENT));
        regPassText.setFont(new Font("Arial Rounded MT",Font.BOLD, 18));
        regPassText.setHorizontalAlignment(JTextField.CENTER);
        regPassText.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        regPassText.setOpaque(false);




        JPanel regPassPanelTwo = new JPanel();
        regPassPanelTwo.setMaximumSize(new Dimension(500, 100));
        regPassPanelTwo.setLayout(new BoxLayout(regPassPanelTwo,BoxLayout.Y_AXIS));
        regPassPanelTwo.setOpaque(false);

        JLabel regPassLabTwo = new JLabel();
        regPassLabTwo.setText("password");
        regPassLabTwo.setFont(new Font("Arial Rounded MT",Font.BOLD, 18));
        regPassLabTwo.setMaximumSize(new Dimension(90,40));
        regPassLabTwo.setAlignmentX(Component.CENTER_ALIGNMENT);
        regPassLabTwo.setHorizontalAlignment(JLabel.CENTER);
        regPassLabTwo.setForeground(Color.white);

        JPasswordField regPassTextTwo = new JPasswordField();
        regPassTextTwo.setMaximumSize(new Dimension(300,30));
        regPassTextTwo.setAlignmentX((Component.CENTER_ALIGNMENT));
        regPassTextTwo.setFont(new Font("Arial Rounded MT",Font.BOLD, 18));
        regPassTextTwo.setHorizontalAlignment(JTextField.CENTER);
        regPassTextTwo.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        regPassTextTwo.setOpaque(false);




        JPanel regDonePanel = new JPanel();
        regDonePanel.setMaximumSize(new Dimension(500, 100));
        regDonePanel.setLayout(new BoxLayout(regDonePanel,BoxLayout.X_AXIS));
        regDonePanel.setOpaque(false);

        JButton regBack = new JButton();
        regBack.setText("back");
        regBack.setFocusable(false);
        regBack.setAlignmentX(Container.LEFT_ALIGNMENT);
        regBack.setMaximumSize(new Dimension(250,40));
        regBack.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
        regBack.setBorder(BorderFactory.createEmptyBorder(5,50,5,50));
        regBack.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        regBack.setOpaque(false);
        regBack.setContentAreaFilled(false);

        JLabel regOrLab = new JLabel();
        regOrLab.setText("or");
        regOrLab.setMaximumSize(new Dimension(50,40));
        regOrLab.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
        regOrLab.setAlignmentX(Container.CENTER_ALIGNMENT);
        regOrLab.setBorder(BorderFactory.createEmptyBorder(5,15,5,5));

        JButton regDone = new JButton();
        regDone.setText("register");
        regDone.setFocusable(false);
        regDone.setAlignmentX(Container.RIGHT_ALIGNMENT);
        regDone.setMaximumSize(new Dimension(250,40));
        regDone.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
        regDone.setBorder(BorderFactory.createEmptyBorder(5,5,5,50));
        regDone.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        regDone.setOpaque(false);
        regDone.setContentAreaFilled(false);
        regDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = regNameText.getText().trim();
                String username = regUserText.getText().trim();
                char[] password = regPassText.getPassword();
                char[] passwordTwo = regPassTextTwo.getPassword();
                String passString = new String(password).trim();
                String passStringTwo = new String(passwordTwo).trim();
                if(username.isEmpty() || passString.isEmpty() || passStringTwo.isEmpty() || name.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the containers!");
                }else{
                    if(!passString.equals(passStringTwo)){
                        JOptionPane.showMessageDialog(null,"The passwords are not the same!", "Warning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        try{
                            FileWriter writer = new FileWriter("userinput.txt", true);
                            writer.write(name + "," + username + "," + passString + "," + "\n");
                            writer.close();
                            registerMain.dispose();
                            MainFrame mainFrame = new MainFrame();
                        }catch(IOException ex){
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });



        registerMain.add(regTopPanel);
        registerMain.add(regNamePanel);
        registerMain.add(regUserPanel);
        registerMain.add(regPassPanel);
        registerMain.add(regPassPanelTwo);
        registerMain.add(regDonePanel);
        regTopPanel.add(regIcon);
        regNamePanel.add(regNameLab);
        regNamePanel.add(regNameText);
        regUserPanel.add(regUserLab);
        regUserPanel.add(regUserText);
        regPassPanel.add(regPassLab);
        regPassPanel.add(regPassText);
        regPassPanelTwo.add(regPassLabTwo);
        regPassPanelTwo.add(regPassTextTwo);
        regDonePanel.add(regBack);
        regDonePanel.add(regOrLab);
        regDonePanel.add(regDone);

        registerMain.setVisible(true);
    }
}

