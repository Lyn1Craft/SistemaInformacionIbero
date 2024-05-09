/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.util.Scanner;

public class DocenteMT extends Docente{
    Scanner scanner =new Scanner(System.in);
    protected int horasTrabajadas;

    public DocenteMT(String nombre, String ciudad, int edad, int identificacion, double sueldo, String profesion, int horasTrabajadas) {
        super(nombre, ciudad, edad, identificacion, sueldo, profesion);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
  

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    
      @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Edad: "+edad);
        System.out.println("Identificación: "+ identificacion);
        System.out.println("Sueldo: " +sueldo);
        System.out.println("Profesion:" + profesion);
        System.out.println("Horas trabajadas: "+horasTrabajadas);
          
    }
    
    
    
}
