/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.services;

import com.mycompany.app.pdv.entities.Produto;
import com.mycompany.app.pdv.repositories.ProdutoRepository;
import com.mycompany.app.pdv.util.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author gabri
 */
public class ProdutoService {
    
     public Produto findById(Integer id){
         return new ProdutoRepository(EntityManagerUtil.getManager()).findById(id);
     }
     
     public List<Produto> findAll(Integer id){
         return new ProdutoRepository(EntityManagerUtil.getManager()).findAll();
     }
     
     public List<Produto> findByDesc(String descricao){
         return new ProdutoRepository(EntityManagerUtil.getManager()).findByDesc(descricao);
     }
}
