/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.repositories;

import com.mycompany.app.pdv.entities.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author gabri
 */
public class ProdutoRepositoryImp implements ProdutoRepository{
    private EntityManager entityManager;

    public ProdutoRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Produto findById(Integer id) {
        return entityManager.find(Produto.class, id);
    }


    public List<Produto> findAll() {
        return entityManager.createQuery("SELECT P FROM Produto P",
               Produto.class).getResultList();               
    }
    
    public List<Produto> findByDesc(String descricao){
        return entityManager.createQuery("SELECT P FROM Produto P WHERE P.DS_PRODUTO LIKE UPPER(%"+descricao.toUpperCase()+"%)",
               Produto.class).getResultList();      
    }
    
    @Override
    public Produto insert(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(produto);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Produto salvo com sucesso!");
        return produto;
    }

    @Override
    public Produto update(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(produto);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Produto atualizado com sucesso!");
        return produto;
    }

    @Override
    public Boolean delete(Produto produto) {        
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(produto);
            transaction.commit();
            entityManager.close();

            System.out.println("Produto removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Produto atualizado com sucesso!");
            return false;
        }
    }
}
