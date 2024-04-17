package com.mycompany.app.pdv.tablemodels;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.mycompany.app.pdv.entities.Cliente;


public class ClienteTableModel extends DefaultTableModel {

    public ClienteTableModel() {
        this.addColumn("ID");
        this.addColumn("Nome");
        this.addColumn("Telefone");
        this.addColumn("CPF");
    }
    
    public ClienteTableModel(List<Cliente> listCliente) {
        this();
        
        for (Cliente cliente : listCliente) {
            this.addRow(new String[] {
                Integer.toString(cliente.getId()),
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getCpf()});
        }
    }
    
    public Cliente getSelectedCliente(JTable table, List<Cliente> clientes) {
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            int id = Integer.parseInt((String) table.getValueAt(selectedRow, 0));
            for (Cliente cliente : clientes) {
                if (cliente.getId() == id) {
                    return cliente;
                }
            }
        }

        return null;
    }
    
}
