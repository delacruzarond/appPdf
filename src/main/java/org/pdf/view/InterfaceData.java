package org.pdf.view;

import javax.smartcardio.Card;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InterfaceData extends JPanel {
    private JButton jbSearchFile;
    private GridBagConstraints gbc = new GridBagConstraints();
    private CardLayout control;
    private JButton jbExit;
    private JTextField jtFieldFile;
    private JPanel groupIntereces;
    private JButton jbSettings;
         public InterfaceData(CardLayout control,JPanel groupIntereces){
             this.control=control;
             this.groupIntereces=groupIntereces;
             setBackground(Color.ORANGE);
             setLayout(new GridBagLayout());
             buttonLabelLogin();
             tableLogin();
             buttonExitSettings();
         }
         private void buttonLabelLogin(){

            gbc.insets = new Insets(10,10,10,10);
             //boton buscar archivo
             gbc.gridx=0;gbc.gridy=0; jbSearchFile= new JButton("Search File ");add(jbSearchFile,gbc);
             jbSearchFile.addActionListener(e ->{
                 JFileChooser selector = new JFileChooser();//crearmos selector de archivos
                 selector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //especificamos que solo eleija carpetas
                 int resultado = selector.showOpenDialog(this);
                 // 4. Verificamos si el usuario aceptó (hizo clic en "Abrir" o "Seleccionar")
                 if (resultado==JFileChooser.APPROVE_OPTION){
                     String pathSelection = selector.getSelectedFile().getAbsolutePath();
                     jtFieldFile.setText(pathSelection);
                 }

             });
             gbc.gridx=1;gbc.gridy=0; jtFieldFile= new JTextField(10);
             gbc.fill=GridBagConstraints.HORIZONTAL;

             add(jtFieldFile,gbc);
             //tableLogin();


         }
         public void tableLogin(){
             gbc.gridx=0;gbc.gridy=1;
             gbc.gridwidth=2;
             gbc.weightx=1.0;
             gbc.weighty=1.0;
             gbc.fill=GridBagConstraints.BOTH;//rellene todo el espacio disponibole
             String[] columnas = {"ID", "Nombre", "Estado", "Fecha"};

             DefaultTableModel modelo = new DefaultTableModel(columnas,5);
             JTable table = new JTable(modelo);

             JScrollPane scrollTable = new JScrollPane(table);
             add(scrollTable,gbc);

         }

         private void buttonExitSettings(){
            gbc.insets = new Insets(10,10,10,10);
            gbc.gridwidth=1;
            //boton exit
            gbc.gridx=0;gbc.gridy=2;
            gbc.weighty=0.0; //indica que no se estire a lo lato
            gbc.fill=GridBagConstraints.NONE; //por defecto se estirará a lo hancho.y esto hara que no lo haga
            jbExit = new JButton("Exit");

            jbExit.addActionListener(e -> control.show(groupIntereces,"id_Login"));
            //gbc.fill=GridBagConstraints.NONE;
            add(jbExit,gbc);

            //boton Settings
            gbc.gridx=1;gbc.gridy=2;gbc.weighty=0.0;
            gbc.fill= GridBagConstraints.NONE;

            jbSettings = new JButton("Settings");
            add(jbSettings,gbc);
         }



}
