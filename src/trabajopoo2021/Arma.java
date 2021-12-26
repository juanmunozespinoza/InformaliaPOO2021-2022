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
public class Arma extends Recurso{
    
    private int mango;
    private double rangoAccion;



    public Arma(int mango, double rangoAccion, String nombre, int poderOfensivo, int poderDefensivo, int poderAstucia, boolean posesion) {
        super(nombre, poderOfensivo, poderDefensivo, poderAstucia, posesion);
        this.mango = mango;
        this.rangoAccion = rangoAccion;
    }
}
