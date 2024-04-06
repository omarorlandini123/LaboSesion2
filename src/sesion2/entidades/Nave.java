/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.entidades;

import sesion2.abstracciones.Personaje;

/**
 *
 * @author Estudiante
 */
public class Nave extends Personaje {
    
    private int puntaje;

        
    public Nave(int vidas, int nivel, int puntaje) {
        super(nivel,vidas);
        this.puntaje = puntaje;
    }

    public Nave() { }

    public int getPuntaje() {
        return puntaje;
    }
 
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    

    
}
