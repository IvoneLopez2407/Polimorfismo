package com.mycompany.calculadora2;

import javax.swing.JOptionPane;

public class CalculadoraNormal implements InterfazCalculadora{
    
    protected int numero1;
    protected int numero2;
    
    public CalculadoraNormal() {
    }
    
    public CalculadoraNormal (int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    } 
    
    @Override
    public void solicitarNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero1 para Calculadora Normal"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero2 para Calculadora Normal"));
    }

    @Override
    public int sumarEnteros(/*int numero1, int numero2*/) {
        return numero1 + numero2;
    }

    @Override
    public int restarEnteros() {
        return numero1 - numero2;
    }

    @Override
    public int multiplicarEnteros() {
        return numero1*numero2;
    }

    @Override
    public int dividirEnteros(){
        return numero1/numero2;
    }

    @Override
    public double calcularRaizCuadrada() {
        return Math.sqrt(numero1);
    }     
}

