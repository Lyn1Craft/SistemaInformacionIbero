/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public abstract class Estudiante extends Persona{
    
    protected String programa, codigoEstudiante;

    public Estudiante(String nombre, String ciudad, int edad, int identificacion, String programa, String codigoEstudiante) {
        super(nombre, ciudad, edad, identificacion);
        this.programa = programa;
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    
    
    @Override
    public abstract void mostrarDatos();
    
    
    
 
}
