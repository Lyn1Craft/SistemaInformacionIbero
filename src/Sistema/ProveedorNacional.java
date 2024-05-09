/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class ProveedorNacional extends Proveedor {

    public ProveedorNacional( String nombre, String ciudad, int edad, int identificacion, double precio, String pais, String producto) {
        super(precio, pais, producto, nombre, ciudad, edad, identificacion);
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getPais() {
        return pais;
    }

    @Override
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String getProducto() {
        return producto;
    }

    @Override
    public void setProducto(String producto) {
        this.producto = producto;
    }

    
    
    
    
    @Override
   public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Edad: "+edad);
        System.out.println("Identificación: "+ identificacion);
        System.out.println("Precio producto: " +precio);
        System.out.println("Pais: "+pais);
        System.out.println("Producto: " +producto);
   
        
   }
}
