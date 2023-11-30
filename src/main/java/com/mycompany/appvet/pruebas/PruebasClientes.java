
package com.mycompany.appvet.pruebas;

import com.mycompany.appvet.model.Cliente;
import com.mycompany.appvet.control.ClienteControl;
import java.util.ArrayList;

public class PruebasClientes {

    public static void main(String[] args) {
        
        // PRUEBA PARA INSERTAR UN CLIENTE
        
        Cliente c = new Cliente();
        c.setNombres("Renzo Anacleto"); //VARCHAR(50)
        c.setDni("98765432"); //VARCHAR(8)
        c.setSexo("M"); //CHAR(1)
        c.setCorreo("renzoa13@gmail.com"); //VARCHAR(30)
        c.setTelefono("980139182"); //VARCHAR(12)
        
        try {
            ClienteControl service = new ClienteControl();
            service.agregarCliente(c);
            System.out.println("El cliente se registro exitosamente.");
        } catch (Exception e) {
            System.err.println("Ocurrio un error al insertar el cliente: " + e.getMessage());
        }
        
        
        // PRUEBA PARA ACTUALIZAR UN CLIENTE
        
        c.setId_cliente("CL001");
        c.setTelefono("981056071");
        
        try {
            ClienteControl service = new ClienteControl();
            service.actualizarCliente(c);
            System.out.println("El cliente se actualizo exitosamente.");
        } catch (Exception e){
            System.err.println("Ocurrio un error al actualizar el cliente: " + e.getMessage());
        }
        
        // PRUEBA PARA ELIMINAR UN CLIENTE
        
        try {
            ClienteControl service = new ClienteControl();
            service.eliminarCliente("CL001");
            System.out.println("El cliente se elimino exitosamente.");
        } catch (Exception e) {
            System.err.println("Ocurrio un error al eliminar el cliente: " + e.getMessage());
        }
        
        
        // PRUEBA PARA LISTAR LOS CLIENTES
        
        try {
            ClienteControl service = new ClienteControl();
            ArrayList<Cliente> lista = service.listarClientes("todos","");
            if (lista.isEmpty()) {
                System.out.println("No se encontraron clientes.");
            } else {
                for (Cliente cl: lista) {
                    System.out.println(cl.getId_cliente() + " | "+cl.getNombres() + "\n"
                                     + cl.getDni() + " [" + cl.getSexo() + "]" + "\n"
                                     + cl.getCorreo() + "\n"
                                     + cl.getTelefono() + "\n");
                }
            }
        } catch (Exception e) {
            System.err.println("Ocurrio un error al listar los clientes: " + e.getMessage());
        }
    }
    
}
