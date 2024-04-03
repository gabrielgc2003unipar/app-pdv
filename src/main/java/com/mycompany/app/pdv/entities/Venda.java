/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.pdv.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author gabri
 */
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Cliente cliente;
    @OneToMany
    private List<ItemVenda> itemVenda;
    @Column(name = "vl_total")
    private double valorTotal;
    @Column(name = "vl_desconto")
    private double valorDesconto;
    @Column(name = "qt_itens")
    private int quantidadeItens;

    public Venda() {
    }

    public Venda(int id, Cliente cliente, double valorTotal, double valorDesconto, int quantidadeItens) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.quantidadeItens = quantidadeItens;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
    
}
