package Pack01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UTPL
 */
public class Terreno {
    
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    public double obtenerAncho(){
        return ancho;
    }
    public double obtenerLargo(){
        return largo;
    }
    public double obtenerCalcularArea(){
        return area;
    }
    public double obtenerCosto_Terreno(){
        return costo_terreno;
    }
    
     /**********************/
    //Calcular el area del cuadrado
    public void calcularArea(){
        area = largo * ancho;
    }
    /**********************/
    //Calcular el valor por metro cuadrado
    public void costo_Terreno(){
        costo_terreno = area * valorMetroCuadrado;
    }
}
