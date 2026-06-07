package org.pdf.view;

import org.pdf.ConfigJson;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Config extends JPanel {
    private CardLayout control;
    private JPanel groupInterfaces;
    JButton jbButtonReturn;
    JButton jbButtonExit;
    ConfigJson configJson = new ConfigJson();
    //GridBagConstraints es el que  crea las celdas
    private GridBagConstraints gbc = new GridBagConstraints();

    public  Config(CardLayout control,JPanel groupInterfaces){
        this.control= control;
        this.groupInterfaces=groupInterfaces;
        setLayout(new GridBagLayout());
        gbc.insets = new Insets(    10,10,10,10);
        etiquetas();
//        buttonReturn();
//        buttonExit();

    }

    private  void etiquetas(){
        List <String> valor = new ArrayList<>(configJson.read().keySet());

        for (int i=0;i<valor.toArray().length;i++){
            gbc.gridx=0;
            gbc.gridy=i;
            JTextField etiqueta = new JTextField(valor.get(i),10  );
            add(etiqueta,gbc);


        }


    }
    private void buttonReturn(){
        gbc.gridx=0;
        gbc.gridy=1;
        jbButtonReturn = new JButton("back");
        jbButtonReturn.addActionListener(e -> control.show(groupInterfaces,"id_InterfaceData"));
        add(jbButtonReturn,gbc);
    }

    private  void  buttonExit(){
        gbc.gridx=1;
        gbc.gridy=1;
        jbButtonExit = new JButton("Exit");
        jbButtonExit.addActionListener(e -> control.show(groupInterfaces,"id_Login"));
        add(jbButtonExit,gbc);
    }



    }
