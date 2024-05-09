/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public abstract class Docente extends Persona {
    
    protected double sueldo;
    protected String profesion;

    public Docente(String nombre, String ciudad, int edad, int identificacion, double sueldo, String profesion) {
        super(nombre, ciudad, edad, identificacion);
        this.sueldo = sueldo;
        this.profesion = profesion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
    
    @Override
    public abstract void mostrarDatos();
      
   
    }
    
   
    
    
    

