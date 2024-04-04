/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.repositories;

import com.mycompany.app.pdv.entities.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author gabri
 */
public class ClienteRepository {
    private EntityManager entityManager;

    public ClienteRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Cliente findById(Integer id) {
        return entityManager.find(Cliente.class, id);
    }


    public List<Cliente> findAll() {
        return entityManager.createQuery("SELECT C FROM Cliente C",
                Cliente.class).getResultList();               
    }
    
    public List<Cliente> findByName(String name){
        return entityManager.createQuery("SELECT C FROM Cliente C WHERE C.NM_CLIENTE LIKE UPPER(%"+name.toUpperCase()+"%)",
                Cliente.class).getResultList();      
    }
    
}
