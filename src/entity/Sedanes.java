/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase Vehiculo
 * 
 */
package entity;


public class Sedanes extends Vehiculo{
    private boolean lujo;
    /**
     * Se creo el constructor vacio
     */
    public Sedanes() {
    }

    public Sedanes(boolean lujo) {
        this.lujo = lujo;
    }
    /**
 * se creo el constructor con la herencia de su elemento padre
     * @param lujo
     * @param marca
     * @param modelo
     * @param tipo
     * @param matricula
     * @param velocidad
     * @param distancia
     * @param tiempo
*/

    public Sedanes(boolean lujo, String marca, String modelo, String tipo, String matricula, double velocidad, double distancia, double tiempo) {
        super(marca, modelo, tipo, matricula, velocidad, distancia, tiempo);
        this.lujo = lujo;
    }




    public boolean isLujo() {
        return lujo;
    }

    public void setLujo(boolean lujo) {
        this.lujo = lujo;
    }
    
    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad=this.getDistancia()/this.getTiempo();
    }

  
}
