
public class Recursos {

public static void main(String arg[ ]) {

Mensajes mensajes = new Mensajes(); 
mensajes.Mensaje();                  
mensajes.dibujar(20);
mensajes.Operacion();
mensajes.Lista(50); 
    }
   
    public static class Mensajes {

 
  public void Mensaje() {
    System.out.println("Programacion Orientada a Objetos 2021");
}
    
  
public void dibujar(int edad) {
  if (edad >=21){
     System.out.println("Eres mayor de edad");
  }else{
     System.out.println("Eres menor de edad");
     }
    }
 public void Operacion() {
    double numero1 = 10;
    double numero2 = 5;
    double multiplicacion = 0; 
    
    multiplicacion = numero1 * numero2;
     System.out.println("El resultado es = " + multiplicacion);
}
 public void Lista(int valor_final) {
     int valor_inicial=2;
        int valor_incremento=1;
  for (int i = valor_inicial; i <= valor_final; i = i + valor_incremento) {
    System.out.println(i);

  }
   }
    
    } 
}
