package com.mthuilot;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame extends JFrame {
    RegisterFrame() {
        this.setTitle("Register");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("Rizz Academy-logos_black_resize");
        this.setIconImage(image.getImage());
        this.setPreferredSize(new Dimension(500, 900));
        this.getContentPane().setBackground(new Color(0x5865F2));
        this.setResizable(false);
    }

    public static class RegisterIcon extends JPanel {
        RegisterIcon() {
            this.setMaximumSize(new Dimension(500, 300));
            this.setOpaque(false);
        }
        public static class RegisterLogo extends JLabel {
            RegisterLogo() {
                ImageIcon imageIcon = new ImageIcon("profileIconresizeTwo.png");
                this.setIcon(imageIcon);
                this.setHorizontalAlignment(JLabel.CENTER);
                this.setVerticalAlignment(JLabel.CENTER);
            }
        }
    }
        public static class RegisterName extends JPanel {
            RegisterName() {

                this.setMaximumSize(new Dimension(500, 100));
                this.setOpaque(false);
                this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            }
            public static class RegisterNameLabel extends JLabel{
                RegisterNameLabel(){
                    this.setText("name");
                    this.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
                    this.setMaximumSize(new Dimension(100,40));
                    this.setAlignmentX(Component.CENTER_ALIGNMENT);
                    this.setHorizontalAlignment(JLabel.CENTER);
                    this.setForeground(Color.white);
                }
            }
            public static class RegisterNameField extends JTextField{
                RegisterNameField(){
                    this.setMaximumSize(new Dimension(300,30));
                    this.setAlignmentX(Component.CENTER_ALIGNMENT);
                    this.setFont(new Font("Arial Rounded MT", Font.BOLD, 18));
                    this.setHorizontalAlignment(JTextField.CENTER);
                    this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
                    this.setOpaque(false);
                }
            }
        }
        public static class RegisterSurname extends JPanel {
            RegisterSurname() {
                this.setMaximumSize(new Dimension(500, 100));
                this.setOpaque(false);
                this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            }
            public static class RegisterSurnameLabel extends JLabel{
                RegisterSurnameLabel(){
                    this.setText("surname");
                    this.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
                    this.setMaximumSize(new Dimension(150,40));
                    this.setAlignmentX(Component.CENTER_ALIGNMENT);
                    this.setHorizontalAlignment(JLabel.CENTER);
                    this.setForeground(Color.white);
                }
            }
            public static class RegisterSurnameField extends JTextField{
                RegisterSurnameField(){
                    this.setFont(new Font("Arial Rounded MT",Font.BOLD,18));
                    this.setAlignmentX(Component.CENTER_ALIGNMENT);
                    this.setMaximumSize(new Dimension(300,30));
                    this.setHorizontalAlignment(JTextField.CENTER);
                    this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
                    this.setOpaque(false);
                }
            }
        }

        public static class RegisterPassOne extends JPanel {
            RegisterPassOne() {
                this.setMaximumSize(new Dimension(500, 100));
                this.setOpaque(false);
                this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            }
            public static class RegisterPassLabel extends JLabel{
                RegisterPassLabel(){
                    this.setText("password");
                    this.setFont(new Font("Arial Rounded MT",Font.BOLD, 18));
                    this.setMaximumSize(new Dimension(90,40));
                    this.setAlignmentX(Component.CENTER_ALIGNMENT);
                    this.setHorizontalAlignment(JLabel.CENTER);
                    this.setForeground(Color.white);
                }
            }
            public static class RegisterPassField extends JTextField{
                RegisterPassField(){
                    this.setMaximumSize(new Dimension(300,30));
                    this.setAlignmentX((Component.CENTER_ALIGNMENT));
                    this.setFont(new Font("Arial Rounded MT",Font.BOLD, 18));
                    this.setHorizontalAlignment(JTextField.CENTER);
                    this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
                    this.setOpaque(false);
                }
            }
        }
        public static class RegisterPassTwo extends JPanel {
            RegisterPassTwo() {
                this.setMaximumSize(new Dimension(500, 100));
                this.setOpaque(false);
                this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            }
            public static class RegisterPassTwoField extends JTextField{
                RegisterPassTwoField(){
                    this.setMaximumSize(new Dimension(300,30));
                    this.setAlignmentX((Component.CENTER_ALIGNMENT));
                    this.setFont(new Font("Arial Rounded MT",Font.BOLD, 18));
                    this.setHorizontalAlignment(JTextField.CENTER);
                    this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
                    this.setOpaque(false);
                }
            }
        }
        public static class RegisterButtonDone extends JPanel {
            RegisterButtonDone() {
                this.setMaximumSize(new Dimension(500, 100));
                this.setOpaque(false);
                this.setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));
            }
            public static class RegisterBackButton extends JButton {
                RegisterBackButton(){
                    this.setText("back");
                    this.setFocusable(false);
                    this.setMaximumSize(new Dimension(200,40));
                    this.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
                    this.setAlignmentX(Container.LEFT_ALIGNMENT);
                    this.setBorder(BorderFactory.createEmptyBorder(5,5,5,50));
                    this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                    this.setOpaque(false);
                    this.setContentAreaFilled(false);
                }
            }
            /*
            public static class RegOrLabel extends JLabel {
                RegOrLabel(){
                    this.setText("or");
                    this.setMaximumSize(new Dimension(50,40));
                    this.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
                    this.setAlignmentX(Container.CENTER_ALIGNMENT);
                    this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
                }
            }

             */
            public static class RegisterDoneButton extends JButton {
                RegisterDoneButton(){
                    this.setText("register");
                    this.setFocusable(false);
                    this.setMaximumSize(new Dimension(200,40));
                    this.setFont(new Font("Arial Rounded MT", Font.BOLD,18));
                    this.setAlignmentX(Container.RIGHT_ALIGNMENT);
                    this.setBorder(BorderFactory.createEmptyBorder(5,5,5,50));
                    this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                    this.setOpaque(false);
                    this.setContentAreaFilled(false);
                }
            }

        }
    }

