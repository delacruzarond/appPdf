package org.pdf;

public class Probar {




    String nombre;
    int edad;
    boolean activo;

    public Probar(String nombre, int edad, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

//    @Override
//    public String toString() {
//        return "Probar{" +
//                "nombre='" + nombre + '\'' +
//                ", edad=" + edad +
//                ", activo=" + activo +
//                '}';
//    }
}
