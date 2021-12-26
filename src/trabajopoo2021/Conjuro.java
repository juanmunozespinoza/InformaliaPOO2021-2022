/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopoo2021;

import java.util.ArrayList;


/**
 *
 * @author Juan Muñoz
 */
public class Conjuro extends Recurso{


    private ArrayList<Ingrediente> ingredientes;

    public Conjuro(String nombre, int poderOfensivo, int poderDefensivo, int poderAstucia, boolean posesion) {
        super(nombre, poderOfensivo, poderDefensivo, poderAstucia, posesion);
    }

    /*Constructor alternativo
    public Conjuro(ArrayList<Ingrediente> ingredientes, String nombre, int poderOfensivo, int poderDefensivo, int poderAstucia, boolean posesion) {
        super(nombre, poderOfensivo, poderDefensivo, poderAstucia, posesion);
        this.ingredientes = ingredientes;
    }
    */
    

}
