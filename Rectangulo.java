
package Ejercicio1;

public class Rectangulo 
{
    
    double ancho=1;
    double altura=1;
    public Rectangulo ()
    {   
    }
    
        public Rectangulo (double a,double al)
    {  
        this.ancho=a;
        this.altura=al;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }
    
    public void Mostrar()
    {
        
        System.out.println(" \n       objeto  \n");
        System.out.println(" *  Ancho : "+this.getAncho());  
        System.out.println(" *  Altura : "+this.getAltura());
    }
    
    public static void main(String[] args) 
    {
     Rectangulo rectangulo1=new Rectangulo(4,40);
     rectangulo1.Mostrar();
     
     Rectangulo rectangulo2=new Rectangulo(3.5,35.9);
     rectangulo2.Mostrar();
    }
    
}
