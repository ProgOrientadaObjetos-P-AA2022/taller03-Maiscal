/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pack02;

import pack01.AdminInstitucionesEdu;

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
        
        /**/
        AdminInstitucionesEdu obj1 = new AdminInstitucionesEdu();
        
        obj1.establecerNombre("La salle");
        obj1.establecerTipoInsti("Privado");
        obj1.establecerNumAlum(5000);
        obj1.establecerNumDoce(100);
        obj1.establecerNumSedes(50);
        obj1.establecerGastoEstu(955.66);
        
        obj1.establecerPresupuesto();
        
        System.out.println("*************");
        System.out.printf("Nombre de la institucion: %s\nTipo de institucion: "
                + "%s\nNumero de estudiantes: %d\nNumero de docentes: "
                + "%d\nNumero de sedes: %d\nGastos por estudiante: "
                + "%.2f\nPresupuesto: %.2f\n"
                ,obj1.obtenerNombre()
                ,obj1.obtenerTipoInsti()
                ,obj1.obtenerNumAlum()
                ,obj1.obtenerNumDoce()
                ,obj1.obtenerNumSedes()
                ,obj1.obtenerGastoEstu()
                ,obj1.obtenerPresupuesto()
        );
        
        /**/
        AdminInstitucionesEdu obj2 = new AdminInstitucionesEdu();
        
        obj2.establecerNombre("Bernardo");
        obj2.establecerTipoInsti("Publico");
        obj2.establecerNumAlum(8000);
        obj2.establecerNumDoce(125);
        obj2.establecerNumSedes(90);
        obj2.establecerGastoEstu(55.96);
        
        obj2.establecerPresupuesto();
        
        System.out.println("*************");
        System.out.printf("Nombre de la institucion: %s\nTipo de institucion: "
                + "%s\nNumero de estudiantes: %d\nNumero de docentes: "
                + "%d\nNumero de sedes: %d\nGastos por estudiante: "
                + "%.2f\nPresupuesto: %.2f\n"
                ,obj2.obtenerNombre()
                ,obj2.obtenerTipoInsti()
                ,obj2.obtenerNumAlum()
                ,obj2.obtenerNumDoce()
                ,obj2.obtenerNumSedes()
                ,obj2.obtenerGastoEstu()
                ,obj2.obtenerPresupuesto()
        );
    }
    
}
