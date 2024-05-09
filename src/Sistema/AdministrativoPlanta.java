/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class AdministrativoPlanta extends Administrativo{
    protected int horasTrabajo;

    public AdministrativoPlanta( String nombre, String ciudad, int edad, int identificacion, String departamento, String cargo, int horasTrabajo) {
        super(nombre, ciudad, edad, identificacion, departamento, cargo);
        this.horasTrabajo = horasTrabajo;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    @Override
    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
    @Override
    public void mostrarDatos(){
        
        System.out.println("Nombre: "+ nombre);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Edad: "+edad);
        System.out.println("Identificación: "+ identificacion);
        System.out.println("Departamento: " +departamento);
        System.out.println("Cargo: "+cargo);
        System.out.println("Horas de trabajo: " +horasTrabajo);
        
    
        
        
    }
    
}
