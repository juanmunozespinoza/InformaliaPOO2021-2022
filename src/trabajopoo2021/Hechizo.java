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
public class Hechizo extends Recurso{
    
    private String naturaleza;

    public Hechizo(String nombre, int poderOfensivo, int poderDefensivo, int poderAstucia, boolean posesion, String naturaleza) {
        super(nombre, poderOfensivo, poderDefensivo, poderAstucia, posesion);
        this.naturaleza = naturaleza;
    }
}
