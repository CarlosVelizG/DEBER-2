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
public class Estudiante extends Personas 
{
    final String Staus1="Primer año";
    final String Staus2="Segundo año";
    final String Staus3="Tercer año";
    final String Staus4="Cuarto año";
    
    public Estudiante(String nombre,String direccion,int telefono,String email)
    {
        super(nombre,direccion,telefono,email);
       
    }
    
    @Override
    public  void Mostrar()
    {
       super.Mostrar(); 
    }
    
    public static void main(String[] args) 
    {
        Estudiante estu = new Estudiante("carlos Julio","Coop la fragata 2215 b solar 15",2735615,"carfullmaxx@gmail");
        estu.Mostrar();
    }
    
    
    
}
