/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones operaciones = new Operaciones();
        // TODO code application logic here
        //prueba sumarPar:
        int resultado = operaciones.sumarPar(4,4);    
        System.out.println(resultado);
        
        //prueba mayor:
        int resultado2 = operaciones.mayor(10,9);    
        System.out.println(resultado2);
        
        //prueba sumarVector:
        int[] vector = {4,2,5,6};
        int resultado3 = operaciones.sumarVector(vector);    
        System.out.println(resultado3);
    }
    
}
