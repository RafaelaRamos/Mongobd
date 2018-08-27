/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Cliente
 */
public class Venda {
    private int codigo;
    private List<ItemVenda> itens;
    private LocalDateTime dataHora;
    public Venda (){

itens= new ArrayList();
dataHora = LocalDateTime.now( );
}

    public Venda(int codigo, List<ItemVenda> itens, LocalDateTime dataHora) {
        this.codigo = codigo;
        this.itens = itens;
        this.dataHora = dataHora;
    }

    public Venda(Venda venda) {
       
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.codigo;
        hash = 47 * hash + Objects.hashCode(this.itens);
        hash = 47 * hash + Objects.hashCode(this.dataHora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.itens, other.itens)) {
            return false;
        }
        if (!Objects.equals(this.dataHora, other.dataHora)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", itens=" + itens + ", dataHora=" + dataHora + '}';
    }
    
}




