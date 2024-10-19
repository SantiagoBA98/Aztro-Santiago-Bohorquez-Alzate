package org.aztro.repositories;

import org.aztro.models.Supermercado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

public class SupermercadoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Supermercado supermercado) {
        entityManager.persist(supermercado);
    }

    public Supermercado findById(Long id) {
        return entityManager.find(Supermercado.class, id);
    }

    public List<Supermercado> findAll() {
        return entityManager.createQuery("FROM Supermercado", Supermercado.class).getResultList();
    }
}
