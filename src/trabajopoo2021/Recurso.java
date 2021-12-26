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
//Superclase de Conjuro, Arma y Hechizo
public class Recurso {

    private String nombre;
    private int poderOfensivo;
    private int poderDefensivo;
    private int poderAstucia;
    private boolean posesion;

    //Constructor por defecto

    public Recurso(String nombre, int poderOfensivo, int poderDefensivo, int poderAstucia, boolean posesion) {
        this.nombre = nombre;
        this.poderOfensivo = poderOfensivo;
        this.poderDefensivo = poderDefensivo;
        this.poderAstucia = poderAstucia;
        this.posesion = posesion;
    }

}
