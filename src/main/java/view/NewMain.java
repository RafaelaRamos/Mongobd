/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mongodb.client.MongoCollection;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import modelo.ItemVenda;
import modelo.Produto;
import modelo.Venda;
import dao.VendaDao;
import java.io.PrintStream;

/**
 *
 * @author Cliente
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VendaDao dao = new VendaDao();
        Produto produto1 = new Produto(1, "teclado", 30);
        Produto produto2 = new Produto(2, "fone de ouvido", 30);
        ItemVenda itemVenda = new ItemVenda(produto1, 3);
        ItemVenda itemVenda2 = new ItemVenda(produto2, 4);
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(itemVenda);
        itens.add(itemVenda2);
        Venda venda = new Venda(1, itens, LocalDateTime.now());
        //dao.salvar(venda);
        //dao.AdicionarItem(1, itemVenda);
       
       System.out.println(dao.buscarPorCodigo(1) );

    }

}
