/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pack02;

import pack01.EquivalenteHora;
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
        
        
        EquivalenteHora objEH= new EquivalenteHora();
        
        objEH.establecerHoras(5000);
        objEH.establecerMinutos();
        objEH.establecerSegundos();
        
        objEH.establecerDias();
        
        System.out.println("************");
        System.out.printf("Horas registradas: %d\n\nDias: %d\n\nHoras: %d\n\nMinutos: %d\n\nSegundos: %d\n\n"
                ,objEH.obtenerHoras()
                ,objEH.obtenerDias()
                ,objEH.obtenerHoras()
                ,objEH.obtenerMinutos()
                ,objEH.obtenerSegundos()
        );
        
        EquivalenteHora objEH2= new EquivalenteHora();
        
        objEH2.establecerHoras(48);
        objEH2.establecerMinutos();
        objEH2.establecerSegundos();
        
        objEH.establecerDias();
        
        System.out.println("************");
        System.out.printf("Horas registradas: %d\n\nDias: %d\n\nHoras: %d\n\nMinutos: %d\n\nSegundos: %d\n\n"
                ,objEH2.obtenerHoras()
                ,objEH2.obtenerDias()
                ,objEH2.obtenerHoras()
                ,objEH2.obtenerMinutos()
                ,objEH2.obtenerSegundos()
        );
    }
    
}
