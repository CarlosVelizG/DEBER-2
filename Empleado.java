/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Veliz-PC
 */
public class Empleado extends Personas
{
    private double salario;
    private String fechaEntrada; 
    
    public Empleado(String nombre,String direccion,int telefono,String email,double sal,String fec)
    {
         super(nombre,direccion,telefono,email);
         this.setSalario(sal);
         this.setFechaEntrada(fec);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getFechaEntrada() {
        return this.fechaEntrada;
    }
    
        @Override
    public  void Mostrar()
    {
        
       super.Mostrar(); 
        System.out.println(" *  Salario : "+getSalario());
        System.out.println(" *  Fecha de entrada : "+getFechaEntrada());
    }
    
    
}
