/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pack02;

import pack01.CaracDispoElect;

/**
 *
 * @author maisc
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CaracDispoElect obj1 = new CaracDispoElect();
        
        obj1.establecerSo("Android");
        obj1.establecerTamanioPantalla(5.2);
        obj1.establecerCostoIn(999.55);
        obj1.establecerIva(14);
        obj1.establecerDirecMac("C1569:34123:dafF12:AD15");
        obj1.establecerImei("19684621585465465");
        
        obj1.establecerIvaCostIn();
        obj1.establecerCostoFin();
        
        System.out.println("****************************************");
        System.out.printf("Sistema Operativo: %s\nTamanio de la pantalla: %.1f\n\n"
                + "Direcion Mac: %s\nInformacion IMEI: "
                + "%s\n\nIva: %d\nCosto sin iva: %.2f\n\nCosto total: %.2f\n"
                ,obj1.obtenerSo()
                ,obj1.obtenerTamanioPantalla()
                ,obj1.obtenerDirecMac()
                ,obj1.obtenerImei()
                ,obj1.obtenerIva()
                ,obj1.obtenerCostoIn()
                ,obj1.obtenerCostoFin()
        );
        System.out.println("****************************************");
        System.out.println("");
        
        /*****************/
        CaracDispoElect obj2 = new CaracDispoElect();
        
        obj2.establecerSo("iOS");
        obj2.establecerTamanioPantalla(6);
        obj2.establecerCostoIn(1642.95);
        obj2.establecerIva(13);
        obj2.establecerDirecMac("E323:153D:DD45:1115:D454");
        obj2.establecerImei("9948213549651813657");
        
        obj2.establecerIvaCostIn();
        obj2.establecerCostoFin();
        
        System.out.println("****************************************");
        System.out.printf("Sistema Operativo: %s\nTamanio de la pantalla: %.1f\n\n"
                + "Direcion Mac: %s\nInformacion IMEI: "
                + "%s\n\nIva: %d\nCosto sin iva: %.2f\n\nCosto total: %.2f\n"
                ,obj2.obtenerSo()
                ,obj2.obtenerTamanioPantalla()
                ,obj2.obtenerDirecMac()
                ,obj2.obtenerImei()
                ,obj2.obtenerIva()
                ,obj2.obtenerCostoIn()
                ,obj2.obtenerCostoFin()
        );
        System.out.println("****************************************");
        System.out.println("");
    }
    
}
