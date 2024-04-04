/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.services;

import com.mycompany.app.pdv.entities.Cliente;
import com.mycompany.app.pdv.repositories.ClienteRepository;
import com.mycompany.app.pdv.util.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author gabri
 */
public class ClienteService {
    public Cliente findById(Integer id){
        return new ClienteRepository(EntityManagerUtil.getManager()).findById(id);
    }

    public List<Cliente> findAll(Integer id){
        return new ClienteRepository(EntityManagerUtil.getManager()).findAll();
    }

    public List<Cliente> findByName(String name){
        return new ClienteRepository(EntityManagerUtil.getManager()).findByName(name);
    }
}
