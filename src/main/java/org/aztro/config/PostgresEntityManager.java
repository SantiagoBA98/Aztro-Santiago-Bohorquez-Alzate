package org.aztro.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class PostgresEntityManager {

    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    // Constructor que inicializa el EntityManagerFactory y el EntityManager
    public PostgresEntityManager() {
        this.entityManagerFactory = initializeEntityManagerFactory();
        this.entityManager = createEntityManager();
    }


    private EntityManagerFactory initializeEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("super_mercado");
    }

    private EntityManager createEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return this.entityManagerFactory;
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }
}
