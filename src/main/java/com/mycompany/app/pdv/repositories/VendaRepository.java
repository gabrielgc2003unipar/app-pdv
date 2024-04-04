/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.repositories;

import com.mycompany.app.pdv.entities.ItemVenda;
import com.mycompany.app.pdv.entities.Venda;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author gabri
 */
public class VendaRepository {
        private EntityManager entityManager;

    public VendaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public Venda save(Venda venda) throws Exception{
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            entityManager.persist(venda);

            transaction.commit();
            System.out.println("Venda efetuada com sucesso!");
            return venda;

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new Exception("Erro inesperado ao cadastrar a venda. Erro: "+ e.getMessage());

        } finally {
            entityManager.close();
        }
    }

    public Venda findById(Integer id) {
        return entityManager.find(Venda.class, id);
    }

    public List<Venda> findAll() {
        return entityManager.createQuery("SELECT V FROM Venda V",
                Venda.class).getResultList();   
    }
}
