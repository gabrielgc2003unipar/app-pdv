package com.mycompany.app.pdv.services;

import com.mycompany.app.pdv.entities.Produto;
import com.mycompany.app.pdv.repositories.ProdutoRepositoryImp;
import com.mycompany.app.pdv.util.EntityManagerUtil;
import java.util.List;


public class ProdutoService {
    
     public Produto insert(Produto produto){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).insert(produto);
     }
     
     public Produto findById(Integer id){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).findById(id);
     }
     
     public List<Produto> findAll(Integer id){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).findAll();
     }
     
     public List<Produto> findByDesc(String descricao){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).findByDesc(descricao);
     }
     
     public Produto update(Produto produto){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).update(produto);
     }
     
     public boolean delete(Produto produto){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).delete(produto);
     }
}
