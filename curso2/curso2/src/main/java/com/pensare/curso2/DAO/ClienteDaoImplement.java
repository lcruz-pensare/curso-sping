package com.pensare.curso2.DAO;

import com.pensare.curso2.entity.Cliente;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class ClienteDaoImplement implements  IClienteDAO{
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings("unchecked")

    @Override
    public List<Cliente> findAll() {//Implementa el metodo de la interfaz
        return em.createQuery("From Cliente").getResultList(); //Regresa el listado de clientes
    }
}