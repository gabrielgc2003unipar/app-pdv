/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.repositories;

import com.mycompany.app.pdv.entities.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author gabri
 */
public class VendaRepositoryImp implements VendaRepository{
        private EntityManager entityManager;

    public VendaRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Venda findById(Integer id) {
        return entityManager.find(Venda.class, id);
    }

    public List<Venda> findAll() {
        return entityManager.createQuery("SELECT V FROM Venda V",
                Venda.class).getResultList();   
    }
    
    @Override
    public Venda insert(Venda venda) throws Exception{
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

    @Override
    public Venda update(Venda venda) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(venda);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Venda atualizada com sucesso!");
        return venda;
    }

    @Override
    public Boolean delete(Venda venda) {        
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(venda);
            transaction.commit();
            entityManager.close();

            System.out.println("Venda removida com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Venda atualizada com sucesso!");
            return false;
        }
    }
}
