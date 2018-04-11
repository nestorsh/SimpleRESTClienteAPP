/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplerestclienteapp;

/**
 *
 * @author imac
 */
public class SimpleRESTClienteApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryClient clienteBinary =new BinaryClient();
        long num=4;
        int factorial=factorial((int) num);
        String binario =clienteBinary.getBinary(String.class, String.valueOf(num));
        System.out.println("El factorial de "+num+" es: "+factorial);
        System.out.println("El binario de "+num+" es: "+binario);
        
    }

    private static int factorial(int num) {
        org.ulpgc.es.WSFactorial_Service service = new org.ulpgc.es.WSFactorial_Service();
        org.ulpgc.es.WSFactorial port = service.getWSFactorialPort();
        return port.factorial(num);
    }
    
}
