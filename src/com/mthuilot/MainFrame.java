package com.mthuilot;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainFrame {
    MainFrame(){
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Log-in or Register | Rizz Academy©");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setPreferredSize(new Dimension(700,500));
        ImageIcon mainImage = new ImageIcon("Rizz Academy-logos_black_resize.png");
        mainFrame.setIconImage(mainImage.getImage());
        mainFrame.getContentPane().setBackground(new Color(0x5865F2));
        mainFrame.setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.Y_AXIS));
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);


        JPanel topPanel = new JPanel();
        topPanel.setSize(700,50);
        topPanel.setBackground(Color.red);
        topPanel.setOpaque(false);

        JLabel topImage = new JLabel();
        ImageIcon imageIcon = new ImageIcon("Rizz Academy-logos_black_resize.png");
        topImage.setIcon(imageIcon);
        topImage.setHorizontalAlignment(JLabel.CENTER);
        topImage.setVerticalAlignment(JLabel.CENTER);




        JPanel userPanel = new JPanel();
        userPanel.setSize(700,100);
        userPanel.setBackground(Color.CYAN);
        userPanel.setLayout(new BoxLayout(userPanel,BoxLayout.Y_AXIS));
        userPanel.setOpaque(false);

        JLabel userLabel = new JLabel();
        userLabel.setText("username");
        userLabel.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
        userLabel.setMaximumSize(new Dimension(90,40));
        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        userLabel.setForeground(Color.white);

        JTextField userText = new JTextField();
        userText.setMaximumSize(new Dimension(300,30));
        userText.setAlignmentX(Component.CENTER_ALIGNMENT);
        userText.setFont(new Font("Arial Rounded MT", Font.BOLD, 18));
        userText.setHorizontalAlignment(JButton.CENTER);
        userText.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        userText.setOpaque(false);




        JPanel passPanel = new JPanel();
        passPanel.setSize(700,100);
        passPanel.setBackground(Color.BLUE);
        passPanel.setLayout(new BoxLayout(passPanel,BoxLayout.Y_AXIS));
        passPanel.setOpaque(false);

        JLabel passLabel = new JLabel();
        passLabel.setText("password");
        passLabel.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
        passLabel.setMaximumSize(new Dimension(90,40));
        passLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        passLabel.setForeground(Color.white);

        JPasswordField passText = new JPasswordField();
        passText.setMaximumSize(new Dimension(300,30));
        passText.setAlignmentX(Component.CENTER_ALIGNMENT);
        passText.setFont(new Font("Arial Rounded MT", Font.BOLD, 18));
        passText.setHorizontalAlignment(JButton.CENTER);
        passText.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        passText.setOpaque(false);




        JPanel emptyPanel = new JPanel();
        emptyPanel.setSize(700,100);
        emptyPanel.setBackground(Color.DARK_GRAY);
        emptyPanel.setOpaque(false);




        JPanel bottomPanel = new JPanel();
        bottomPanel.setSize(700,100);
        bottomPanel.setBackground(Color.GREEN);
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        bottomPanel.setOpaque(false);

        JButton loginBut = new JButton();
        loginBut.setText("log-in");
        loginBut.setFocusable(false);
        loginBut.setMaximumSize(new Dimension(270,30));
        loginBut.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
        loginBut.setBorder(BorderFactory.createEmptyBorder(5,15,5,0));
        loginBut.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        loginBut.setAlignmentX(Container.LEFT_ALIGNMENT);
        loginBut.setOpaque(false);
        loginBut.setContentAreaFilled(false);
        loginBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                char[] password = passText.getPassword();
                String passString = new String(password);
                if(username.isEmpty() || passString.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the containers or if you are new click register");
                }else{
                    try{
                        BufferedReader reader = new BufferedReader(new FileReader("userinput.txt"));
                        String line = reader.readLine();
                        while (line !=null){
                            String[] parts = line.split(",");
                            if(username.equals(parts[1]) && passString.equals(parts[2])){
                                JOptionPane.showMessageDialog(null, "Login successful!");
                                return;
                            }
                            line = reader.readLine();
                        }
                        JOptionPane.showMessageDialog(null, "Invalid email or password.");
                        reader.close();
                    }catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

            }
        });

        JLabel orLabel = new JLabel();
        orLabel.setText("or");
        orLabel.setMaximumSize(new Dimension(50,40));
        orLabel.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
        orLabel.setAlignmentX(Container.CENTER_ALIGNMENT);
        orLabel.setBorder(BorderFactory.createEmptyBorder(5,15,5,5));

        JButton registerBut = new JButton();
        registerBut.setText("register");
        registerBut.setFocusable(false);
        registerBut.setMaximumSize(new Dimension(270,30));
        registerBut.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
        registerBut.setBorder(BorderFactory.createEmptyBorder(5,0,5,5));
        registerBut.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        registerBut.setAlignmentX(Container.RIGHT_ALIGNMENT);
        registerBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
                RegisterMain registerMain = new RegisterMain();
            }
        });
        registerBut.setOpaque(false);
        registerBut.setContentAreaFilled(false);














        mainFrame.add(topPanel);
        mainFrame.add(userPanel);
        mainFrame.add(passPanel);
        mainFrame.add(emptyPanel);
        mainFrame.add(bottomPanel);
        topPanel.add(topImage);
        userPanel.add(userLabel);
        userPanel.add(userText);
        passPanel.add(passLabel);
        passPanel.add(passText);
        bottomPanel.add(loginBut);
        bottomPanel.add(orLabel);
        bottomPanel.add(registerBut);
        mainFrame.setVisible(true);

    }

}


