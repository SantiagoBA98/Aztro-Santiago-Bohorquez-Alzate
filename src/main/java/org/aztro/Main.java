package org.aztro;

import org.aztro.models.Supermercado;
import org.aztro.repositories.SupermercadoRepository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        SupermercadoRepository supermercadoRepo = new SupermercadoRepository();

        // Crear un nuevo supermercado
        Supermercado supermercado = new Supermercado();
        supermercado.setNombre("Supermercado Aztro");

        // Guardar en la base de datos
        supermercadoRepo.save(supermercado);

        // Consultar todos los supermercados
        supermercadoRepo.findAll().forEach(s -> System.out.println("Supermercado: " + s.getNombre()));

        emf.close();
    }
}