package org.pdf.view;

import javax.swing.*;
import java.awt.*;

public class WindowStart extends JFrame {
    CardLayout control;
    JPanel groupInterfaces;
    Login login;
    InterfaceData interfaceData;
    public WindowStart() {
        setSize(400,400);
        setTitle("Proyecto PDF");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loadInterfaces();
    }

    private void  loadInterfaces(){
        control = new CardLayout();
        groupInterfaces = new JPanel(control);
        login= new Login(control,groupInterfaces);
        interfaceData = new InterfaceData(control,groupInterfaces);
        groupInterfaces.add(login,"id_Login");
        groupInterfaces.add(interfaceData,"id_InterfaceData");
        add(groupInterfaces);

    }



}
