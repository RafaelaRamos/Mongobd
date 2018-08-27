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
        
        
        //MongoConection connection = new MongoConection();
       // MongoCollection colecao = connection.getCollection("Pessoa");
        //PessoaDao dao = new PessoaDao();
      //dao.salvar(new Pessoa("mae",54,"222.222.222-22"));
       
      //System.out.println(dao.buscarPorCpf("222.222.222-22"));
       

      VendaDao dao = new VendaDao();
     Produto produto1 = new Produto(1,"tv",30);
     Produto produto2 = new Produto(2,"fone de ouvido",30);
     Produto produto3 = new Produto(4,"lapis",2);
     ItemVenda itemVenda = new ItemVenda(produto1,3);
     ItemVenda itemVenda2 = new ItemVenda(produto2,4);
     List <ItemVenda> itens = new ArrayList<>();
     //itens.add(itemVenda);
    // itens.add(itemVenda2);
     Venda venda = new Venda(3,itens,LocalDateTime.now());
     ItemVenda itemVenda4 = new ItemVenda(produto3,1);
     //dao.salvar(venda);
    //dao.AdicionarItem(3, itemVenda);
      System.out.println(dao.buscarPorCodigo(3) );
      
     
    }
    
}
