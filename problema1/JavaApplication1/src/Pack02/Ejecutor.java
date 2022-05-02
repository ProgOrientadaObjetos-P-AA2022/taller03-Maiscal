/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pack02;

import Pack01.Terreno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double costo;
        double ancho;
        double largo;
        
        
        largo = 50;
        ancho = 25;
        costo = 75;
        
        Terreno objT01 = new Terreno();
        
        objT01.establecerLargo(largo);
        objT01.establecerAncho(ancho);
        objT01.establecerValorMetroCuadrado(costo);
        
        objT01.calcularArea();
        objT01.costo_Terreno();
       
        System.out.println("******obj1*******");
        System.out.printf("Costo de un terreno rectangular\nLargo: %.2f\n"
                + "Ancho: %.2f\nCosto: %.2f\nArea Total: %.2f\nCosto total del terreno: %.2f\n"
                ,objT01.obtenerLargo()
                ,objT01.obtenerAncho()
                ,objT01.obtenerValorMetroCuadrado()
                ,objT01.obtenerCalcularArea()
                ,objT01.obtenerCosto_Terreno()
        );
        System.out.println("*************");
        
        
        largo = 60;
        ancho = 90;
        costo = 500;
        
        Terreno objT02 = new Terreno();
        
        objT02.establecerLargo(largo);
        objT02.establecerAncho(ancho);
        objT02.establecerValorMetroCuadrado(costo);
        
        objT02.calcularArea();
        objT02.costo_Terreno();
        
        
        System.out.println("******obj2*******");
        System.out.printf("Costo de un terreno rectangular\nLargo: %.2f\n"
                + "Ancho: %.2f\nCosto: %.2f\nArea Total: %.2f\nCosto total del terreno: %.2f\n"
                ,objT02.obtenerLargo()
                ,objT02.obtenerAncho()
                ,objT02.obtenerValorMetroCuadrado()
                ,objT02.obtenerCalcularArea()
                ,objT02.obtenerCosto_Terreno()
        );
        System.out.println("*************");
        
        
    }
    
}
