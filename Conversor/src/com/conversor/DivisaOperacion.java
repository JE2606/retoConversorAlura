package com.conversor;

public class DivisaOperacion {
    
   private double valor, resultado;
   private int primeraDivisa, divisaFinal;
   

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPrimeraDivisa() {
        return primeraDivisa;
    }

    public void setPrimeraDivisa(int primeraDivisa) {
        this.primeraDivisa = primeraDivisa;
    }

    public int getDivisaFinal() {
        return divisaFinal;
    }

    public void setDivisaFinal(int divisaFinal) {
        this.divisaFinal = divisaFinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
//    constructor

    public DivisaOperacion() {
    }
    
    
//    operacion
    

    public double convertir(){
        
//        PESO
        
        //    peso a dolar
        if(primeraDivisa == 0 && divisaFinal == 0){
            resultado = valor * 0.018;
        }
//        peso a euro
        else if(primeraDivisa == 0 && divisaFinal == 1){
            resultado = valor * 0.016;
        }
//        peso a peso
        else if(primeraDivisa == 0 && divisaFinal == 2){
            resultado = valor;
        }
        
//        EURO
        
//        de euro a dolar
        else if(primeraDivisa == 1 && divisaFinal == 0){
            resultado = valor * 1.12;
        }
//        de euro a euro
        else if(primeraDivisa == 1 && divisaFinal == 1){
            resultado = valor;
        }
//        de euro a peso
        else if(primeraDivisa == 1 && divisaFinal == 2){
            resultado = valor * 62.83;
        }
        
//        DOLAR
        
//        de dolar a dolar
        else if(primeraDivisa == 2 && divisaFinal == 0){
            resultado = valor;
        }
//        de dolar a euro
        else if(primeraDivisa == 2 && divisaFinal == 1){
            resultado = valor * 0.89;
        }
//        de dolar a peso
        else if(primeraDivisa == 2 && divisaFinal == 2){
            resultado = valor * 55.95;
        }
        
     
        
       
        
        
        return resultado;
    }
   
   
    
}
