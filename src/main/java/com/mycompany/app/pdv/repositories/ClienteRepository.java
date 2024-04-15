package com.mycompany.app.pdv.repositories;

import java.util.List;
import com.mycompany.app.pdv.entities.Cliente;


public interface ClienteRepository {
    
    Cliente insert(Cliente cliente);
    Cliente findById(Integer id); 
    List<Cliente> findAll();
    Cliente update(Cliente cliente);
    Boolean delete(Cliente cliente);
}
