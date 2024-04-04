/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.repositories;

import com.mycompany.app.pdv.entities.Produto;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author gabri
 */
public class ProdutoRepository {
    private EntityManager entityManager;

    public ProdutoRepository(EntityManager entityManager) {
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
}
