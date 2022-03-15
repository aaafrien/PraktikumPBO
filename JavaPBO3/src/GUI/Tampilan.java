/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author asus
 */
public class Tampilan extends JFrame {
    JLabel userName, passWord;
    JTextField inputUname;
    JPasswordField inputPw;
    JButton btLogin, btCancel;

    public Tampilan(){
        setTitle("Login");
        setVisible(true);
        setSize(300,190);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        userName = new JLabel("Username :");
        passWord = new JLabel("Password :");
        inputUname = new JTextField();
        inputPw = new JPasswordField();
        btLogin = new JButton("Login");
        btCancel = new JButton("Cancel");
        
        setLayout(null);
        add(userName);
        add(passWord);
        add(inputUname);
        add(inputPw);
        add(btLogin);
        add(btCancel);
        
        userName.setBounds(25, 25, 70, 20);
        inputUname.setBounds(100, 25, 160, 20);
        passWord.setBounds(25, 55, 70, 20);
        inputPw.setBounds(100, 55, 160, 20);
        btLogin.setBounds(45, 100, 80, 20);
        btCancel.setBounds(155, 100, 80, 20);
    }
}
