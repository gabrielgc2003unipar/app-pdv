package com.mycompany.app.pdv.repositories;

import java.util.List;
import com.mycompany.app.pdv.entities.Produto;


public interface ProdutoRepository {
    
    Produto insert(Produto produto);
    Produto findById(Integer id); 
    List<Produto> findAll();
    Produto update(Produto produto);
    Boolean delete(Produto produto);
}
