package com.mycompany.app.pdv.services;

import com.mycompany.app.pdv.entities.Venda;
import com.mycompany.app.pdv.repositories.VendaRepositoryImp;
import com.mycompany.app.pdv.util.EntityManagerUtil;
import java.util.List;


public class VendaService {
    
    public Venda insert(Venda venda) throws Exception{
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).insert(venda);
    }
    
    public Venda findById(Integer id){
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).findById(id);
    }
    
    public List<Venda> findAll() {
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).findAll();
    }
    
    public Venda update(Venda venda) throws Exception{
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).update(venda);
    }
    
    public boolean delete(Venda venda) throws Exception{
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).delete(venda);
    }
}
