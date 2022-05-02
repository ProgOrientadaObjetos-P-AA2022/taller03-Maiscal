/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack01;

/**
 *
 * @author maisc
 */
public class CaracDispoElect {
    private String so;
    private double tamanioPantalla;
    private double costoIn;
    private int iva;
    private double ivaCostIn;
    private double costoFin;
    private String direcMac;
    private String imei;
    
    public void establecerSo(String c){
        so = c;
    }
    public void establecerTamanioPantalla(double c){
        tamanioPantalla = c;
    }
    public void establecerCostoIn(double c){
        costoIn = c;
    }
    public void establecerIva(int c){
        iva = c;
    }
    public void establecerIvaCostIn(){
        ivaCostIn = (costoIn * iva) / 100;
    }
    public void establecerCostoFin(){
        costoFin = costoIn + ivaCostIn;
    }
    public void establecerDirecMac(String c){
        direcMac = c;
    }
    public void establecerImei(String c){
        imei = c;
    }
            
            
    public String obtenerSo(){
        return so;
    }
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    public double obtenerCostoIn(){
        return costoIn;
    }
    public int obtenerIva(){
        return iva;
    }
    public double obtenerIvaCostIn(){
        return ivaCostIn;
    }
    public double obtenerCostoFin(){
        return costoFin;
    }
    public String obtenerDirecMac(){
        return direcMac;
    }
    public String obtenerImei(){
        return imei;
    }
}
