package com.mycompany.app.pdv.repositories;

import com.mycompany.app.pdv.entities.ItemVenda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ItemVendaRepositoryImp implements ItemVendaRepository{
        private EntityManager entityManager;

    public ItemVendaRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public ItemVenda findById(Integer id) {
        return entityManager.find(ItemVenda.class, id);
    }

    public List<ItemVenda> findAll() {
        return entityManager.createQuery("SELECT V FROM ItemVenda V",
                ItemVenda.class).getResultList();   
    }
    
    @Override
    public ItemVenda insert(ItemVenda itemVenda) throws Exception{
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            entityManager.persist(itemVenda);

            transaction.commit();
            System.out.println("ItemVenda cadastrado com sucesso!");
            return itemVenda;

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new Exception("Erro inesperado ao cadastrar itemVenda. Erro: "+ e.getMessage());

        } finally {
            entityManager.close();
        }
    }

    @Override
    public ItemVenda update(ItemVenda itemVenda) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(itemVenda);
        transaction.commit();
        entityManager.close();
        
        System.out.println("ItemVenda atualizado com sucesso!");
        return itemVenda;
    }

    @Override
    public Boolean delete(ItemVenda itemVenda) {        
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(itemVenda);
            transaction.commit();
            entityManager.close();

            System.out.println("ItemVenda removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("ItemVenda atualizado com sucesso!");
            return false;
        }
    }
}
