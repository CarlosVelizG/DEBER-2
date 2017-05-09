
package Ejercicio3;
public class Triangulo extends ObjetoGeometrico {  
    double lado1=1.0;
    double lado2=1.0;
    double lado3=1.0;

    
    public Triangulo(){}
    public Triangulo(double la1,double la2,double la3)
    {
        this.setLado1(la1);
        this.setLado2(la2);
        this.setLado3(la3);
        
    }

    //Método setter
    
    public void setLado1(double la1) {
        this.lado1 = la1;
    }
    
        public void setLado2(double la2) {
        this.lado2 = la2;
    }
        
    
    public void setLado3(double la3) {
        this.lado3 = la3;
    }
       
        

        
    //Método getter
       public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double getLado3() {
        return this.lado3;
    }
    

    public double getPerimetro()
    {
        double perimetro=this.lado1+this.lado2+this.lado3;
        return perimetro;
    }
    
    public double getArea()
    {
        double area=lado2*lado3/2;
        return area;
    }
    
    public void Mostrar()
    {
        System.out.println("AREA : "+this.getArea());
         System.out.println("PERIMETRO : "+this.getPerimetro()); 
        
    } 
}
