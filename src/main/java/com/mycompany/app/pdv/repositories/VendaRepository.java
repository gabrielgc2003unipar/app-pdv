package com.mycompany.app.pdv.repositories;

import java.util.List;
import com.mycompany.app.pdv.entities.Venda;


public interface VendaRepository {
    
    Venda insert(Venda venda) throws Exception;
    Venda findById(Integer id); 
    List<Venda> findAll();
    Venda update(Venda venda);
    Boolean delete(Venda venda);
}
