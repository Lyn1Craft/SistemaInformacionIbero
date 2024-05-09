/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
       Scanner entrada= new Scanner(System.in);
      
       ArrayList<Persona> personas= new ArrayList<>();
       while (true){
           System.out.println("¡¡BIENVENIDO AL SISTEMA DE INFORMACION DE LA IBERO!! : ");
           System.out.println("1. Agregar Docente HC");
           System.out.println("2. Agregar Docente MT");
           System.out.println("3. Agregar Docente TC");
           System.out.println("4. Agregar Estudiante Pregrado");
           System.out.println("5. Agregar Estudiante Posgrado");
           System.out.println("6. Agregar Administrativo Planta ");
           System.out.println("7. Agregar Administrativo Horas");
           System.out.println("8. Agregar Proveedor Internacional");
           System.out.println("9. Agregar Proveedor Nacional");
           System.out.println("10. Mostrar Datos ");
           System.out.println("11. Salir");
           System.out.println("Ingresa una opcion: ");
           int opcion= entrada.nextInt();
           entrada.nextLine(); //Limpiar 
           switch (opcion) {
               case 1:
                   System.out.println("Ingrese el nombre del Docente HC: ");
                   String nombre = entrada.nextLine();
                   System.out.println("Ingrese la ciudad del Docente HC:");
                   String ciudad = entrada.nextLine();
                   System.out.println("Ingrese la edad del Docente HC:");
                   int edad = entrada.nextInt();
                   entrada.nextLine(); 
                   System.out.println("Ingrese la identificación del Docente HC:");
                   int identificacion = entrada.nextInt();
                   entrada.nextLine(); 
                   System.out.println("Ingrese el sueldo del Docente HC:");
                   double sueldo = entrada.nextDouble();
                   entrada.nextLine();
                   System.out.println("Ingrese la profesión del Docente HC:");
                   String profesion = entrada.nextLine();
                   System.out.println("Ingrese las horas de catedra del Docente HC:");
                   int horasCatedra = entrada.nextInt();
                   entrada.nextLine(); 
                   personas.add(new DocenteHC (nombre, ciudad, edad, identificacion, sueldo, profesion, horasCatedra) );
                   break;
                   
                  case 2: 
                   System.out.println("Ingrese el nombre del Docente MT: ");
                   String nombreMT= entrada.nextLine();
                
                  System.out.println("Ingrese la ciudad del Docente MT:");
                  String ciudadMT = entrada.nextLine();
                  System.out.println("Ingrese la edad del Docente MT:");
                  int edadMT = entrada.nextInt();
                  entrada.nextLine(); 
                  System.out.println("Ingrese la identificación del Docente MT:");
                  int identificacionMT = entrada.nextInt();
                  entrada.nextLine(); 
                  System.out.println("Ingrese el sueldo del Docente MT:");
                  double sueldoMT = entrada.nextDouble();
                  entrada.nextLine(); 
                  System.out.println("Ingrese la profesión del Docente MT:");
                  String profesionMT = entrada.nextLine();
                  System.out.println("Ingrese las horas de catedra del Docente MT:");
                  int horasTrabajadas = entrada.nextInt();
                  entrada.nextLine(); 
                  personas.add(new DocenteMT(nombreMT, ciudadMT, edadMT,  identificacionMT, sueldoMT,  profesionMT, horasTrabajadas));
                   
                   break;
                   
                  case 3:
                      
                  System.out.println("Ingrese el nombre del Docente TC: ");
                  String nombreTC = entrada.nextLine();
                
                  System.out.println("Ingrese la ciudad del Docente TC:");
                  String ciudadTC = entrada.nextLine();
                  System.out.println("Ingrese la edad del Docente TC:");
                  int edadTC = entrada.nextInt();
                  entrada.nextLine(); 
                  System.out.println("Ingrese la identificación del Docente TC:");
                  int identificacionTC = entrada.nextInt();
                  entrada.nextLine(); 
                  System.out.println("Ingrese el sueldo del Docente TC:");
                  double sueldoTC = entrada.nextDouble();
                  entrada.nextLine(); 
                  System.out.println("Ingrese la profesión del Docente TC:");
                  String profesionTC = entrada.nextLine();
                  System.out.println("Ingrese las horas a la semana de catedra del Docente TC:");
                  int horasSemanas = entrada.nextInt();
                  entrada.nextLine();   
                  personas.add(new DocenteTC(nombreTC, ciudadTC, edadTC, identificacionTC,  sueldoTC, profesionTC, horasSemanas));
                  break;
                      
                  case 4:
                      System.out.println("Ingrese el nombre del Estudiante Pregrado: ");
                      String nombrepre = entrada.nextLine();
                
                      System.out.println("Ingrese la ciudad del estudiante:  ");
                      String ciudadpre = entrada.nextLine();
                      System.out.println("Ingrese la edad del estudiante: ");
                      int edadpre = entrada.nextInt();
                      entrada.nextLine(); 
                      System.out.println("Ingrese la identificacion del estudiante :");
                      int identificacionpre = entrada.nextInt();
                      entrada.nextLine(); 
                      System.out.println("Ingrese el programa al cual pertenece el estudiante:");
                      String programapre= entrada.nextLine();
                      entrada.nextLine(); 
                      System.out.println("Ingrese el codigo del estudiante:");
                      String codigoEstudiante = entrada.nextLine();
                      personas.add(new EstudiantePregrado(nombrepre, ciudadpre, edadpre, identificacionpre, programapre, codigoEstudiante));
                      break;
                      
                  case 5:
                      System.out.println("Ingrese el nombre del Estudiante Posgrado: ");
                      String nombrepos = entrada.nextLine();
                
                      System.out.println("Ingrese la ciudad del estudiante:  ");
                      String ciudadpos = entrada.nextLine();
                      System.out.println("Ingrese la edad del estudiante: ");
                      int edadpos = entrada.nextInt();
                      entrada.nextLine(); 
                      System.out.println("Ingrese la identificacion del estudiante :");
                      int identificacionpos = entrada.nextInt();
                      entrada.nextLine(); 
                      System.out.println("Ingrese el programa al cual pertenece el estudiante:");
                      String programapos = entrada.nextLine();
                      entrada.nextLine(); 
                      System.out.println("Ingrese el codigo del estudiante:");
                      String codigoEstudiantepos = entrada.nextLine();
                      personas.add(new EstudiantePosgrado(nombrepos, ciudadpos, edadpos, identificacionpos, programapos, codigoEstudiantepos));
                      break;
                      
                  case 6: 
                      System.out.println("Ingrese el nombre del Administrador de Planta :");
                      String nombreP = entrada.nextLine();
                      System.out.println("Ingrese la ciudad del administrador:  ");
                      String ciudadP = entrada.nextLine();
                      System.out.println("Ingrese la edad del administrador: ");
                      int edadP= entrada.nextInt();
                      entrada.nextLine(); 
                      System.out.println("Ingrese la identificacion del administrador :");
                      int identificacionP = entrada.nextInt();
                      entrada.nextLine(); 
                      System.out.println("Ingrese el departamento al cual pertenece el administrador:");
                      String departamentoP = entrada.nextLine();
                      entrada.nextLine(); 
                      System.out.println("Ingrese el cargo del administrador:");
                      String cargoP = entrada.nextLine();
                      System.out.println("Ingrese las horas de trabajo del administrador:");
                      int horasTrabajo = entrada.nextInt();
                      entrada.nextLine(); 
                      personas.add(new AdministrativoPlanta( nombreP, ciudadP, edadP, identificacionP, departamentoP, cargoP, horasTrabajo));
                      break;
                      
                  case 7:
                       System.out.println("Ingrese el nombre del Administrador por Horas: ");
                       String nombreh = entrada.nextLine();
                       System.out.println("Ingrese la ciudad del administrador:  ");
                       String ciudadh = entrada.nextLine();
                       System.out.println("Ingrese la edad del administrador: ");
                       int edadh = entrada.nextInt();
                       entrada.nextLine(); 
                       System.out.println("Ingrese la identificacion del administrador :");
                       int identificacionh = entrada.nextInt();
                       entrada.nextLine(); 
                       System.out.println("Ingrese el departamento al cual pertenece el administrador:");
                       String departamentoh = entrada.nextLine();
                       entrada.nextLine(); 
                       System.out.println("Ingrese el salario por hora del administrador");
                       double salarioPorHora= entrada.nextInt();
                       System.out.println("Ingrese el cargo del administrador:");
                       String cargo = entrada.nextLine();
                       System.out.println("Ingrese las horas de trabajo del administrador:");
                       int horasTrabajadash = entrada.nextInt();
                       entrada.nextLine(); 
                       personas.add(new AdministrativoHoras(nombreh, ciudadh, edadh, identificacionh, departamentoh, cargo, salarioPorHora, horasTrabajadash));
                       break;
                       
                  case 8:
                        System.out.println("Ingrese el nombre del Proveedor Internacional: ");
                        String nombreI = entrada.nextLine();
                        System.out.println("Ingrese la ciudad del proveedor: ");
                        String ciudadI= entrada.nextLine();
                        entrada.nextLine(); 
                        System.out.println("Ingrese la edad del proveedor: ");
                        int edadI = entrada.nextInt();
                        System.out.println("Ingrese la identificacion del proveedor :");
                        int identificacionI = entrada.nextInt();
                        System.out.println("Ingrese el precio :");
                        double precio = entrada.nextDouble();
                        System.out.println("Ingrese el pais del proveedor :");
                        String pais= entrada.nextLine();
                        entrada.nextLine(); 
                        System.out.println("Ingrese el producto :");
                        String productoI = entrada.nextLine();
                        
                        entrada.nextLine(); 
                        personas.add(new ProveedorInternacional( nombreI,  ciudadI, edadI,identificacionI, precio, pais, productoI));
                        break;
                        
                  case 9: 
                        System.out.println("Ingrese el nombre del Proveedor Nacional: ");
                        String nombreN = entrada.nextLine();
                        System.out.println("Ingrese la ciudad del proveedor: ");
                        String ciudadN= entrada.nextLine();
                        entrada.nextLine(); 
                        System.out.println("Ingrese la edad del proveedor: ");
                        int edadN = entrada.nextInt();
                        System.out.println("Ingrese la identificacion del administrador :");
                        int identificacionN = entrada.nextInt();
                        System.out.println("Ingrese el precio :");
                        double precioN = entrada.nextDouble();
                        System.out.println("Ingrese el pais del proveedor :");
                        String paisN= entrada.nextLine();
                        entrada.nextLine(); 
                        System.out.println("Ingrese el producto :");
                        String productoN = entrada.nextLine();
                        entrada.nextLine();
                        personas.add(new ProveedorNacional( nombreN, ciudadN, edadN,  identificacionN, precioN,  paisN,  productoN));
                        break;
                       
                  case 10:
                      System.out.println("DETALLES DE LAS PERSONAS: ");
                      for(Persona persona: personas){
                          persona.mostrarDatos();
                          System.out.println("------------------------");
                      }
                      break;
                      
                  case 11:
                      System.out.println("saliendo del programa......");
                      System.exit(0);
                      break;
                      
               default:
                   
                   System.out.println("Opcion invalida.");
                   throw new AssertionError();
           }
       }
       
    }
                 
}

    

        
   
       


        
         
         
        
       
        
        
        
       
        
        
        
        
        

