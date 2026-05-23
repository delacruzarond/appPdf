package org.pdf;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.pdf.view.WindowStart;

import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        WindowStart windowStart = new WindowStart();
//        windowStart.setVisible(true);
      Probar probar = new Probar("aaron",15,true);

        ObjectMapper mapper = new ObjectMapper();

        File archivo= new File("guardar.json");

       try {

           mapper.writeValue(archivo,probar);
           System.out.println("guardado con exito");
       }catch (IOException e){

            System.err.println("error detectado : " + e.getMessage());
       };
    };
    }