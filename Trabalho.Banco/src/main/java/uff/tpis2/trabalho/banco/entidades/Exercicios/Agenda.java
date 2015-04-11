/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidades.Exercicios;

import uff.tpis2.trabalho.banco.entidades.Exercicios.Contato;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro
 */
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
@Named(value = "agenda")
@SessionScoped
public class Agenda implements Serializable {
    private List<Contato> listaContatos;

    public List<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(List<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    public Agenda(List<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    public Agenda() {
        this.listaContatos = new ArrayList<>();
    }
    
    public void salvarNovoContato(Contato contato){
        
        this.listaContatos.add(contato);
    }
    public void removerContato(Contato contato){
        
        this.listaContatos.remove(contato);
    }
    
    
    
}
