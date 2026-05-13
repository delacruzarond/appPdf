package org.pdf.view;

import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {
    CardLayout control;
    JPanel groupInterfaces;
    //GridBagConstraints es el que  crea las celdas
    private GridBagConstraints gbc= new GridBagConstraints();

    public Login(CardLayout control, JPanel groupInterfaces){
        this.control=control;
        this.groupInterfaces=groupInterfaces;
        //setBackground(Color.red);
        setLayout(new GridBagLayout());//aqui se define el tipo de layout a usar
        componentesLogin();
    }
    private  void componentesLogin(){
        //creaa los margenes de cada elemento
        gbc.insets = new Insets(10,10,10,10);

        //label y field de uswer
        gbc.gridx=0;gbc.gridy=0;JLabel jlUsario = new JLabel("Usuarios"); add(jlUsario,gbc);
        gbc.gridx=1;gbc.gridy=0;JTextField jtUsuario = new JTextField(10);add(jtUsuario,gbc);

        //label y field de password
        gbc.gridx=0;gbc.gridy=1;JLabel jlPassword=new JLabel("Password");add(jlPassword,gbc);
        gbc.gridx=1;gbc.gridy=1;JPasswordField jpPassword = new JPasswordField(10);add(jpPassword,gbc);

        gbc.gridx=0;gbc.gridy=2;gbc.gridwidth=2;JButton jbButton= new JButton("Login");
        jbButton.addActionListener(e -> control.show(groupInterfaces,"id_InterfaceData"));add(jbButton,gbc);





    }
}
