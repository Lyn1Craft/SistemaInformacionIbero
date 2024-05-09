/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class EstudiantePregrado extends Estudiante {

    public EstudiantePregrado(String nombre, String ciudad, int edad, int identificacion, String programa, String codigoEstudiante) {
        super(nombre, ciudad, edad, identificacion, programa, codigoEstudiante);
    }


    @Override
    public String getPrograma() {
        return programa;
    }

    @Override
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    @Override
    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Edad: "+edad);
        System.out.println("Identificación: "+ identificacion);
        System.out.println("Programa: " +programa);
        System.out.println("Codigo Estudiante:" + codigoEstudiante);
        
       
        
        

}
    
}
