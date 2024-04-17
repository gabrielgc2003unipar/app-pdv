package com.mycompany.app.pdv.tablemodels;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.mycompany.app.pdv.entities.Produto;


public class ProdutoTableModel extends DefaultTableModel {

    public ProdutoTableModel() {
        this.addColumn("ID");
        this.addColumn("Descrição");
        this.addColumn("Valor unitário");
    }
    
    public ProdutoTableModel(List<Produto> listProdutos) {
        this();
        
        for (Produto produto : listProdutos) {
            this.addRow(new String[] {
                Integer.toString(produto.getId()),
                produto.getDescricao(),
                Double.toString(produto.getValorUnitario())});
        }
    }
    
    public Produto getSelectedProduto(JTable table, List<Produto> produtos) {
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            int id = Integer.parseInt((String) table.getValueAt(selectedRow, 0));
            for (Produto produto : produtos) {
                if (produto.getId() == id) {
                    return produto;
                }
            }
        }

        return null;
    }
    
}
