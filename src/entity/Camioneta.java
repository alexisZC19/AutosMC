/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase Camioneta
 *
 */
package entity;

public class Camioneta extends Vehiculo {

    private boolean baul;

    /**
     * se creo el constructor vacío
     */
    public Camioneta() {
    }

    public Camioneta(boolean baul) {
        this.baul = baul;
    }

    public Camioneta(boolean baul, String marca, String modelo, String tipo, String matricula, double velocidad, double distancia, double tiempo) {
        super(marca, modelo, tipo, matricula, velocidad, distancia, tiempo);
        this.baul = baul;
    }

    public boolean isBaul() {
        return baul;
    }

    public void setBaul(boolean baul) {
        this.baul = baul;
    }

    
    

    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad=this.getDistancia()/this.getTiempo();
    }

   
    

}
