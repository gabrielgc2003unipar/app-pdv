package com.mycompany.app.pdv.services;

import com.mycompany.app.pdv.entities.Cliente;
import com.mycompany.app.pdv.repositories.ClienteRepositoryImp;
import com.mycompany.app.pdv.util.EntityManagerUtil;
import java.util.List;


public class ClienteService {
    
    public Cliente insert(Cliente cliente){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).insert(cliente);
    }
    
    public Cliente findById(Integer id){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).findById(id);
    }

    public List<Cliente> findAll(Integer id){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).findAll();
    }

    public List<Cliente> findByName(String name){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).findByName(name);
    }
    
    public Cliente update(Cliente cliente){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).update(cliente);
    }
    
    public boolean delete(Cliente cliente){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).delete(cliente);
    }
}
