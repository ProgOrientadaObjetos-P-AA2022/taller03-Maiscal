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
    
    //Calcular Minutos
    public void establecerMinutos(){
        if(horas > 0){
            minutos = horas * 60;
        }
    }
    //Calcular Segundos
    public void establecerSegundos(){
        if(minutos > 0 )
            segundo = minutos * 60;
    }
    //Calcular Dias
    public void establecerDias(){
        if(horas >= 24){
            dias = horas / 24;
        }
    }
    
    //Calcular dias a lo demas
    public int calcularDM(){
        establecerHoras(dias);
        
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
    public int obtenerDias(){
        return dias;
    }
}
