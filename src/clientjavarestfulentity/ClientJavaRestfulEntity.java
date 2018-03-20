/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavarestfulentity;

/**
 *
 * @author entrar
 */
public class ClientJavaRestfulEntity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteEntity cliente = new ClienteEntity();
        System.out.println(cliente.findAll_XML(String.class));
        System.out.println(cliente.find_XML(String.class,"3"));
        
    }
    
}
