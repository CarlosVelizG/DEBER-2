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
public class Personal extends Empleado {
       public Personal(String nombre,String direccion,int telefono,String email,double sal,String fec)
    {
        super(nombre,direccion,telefono,email,sal,fec);
    }
    
       
    public void Mostrar()
    {
      
        super.Mostrar();
    }
    
    public static void main(String[] args) {
       Profesor pro=new Profesor("carlos","21131",2365987,"aldsldlas",5555,"7/8/2012");
       pro.Mostrar();
    }
}
