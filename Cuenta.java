/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Date;//libreria para la fecha
import java.text.SimpleDateFormat; //formati simple de la fecha

public class Cuenta 
{
    static int id;
    static double saldo;
    private double interesAnual;
    private double interesActual;
    double retiro;
    double deposito;
    private Date FechaActual;
    
        
    public void  cuenta () {}
    public void cuenta (int id, double saldo, double retiro,double deposito) {
    this.id = id ;
    this.saldo = saldo ;   
    }
    public int getId() {
        return id;   
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public double getInteresAnual() {
        return interesAnual;
    }
    
    public double getInteresMensual () {
       double inte = this.saldo * 0.045 ;
       return inte ; 
    }
    public double getRetiro () {
       double reti = this.saldo - retiro + deposito ;
       return reti;
    }
    public double getDeposito () {
    double depo = this.saldo + deposito ; 
    return depo;
    }
    public void mostrar (){
        System.out.println("\n   *-*-*-* Balance*-*-*-* \n");
        System.out.println("  * ID:                 " +this.getId () );
        System.out.println("  * Saldo:              " +this.getSaldo());
        System.out.println("  * Retiro:             -" +this.retiro);
        System.out.println("  * Deposito:           +"+deposito);
        System.out.println("  * Saldo disponible :  " +this.getRetiro());
        System.out.println("  * Interes Mensual:    " +this.getInteresMensual    ());
        System.out.println("  * Fecha de la cuenta: " +getFechaActual());
        
        
    }
    
    public static String getFechaActual() 
    {
    Date fechaActual = new Date();
    SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
    return formateador.format(fechaActual);
    }
    
   

    public static void main(String[] args) {
          Cuenta p1 = new Cuenta ();

        p1.setId(1122);
        p1.setSaldo(20000);
        p1.retiro= 2500;
        p1.deposito=3000;
        p1.mostrar () ;
        
        
    }
    
    
}

