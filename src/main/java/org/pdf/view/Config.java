package org.pdf.view;

import javax.swing.*;
import java.awt.*;

public class Config extends JPanel {
    private CardLayout control;
    private JPanel groupInterfaces;
    JButton jbButtonReturn;
    //GridBagConstraints es el que  crea las celdas
    private GridBagConstraints gbc = new GridBagConstraints();
    public  Config(CardLayout control,JPanel groupInterfaces){
        this.control= control;
        this.groupInterfaces=groupInterfaces;
        setLayout(new GridBagLayout());
        gbc.insets = new Insets(    10,10,10,10);
        buttonReturn();
        buttonExit();
    }


    private void buttonReturn(){
        gbc.gridx=0;
        gbc.gridy=0;
        jbButtonReturn = new JButton("back");
        add(jbButtonReturn,gbc);
    }

    private  void  buttonExit(){
        gbc.gridx=1;
        gbc.gridy=0;
        jbButtonReturn = new JButton("Exit");
        add(jbButtonReturn,gbc);
    }
    }
