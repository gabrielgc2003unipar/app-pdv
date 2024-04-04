/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.services;

import com.mycompany.app.pdv.entities.Venda;
import com.mycompany.app.pdv.repositories.VendaRepository;
import com.mycompany.app.pdv.util.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author gabri
 */
public class VendaService {
    public Venda save(Venda venda) throws Exception{
        return new VendaRepository(EntityManagerUtil.getManager()).save(venda);
     }
    public Venda findById(Integer id){
        return new VendaRepository(EntityManagerUtil.getManager()).findById(id);
    }
    public List<Venda> findAll() {
        return new VendaRepository(EntityManagerUtil.getManager()).findAll();
    }   
}
