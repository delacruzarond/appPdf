package org.pdf;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfigJson {

    Map  <String, String> settings = new HashMap<>();
    File archivo = new File("guardar.json");
    ObjectMapper mapper = new  ObjectMapper();



    public void resetFactory(){
        settings.put("Columna 1", "añadir patron regex 1");
        settings.put("Columna 2","añadir patron regex 2");
        settings.put("Columna c","añadir patron regex c");
    }

    public void loadConfig(){
        try {
            mapper.writeValue(archivo,settings);
        }catch (IOException  e){
            System.err.println("Error capturado: "+e.getMessage());
        }
    }


    public void add(String key, String value){
        settings.put(key, value );
    }

    public Map<String,String> read(){

        try {
            this.settings = mapper.readValue(archivo, new TypeReference<Map<String,String>>(){});
            return this.settings;
        }catch (IOException e){
            System.err.println("Earror capturado al obtener datos json: " +e.getMessage() );
            return settings;
        }
    }



}

