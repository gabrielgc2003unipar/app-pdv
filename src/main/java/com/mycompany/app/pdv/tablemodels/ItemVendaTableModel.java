package com.mycompany.app.pdv.tablemodels;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.mycompany.app.pdv.entities.ItemVenda;


public class ItemVendaTableModel extends DefaultTableModel {

    public ItemVendaTableModel() {
        this.addColumn("Produto");
        this.addColumn("Valor Unit.");
        this.addColumn("Qtd.");
        this.addColumn("Desconto");
        this.addColumn("Valor Total");
    }
    
    public ItemVendaTableModel(List<ItemVenda> listItemVenda) {
        this();
        
        for (ItemVenda itemVenda : listItemVenda) {
            this.addRow(new String[] {
                itemVenda.getProduto().getDescricao(),
                Double.toString(itemVenda.getProduto().getValorUnitario()),
                Double.toString(itemVenda.getDescontoProduto()),
                Double.toString(itemVenda.getValorTotal()),
                Double.toString(itemVenda.getQuantidade())});
        }
    }
    
}
