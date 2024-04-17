package com.mycompany.app.pdv.repositories;

import java.util.List;
import com.mycompany.app.pdv.entities.ItemVenda;


public interface ItemVendaRepository {
    
    ItemVenda insert(ItemVenda itemVenda) throws Exception;
    ItemVenda findById(Integer id); 
    List<ItemVenda> findAll();
    ItemVenda update(ItemVenda itemVenda);
    Boolean delete(ItemVenda itemVenda);
}
