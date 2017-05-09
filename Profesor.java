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
public class Profesor extends Empleado
{
    public Profesor(String nombre,String direccion,int telefono,String email,double sal,String fec)
    {
        super(nombre,direccion,telefono,email,sal,fec);
    }
    
 
    @Override
    public void Mostrar()
    {
       
        super.Mostrar();
    }
    
    public static void main(String[] args) {
       Profesor pro=new Profesor("Derek Veliz","esteros",275687," carfull@gmailcom",8000,"7/7/2015");
       pro.Mostrar();
    }
}
