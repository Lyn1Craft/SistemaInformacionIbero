/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public abstract class Proveedor extends Persona {
    
    protected double precio;
    protected String pais, producto;

    public Proveedor(double precio, String pais, String producto, String nombre, String ciudad, int edad, int identificacion) {
        super(nombre, ciudad, edad, identificacion);
        this.precio = precio;
        this.pais = pais;
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
   
    

    
    
    @Override
    public abstract void mostrarDatos();
   
  
    }
    
    

   
    
    
    
    
    

