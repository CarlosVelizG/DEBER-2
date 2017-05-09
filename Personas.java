/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;


public abstract class Personas 
{
    protected String nombre;
    protected int telefono;
    protected String email;
    protected String direccion;
    
    public Personas(String nombre,String direccion,int telefono,String email)
    {
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setEmail(email);
        this.setDireccion(direccion);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
     public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

   

 
    
    
    public void Mostrar()
    {
        System.out.println("  \n DATOS \n");
        System.out.println(" * Nombre : "+this.getNombre());
        System.out.println(" * Dirección : "+this.getDireccion());
        System.out.println(" * Teléfono : "+this.getTelefono());
        System.out.println(" * e-mail : "+this.getEmail());
    }
    
    
    
}
