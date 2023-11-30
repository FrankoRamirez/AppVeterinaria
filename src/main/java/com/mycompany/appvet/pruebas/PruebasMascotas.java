
package com.mycompany.appvet.pruebas;

import com.mycompany.appvet.model.Mascota;
import com.mycompany.appvet.control.MascotaControl;
import java.util.ArrayList;

public class PruebasMascotas {

    public static void main(String[] args) {
        // Prueba del ingreso de una mascota 
        /*
        Mascota m = new Mascota();
        m.setNombre("Loki");
        m.setEspecie("perro");
        m.setSexo('M');
        m.setRaza("Bulldog");
        m.setFecha_nac("05-10-18");
        m.setId_cliente("CL002");
        try {
            MascotaControl servicio = new MascotaControl();
            servicio.agregarMascota(m);
            System.out.println("La mascota se registro exitosamente.");
        } catch (Exception e) {
            System.err.println("Ocurrio un error al insertar la mascota: " + 
                    e.getMessage());
        }
        
        // Prueba para actualizar una mascota
        m.setSexo('F');
        m.setRaza("Pastor aleman");
        try {
            MascotaControl servicio = new MascotaControl();
            servicio.actualizarMascota(m);
            System.out.println("La mascota se actualizo exitosamente.");
        } catch (Exception e) {
            System.err.println("Ocurrio un error al actualizar la mascota: " + 
                    e.getMessage());
        }
        
        // Prueba para eliminar una mascota
        try {
            MascotaControl service = new MascotaControl();
            service.eliminarMascota("MC001");
            System.out.println("La mascota se elimino exitosamente.");
        } catch (Exception e) {
            System.err.println("Ocurrio un error al eliminar la mascota: " + 
                    e.getMessage());
        }
        
        // Prueba para listar a todas las mascotas
        try {
            MascotaControl servicio = new MascotaControl();
            ArrayList<Mascota> listadoMascotas = servicio.listarMascotas();
            if (listadoMascotas.isEmpty()) {
                System.out.print("No se encontraron mascotas.");
            } else {
                System.out.printf("%-12s|%-20s|%-10s|%-5s|%-20s|%-12s|%-12s%n",
                        "id_mascota", "nombre", "especie", "sexo", 
                        "raza", "fecha_nac", "id_cliente");
                for (Mascota ma : listadoMascotas) {
                    System.out.printf("%-12s|%-20s|%-10s|%-5c|%-20s|%-12s|"
                            + "%-12s%n", ma.getId_mascota(), ma.getNombre(), 
                            ma.getEspecie(), ma.getSexo(), ma.getRaza(), 
                            ma.getFecha_nac(), ma.getId_cliente());
                }
            }
        } catch (Exception e) {
            System.err.println("Ocurrio un error al listar los clientes: " + 
                    e.getMessage());
        }
        */
    }
    
}
