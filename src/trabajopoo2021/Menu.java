/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopoo2021;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author espar
 */
public class Menu {
    ArrayList <Personaje> personajes = new ArrayList <Personaje>();
    ArrayList <Recurso> recursos = new ArrayList <Recurso>();
    
    /*
    Se obtiene un numro aleatorio entre 0 y 6
    */
    private int obtenerNumeroAleatorio (){
        int numero= (int) ((Math.random()* 6)+1) ;
        return numero;
    }
    
    /*
    Se obtiene el numero de veces que se ha obtenido un numero mayor o igual a 5
    */
    private int obtenerPuntaje(int puntaje){
        int numExitos=0;
        for (int i = 0; i < puntaje; i++) 
            if(obtenerNumeroAleatorio()>=5) numExitos++;                
            
        return numExitos;
    }
    
    public void combate(Personaje p1, Personaje p2){
        boolean p1Atacante= true;
        
        int recursoP1;
        int recursoP2;
        
        int valorP1;
        int valorP2;
        
        if(p1Atacante){
            recursoP1=3;
        }else{
            recursoP1=3;
        }
        
        if(!p1Atacante){
            recursoP2=4;
        }else{
            recursoP2=3;
        }
        
        valorP1= obtenerPuntaje(recursoP1);
        valorP2= obtenerPuntaje(recursoP2);
        
        if(valorP1>valorP2){
            //El personaje defensor pierde un punto de vitalidad
        }
    }
    public Personaje darAltaP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el codigo: ");
        String nnlP = sc.toString();
        System.out.println("Introduzca el nombre: ");
        String name = sc.toString();
        System.out.println("Introduzca la raza: ");
        String race = sc.toString();
   
        Personaje p1;
        p1 = new Personaje(nnlP, name, race); 
        personajes.add(p1);
        return p1;
    }
    public void darBajaP(Personaje p){
        /*Scanner sc = new Scanner(System.in);
        String nnlP = sc.toString();
        for(int i=0; i<personajes.size();i++){
            if(nnlP == personajes.get(i).getNNL()){
                personajes.remove(personajes.get(i));
            }
        }*/
        personajes.remove(p);
    }
    public Personaje modificar(Personaje p){
        System.out.println("1. NNL");
        System.out.println("2. Nombre");
        System.out.println("3. Raza");
        System.out.println("4. Fuerza");
        System.out.println("5. Destreza");
        System.out.println("6. Inteligencia");
        System.out.println("7. Vitalidad");
        System.out.println("Introduzca la caraacteristica que desee cambiar: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        
        
        switch (opcion){
            case 1: System.out.println("Nuevo codigo: ");
                String nuevoNNL = sc.toString();
                p.setNNL(nuevoNNL);
            case 2: System.out.println("Nuevo nombre: ");
                String nuevoNombre = sc.toString();
                p.setNombre(nuevoNombre);
            case 3: System.out.println("Nueva raza: ");
                String nuevaRaza = sc.toString();
                p.setRaza(nuevaRaza);
            case 4: System.out.println("Nueva fuerza: ");
                int nuevaFuerza = sc.nextInt();
                p.setFuerza(nuevaFuerza);
            case 5: System.out.println("Nueva destreza: ");
                int nuevaDestreza = sc.nextInt();
                p.setDestreza(nuevaDestreza);
            case 6: System.out.println("Nueva inteligencia: ");
                int nuevaInteligencia = sc.nextInt();
                p.setInteligencia(nuevaInteligencia);
            case 7: System.out.println("Nueva vitalidad: ");
                int nuevaVitalidad = sc.nextInt();
                p.setVitalidad(nuevaVitalidad);
        }
        return p;
    }
    
    public void visualizar(Personaje p){
        System.out.println("Codigo: "+p.getNNL());
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Raza: "+p.getRaza());
        System.out.println("Fuerza: "+p.getFuerza());
        System.out.println("Destreza: "+p.getDestreza());
        System.out.println("Inteligencia: "+p.getInteligencia());
        System.out.println("Vitalidad: "+p.getVitalidad());
    }
    
}
