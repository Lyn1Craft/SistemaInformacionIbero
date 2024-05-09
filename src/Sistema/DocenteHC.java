/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class DocenteHC extends Docente{
    
    protected int horasCatedra;

    public DocenteHC(String nombre, String ciudad, int edad, int identificacion, double sueldo, String profesion, int horasCatedra) {
        super(nombre, ciudad, edad, identificacion, sueldo, profesion);
        this.horasCatedra = horasCatedra;
    }

    public int getHorasCatedra() {
        return horasCatedra;
    }

    public void setHorasCatedra(int horasCatedra) {
        this.horasCatedra = horasCatedra;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getProfesion() {
        return profesion;
    }

    @Override
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Edad: "+edad);
        System.out.println("Identificación: "+ identificacion);
        System.out.println("Sueldo: " +sueldo);
        System.out.println("Profesion:" + profesion);
       
    }
    
    
    
}
