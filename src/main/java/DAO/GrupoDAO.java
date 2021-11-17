/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Grupo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author R2
 */
public class GrupoDAO extends BaseDAO<Grupo>{

    @Override
    public void agregar(Grupo entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Grupo grupo = entityManager.find(Grupo.class, id);
        if (grupo != null) {
            entityManager.remove(grupo);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(Grupo entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Grupo grupo = entityManager.find(Grupo.class, entidad.getId());
        if (grupo != null) {
            grupo.setNombre(entidad.getNombre());
            grupo.setCurso(entidad.getCurso());
            grupo.setAlumnos(entidad.getAlumnos());
            //Set fecha grupo.set
            entityManager.merge(grupo);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public Grupo buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Grupo grupo = entityManager.find(Grupo.class, id);
        entityManager.getTransaction().commit();
        return grupo;
    }

    @Override
    public ArrayList<Grupo> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Grupo.class));
        Query query = entityManager.createQuery(criteria);
        List<Grupo> grupo = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(grupo);
    }
    
}
