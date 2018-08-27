/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.MongoConnectionPojo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;

import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import modelo.ItemVenda;
import modelo.Venda;

/**
 *
 * @author Cliente
 */
public class VendaDao {

    private MongoCollection collection;

    public VendaDao() {

        collection = new MongoConnectionPojo().getCollection("Venda", Venda.class);

    }

    public void salvar(Venda venda) {
        collection.insertOne(venda);
    }

    public List<Venda> listar() {

        MongoCursor cursor = collection.find()
                .iterator();

        List<Venda> vendas = new ArrayList<>();
        while (cursor.hasNext()) {
            vendas.add((Venda) cursor.next());
        }

        return vendas;
    }

    public boolean deletar(int codigo) {
        DeleteResult deleteResult = collection.deleteOne(eq("codigo", codigo));
        return deleteResult.getDeletedCount() > 0;

    }

    public Venda buscarPorCodigo(int codigo) {

        MongoCursor cursor = collection.find(eq("codigo", codigo)).iterator();
        return (Venda) cursor.next();
    }

    public boolean AdicionarItem(int codigo, ItemVenda item) {
        Venda venda = buscarPorCodigo(codigo);

        if (venda == null) {
            return false;
        } else {
            List<ItemVenda> itens = new ArrayList<>();

            itens.addAll((Collection<? extends ItemVenda>) venda.getItens());
            itens.add(item);

            collection.updateOne(eq("codigo", codigo), set("itens", itens));
            return true;

        }

    }

}
