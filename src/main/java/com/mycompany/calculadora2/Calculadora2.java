package com.mycompany.calculadora2;

public class Calculadora2 {

    public static void main(String[] args) {
        InterfazCalculadora clienteCalculadoraNormal = new CalculadoraNormal();
        clienteCalculadoraNormal.solicitarNumeros();
        System.out.println("La suma es: "+clienteCalculadoraNormal.sumarEnteros());
        System.out.println("La resta es: "+clienteCalculadoraNormal.restarEnteros());
        System.out.println("La multiplicacion es: "+clienteCalculadoraNormal.multiplicarEnteros());
        System.out.println("La division es: "+clienteCalculadoraNormal.dividirEnteros());
        System.out.println("La raiz cuadrada es: "+clienteCalculadoraNormal.calcularRaizCuadrada()+"\n");
        
        InterfazCalculadora clienteCalculadoraEspecial = new CalculadoraEspecial();
        clienteCalculadoraEspecial.solicitarNumeros();
        System.out.println("La suma es: "+clienteCalculadoraEspecial.sumarEnteros());
        System.out.println("La resta es: "+clienteCalculadoraEspecial.restarEnteros());
        System.out.println("La multiplicacion es: "+clienteCalculadoraEspecial.multiplicarEnteros());
        System.out.println("La division es: "+clienteCalculadoraEspecial.dividirEnteros());
        System.out.println("La raiz cuadrada es: "+clienteCalculadoraEspecial.calcularRaizCuadrada()); 
    }
}
