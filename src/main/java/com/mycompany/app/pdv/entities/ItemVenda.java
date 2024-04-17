
package com.mycompany.app.pdv.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_item_venda")
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Produto produto;
    @ManyToOne
    private Venda venda;
    @Column(name = "ds_itemvenda")
    private String descricao;
    @Column(name = "qt_item")
    private double quantidade;
    @Column(name = "vl_subtotal")
    private double valorTotal;
    @Column(name = "vl_unitario")
    private double valorUnitario;
    @Column(name = "vl_desconto")
    private double descontoProduto;

    public ItemVenda() {
    }

    public ItemVenda(int id, Produto produto, Venda venda, String descricao, double quantidade, double valorTotal, double valorUnitario, double descontoProduto) {
        this.id = id;
        this.produto = produto;
        this.venda = venda;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.valorUnitario = valorUnitario;
        this.descontoProduto = descontoProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getDescontoProduto() {
        return descontoProduto;
    }

    public void setDescontoProduto(double descontoProduto) {
        this.descontoProduto = descontoProduto;
    }
}
