/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack01;

/**
 *
 * @author maisc
 */
public class AdminInstitucionesEdu {
    
    private String nombre;
    private String tipoInsti;
    private int numAlum;
    private int numDoce;
    private int numsedes;
    private double gastoEstu;
    private double presupuesto;
    
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerTipoInsti(String c){
        tipoInsti = c;
    }
    public void establecerNumAlum(int c){
        numAlum = c;
    }
    public void establecerNumDoce(int c){
        numDoce = c;
    }
    public void establecerNumSedes(int c){
        numsedes = c;
    }
    public void establecerGastoEstu(double c){
        gastoEstu = c;
    }
    public void establecerPresupuesto(){
        presupuesto = numAlum * gastoEstu;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }      
    public String obtenerTipoInsti(){
        return tipoInsti;
    }
    public int obtenerNumAlum(){
        return numAlum;
    }
    public int obtenerNumDoce(){
        return numDoce;
    }
    public int obtenerNumSedes(){
        return numsedes;
    }
    public double obtenerGastoEstu(){
        return gastoEstu;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
