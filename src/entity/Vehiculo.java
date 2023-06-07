/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripcion: se creo la clase vehiculo
 * 
 */
package entity;


public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String tipo;
    private String matricula;
    protected double velocidad;
    private double distancia;
    private double tiempo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String tipo, String matricula, double velocidad, double distancia, double tiempo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.matricula = matricula;
        this.velocidad = velocidad;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }
    

  
    
    /*
    public abstract void velocidades();*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    
    
    public double getVelocidad() {
        return velocidad;
    }

    public abstract void setVelocidad(double velocidad); 
    
  
 
 
 
 
}