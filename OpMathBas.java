import javax.swing.JOptionPane; //Siempre importante importar las librerias

 //Clase para realizar jercicios matamáticos básicos

public class OpMathBas {
   

    int numero1; //se puede tanto indicar el valor a la vez que declaras como después 
    int numero2;
    double numero3;
    double numero4;
    int resta;
    double resta2;
    int suma;
    double suma2;
    int multiplicacion;
    double multiplicacion2;
    int division;
    double division2;

//Método para la lectura de números que nos da el usuario con la opcion "JObtionpane" 
public void lecturaNumeros(){
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, dime un número entero"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, dime otro número entero"));
    numero3 = Double.parseDouble(JOptionPane.showInputDialog("Gracias, ahora introduce un numero con decimales separado con un punto"));
    numero4 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, introduce otro numero con decimales separado con un punto"));

    //Método para la suma de valores
}
public void sumar(){

    suma = numero1 + numero2;
    
    suma2 = numero3 + numero4;
   
    //Método para la resta de valores

}
public void restar(){

    resta = numero1 - numero2;
   
    resta2 = numero3 - numero4;
    
    //Método para la multiplicacion de valores

}
public void multiplicar(){

    multiplicacion = numero1 * numero2;
  
    multiplicacion2 = numero3 * numero4;
  
}

    //Método para la division de valores

public void dividir(){

    division = numero1 / numero2;
   
    division2 = numero3 / numero4;
   
}
    //Método para mostrar los resultados
public void mostrarResultados(){

    System.out.println("El resultado de sumar " + numero1 + " y " + numero2 + " es " + suma);
    System.out.println("El resultado de sumar " + numero3 + " y " + numero4 + " es " + suma2);
    System.out.println("El resultado de restar " + numero1 + " y " + numero2 + " es " + resta);
    System.out.println("El resultado de restar " + numero3 + " y " + numero4 + " es " + resta2);
    System.out.println("El resultado de multiplicar " + numero1 + " y " + numero2 + " es " + multiplicacion);
    System.out.println("El resultado de multiplicar " + numero3 + " y " + numero4 + " es " + multiplicacion2);
    System.out.println("El resultado de dividir " + numero1 + " y " + numero2 + " es " + division);
    System.out.println("El resultado de dividir " + numero3 + " y " + numero4 + " es " + division2);

}

}