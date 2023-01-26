package com.mthuilot;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
    MainFrame(){
        this.setTitle("Click buttons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setPreferredSize(new Dimension(700,500));
        ImageIcon image = new ImageIcon("Rizz Academy-logos_black_resize");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x5865F2));


        this.setVisible(true);
    }
    public static class TopPanel extends JPanel {
        TopPanel() {

            this.setSize(700,50);
            this.setOpaque(false);



        }
        public static class MainIcon extends JLabel{
            MainIcon(){
                ImageIcon imageIcon = new ImageIcon("Rizz Academy-logos_black_resize.png");
                this.setIcon(imageIcon);
                this.setHorizontalAlignment(JLabel.CENTER);
                this.setVerticalAlignment(JLabel.CENTER);
            }
        }
    }
    public static class UserPanel extends JPanel {


        UserPanel() {
            this.setSize(700, 100);
           this.setOpaque(false);
            this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));


        }
        public static class UserLabel extends JLabel{
            UserLabel(){
                this.setText("username");
                this.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
                this.setMaximumSize(new Dimension(90,40));
                this.setAlignmentX(Component.CENTER_ALIGNMENT);
                this.setForeground(Color.white);

            }
        }
        public static class UserText extends JTextField {
            UserText() {
                this.setMaximumSize(new Dimension(300,30));
                this.setAlignmentX(Component.CENTER_ALIGNMENT);
                this.setFont(new Font("Arial Rounded MT", Font.BOLD, 18));
                this.setHorizontalAlignment(JButton.CENTER);
                this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
                this.setOpaque(false);



            }
        }
        }
    public static class PassPanel extends JPanel {
        PassPanel(){
            this.setSize(700,100);
            this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            this.setOpaque(false);


        }
        public static class PassLabel extends JLabel{
            PassLabel(){
                this.setText("password");
                this.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
                this.setMaximumSize(new Dimension(90,40));
                this.setAlignmentX(Component.CENTER_ALIGNMENT);
                this.setForeground(Color.white);
            }
        }
        public static class PassText extends JTextField {
            PassText() {
                this.setMaximumSize(new Dimension(300,30));
                this.setAlignmentX(Component.CENTER_ALIGNMENT);
                this.setFont(new Font("Arial Rounded MT", Font.BOLD, 18));
                this.setHorizontalAlignment(JButton.CENTER);
                this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
                this.setOpaque(false);
            }
        }
    }

    public static class EmptyPanel extends JPanel {
        EmptyPanel(){
            this.setOpaque(false);
            //this is a empty panel
        }
    }
    public static class BottomPanel extends JPanel {

        BottomPanel(){
            this.setSize(700,100);
            this.setOpaque(false);

            this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        }
        public static class LoginButton extends JButton {
            LoginButton(){
                this.setText("log-in");
                this.setFocusable(false);
                this.setMaximumSize(new Dimension(270,30));
                this.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
                this.setBorder(BorderFactory.createEmptyBorder(5,15,5,0));
                this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                this.setAlignmentX(Container.LEFT_ALIGNMENT);
                this.setOpaque(false);
                this.setContentAreaFilled(false);
            }
        }

        public static class OrLabel extends JLabel {
            OrLabel(){
                this.setText("or");
                this.setMaximumSize(new Dimension(50,40));
                this.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
                this.setAlignmentX(Container.CENTER_ALIGNMENT);
                this.setBorder(BorderFactory.createEmptyBorder(5,15,5,5));
            }
        }


        public static class RegisterButton extends JButton implements ActionListener {
                RegisterButton(){
                    this.setText("register");
                    this.setFocusable(false);
                    this.setMaximumSize(new Dimension(270,30));
                    this.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
                    this.setBorder(BorderFactory.createEmptyBorder(5,0,5,5));
                    this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                    this.setAlignmentX(Container.RIGHT_ALIGNMENT);
                    this.addActionListener(this);
                    this.setOpaque(false);
                    this.setContentAreaFilled(false);
                }

                @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==this) {

                        RegisterMain registerMain = new RegisterMain();

                }
            }
        }
    }
}
