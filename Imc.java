/**
 * Write a description of class addTwoNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Imc
{
    // instance variables - replace the example below with your own
    private double altura;
    private double peso;
    
    public Imc()
    {
       altura = 0;
       peso = 0;
       
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingrese su peso en Kilogramos");
       peso = teclado.nextDouble();
       System.out.println("Ingrese su estatura en Metros");
       altura = teclado.nextDouble();
       
       Double imcTotal = calculo(peso, altura);
       //DecimalFormat formato = new DecimalFormat("#.000");
       System.out.printf("\nSu IMC es : %.2f", imcTotal);
       //System.out.print("Su IMC es: " + calculo(peso, altura));
       //System.out.print("Su IMC es: " + formato.format(calculo(altura, peso)));
       System.out.print("\nLa clasificacion es : " + clasificacion(imcTotal));

    }
    public double calculo(double a, double p){
        //double totalImc = a;
        double totalImc = a/(double)Math.pow(p,2);
        return totalImc;
    }
    public String clasificacion(double imc){
        String resul = "";
        if(imc<16.00)
            return "Delgadez Severa";
        if(imc>=16.00 && imc<17.00)
            return "Delgadez Moderada";
        if(imc>=17.00 && imc<18.50)
            return "Delgadez Aceptable";
        if(imc>=18.50 && imc<25.00)
            return "Peso Normal";
        if(imc>=25.00 && imc<30.00)
            return "Sobre Peso";
        if(imc>=30.00 && imc<35.00)
            return "Obeso: Tipo 1";
        if(imc>=35.00 && imc<40.00)
            return "Obeso: Tipo 2";
        if(imc>40.00)
            return "Obeso: Tipo 3";
        else
        return "No se logro definir";
        }
}