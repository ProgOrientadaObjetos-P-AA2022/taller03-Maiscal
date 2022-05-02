/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack01;

/**
 *
 * @author UTPL
 */
public class EquivalenteHora {
    
    private int horas;
    private int minutos;
    private int segundo;
    private int dias;
    
    
    public void establecerHoras(int c){
        horas = c;
    }
    public void establecerDias(){
        dias = horas / 24;
    }
    public void establecerMinutos(){
            minutos = horas * 60;
    }
    public void establecerSegundos(){
            segundo = minutos * 60;
    }
    
    
    public int obtenerDias(){
        return dias;
    }
    public int obtenerHoras(){
        return horas;
    }
    public int obtenerMinutos(){
        return minutos;
    }
    public int obtenerSegundos(){
        return segundo;
    }
}
