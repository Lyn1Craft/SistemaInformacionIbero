/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class AdministrativoHoras extends Administrativo {
    
    protected double salarioPorHora;
    protected int horasTrabajadas;

    public AdministrativoHoras(String nombre, String ciudad, int edad, int identificacion, String departamento, String cargo, double salarioPorHora, int horasTrabajadas) {
        super(nombre, ciudad, edad, identificacion, departamento, cargo);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(float salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
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
        System.out.println("Horas Trabajadas: " +horasTrabajadas);
    
       
    
    }
           
    
}
