/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopoo2021;

/**
 *
 * @author Juan Muñoz
 */

//Superclase de Mago, Guerrero, Explorador
public class Personaje {
     
    
    private String nnl;//No se si es necesario
    private String nombre;
    private String raza;
    private int fuerza;
    private int destreza;
    private int inteligencia;
    private int vitalidad;
    
        public Personaje(String code){
        nnl = code;
        nombre = "";
        raza = "";
        fuerza = 1;
        destreza = 1;
        inteligencia = 1;
        vitalidad = 1;
    }
    public Personaje(String code, String name, String race, int fz, int dtz, int intg, int vtdd){
        nnl = code;
        nombre = name;
        raza = race;
        fuerza = fz;
        destreza = dtz;
        inteligencia = intg;
        vitalidad = vtdd;
    }
    public Personaje(String code, String name, String race){
        nnl = code;
        nombre = name;
        raza = race;
        fuerza = 1;
        destreza = 1;
        inteligencia = 1;
        vitalidad = 1;
    }
    
    public String getNNL(){
        return nnl;
    }
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public int getFuerza(){
        return fuerza;
    }
    public int getDestreza(){
        return destreza;
    }
    public int getInteligencia(){
        return inteligencia;
    }
    public int getVitalidad(){
        return vitalidad;
    }
    public void setNNL(String nuevoNNL){
        nnl = nuevoNNL;
    }
    public void setNombre(String nuevoNombre){
        nnl = nuevoNombre;
    }
    public void setRaza(String nuevaRaza){
        nnl = nuevaRaza;
    }
    public void setFuerza(int nuevaFuerza){
        fuerza = nuevaFuerza;
    }
    public void setDestreza(int nuevaDestreza){
        destreza = nuevaDestreza;
    }
    public void setInteligencia(int nuevaInteligencia){
        inteligencia = nuevaInteligencia;
    }
    public void setVitalidad(int nuevaVitalidad){
        vitalidad = nuevaVitalidad;
    }
    
    public int atacar (Recurso r){
        //Por implementar
        return 0;
    }
    
    public int defender (Recurso r){
        //Por implementar
        return 0;
    }
    
        
    public int astucia (Recurso r){
        //Por implementar
        return 0;
    }
    
    public void iniciativaCombate (Personaje p){
        //Por implementar

    }
    
    public void iniciativaCombateAleatorio (){
        //Por implementar

    }
    
    
    
}
