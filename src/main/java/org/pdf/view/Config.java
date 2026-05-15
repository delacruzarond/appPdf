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
        buttonReturn();
    }

    private void buttonReturn(){
        jbButtonReturn = new JButton("back");
    }

    }
