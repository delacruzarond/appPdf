package org.pdf;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigJson {

    Map  <String, String> settings = new HashMap<>();




    public void resetFactory(){


        settings.put("Columna 1", "añadir patron regex 1");

        settings.put("Columna 2","añadir patron regex 2");

        settings.put("Columna 3","añadir patron regex 3");


    }

    public void loadConfig(){
        try {
            File archivo = new File("guardar.json");
            ObjectMapper mapper= new ObjectMapper();
            mapper.writeValue(archivo,settings);
        }catch (IOException  e){

            System.err.println("Error capturado: "+e.getMessage());
        }
    }



}

