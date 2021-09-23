/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgroups_again;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author lezama
 */
public class Paquete implements Serializable{

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
        final Paquete other = (Paquete) obj;
        if (this.tipo != other.tipo) {
            return false;
        }
        return Objects.equals(this.valor, other.valor);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.tipo);
        hash = 31 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    private final TipoMensaje tipo;
    private final Object valor;
    
    public Paquete(TipoMensaje tipo, Object valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public TipoMensaje getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }
    
}
