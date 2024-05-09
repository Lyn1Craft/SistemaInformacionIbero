/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public abstract class Administrativo  extends Persona{
    
    protected String departamento, cargo;

    public Administrativo(String nombre, String ciudad, int edad, int identificacion, String departamento, String cargo) {
        super(nombre, ciudad, edad, identificacion);
        this.departamento = departamento;
        this.cargo = cargo;
        
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
    @Override
    public abstract void mostrarDatos();
    
}
