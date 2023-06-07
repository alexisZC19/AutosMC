/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 18/05/2023
 * fecha modificación:
 * Descripción: se creo la clase deportivo
 * 
 */
package entity;


public class Deportivo extends Vehiculo {
    private boolean twinturbo;
    private boolean supercharger;

    public Deportivo() {
    }

    public Deportivo(boolean twinturbo, boolean supercharger) {
        this.twinturbo = twinturbo;
        this.supercharger = supercharger;
    }

    public Deportivo(boolean twinturbo, boolean supercharger, String marca, String modelo, String tipo, String matricula, double velocidad, double distancia, double tiempo) {
        super(marca, modelo, tipo, matricula, velocidad, distancia, tiempo);
        this.twinturbo = twinturbo;
        this.supercharger = supercharger;
    }

    public boolean isTwinturbo() {
        return twinturbo;
    }

    public void setTwinturbo(boolean twinturbo) {
        this.twinturbo = twinturbo;
    }

    public boolean isSupercharger() {
        return supercharger;
    }

    public void setSupercharger(boolean supercharger) {
        this.supercharger = supercharger;
    }
    


    @Override
    public void setVelocidad(double velocidad){
        this.velocidad= this.getDistancia()/this.getTiempo();
    }

    
    
    
    
}
