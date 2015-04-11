/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidade;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Pedro
 */
@Named(value = "transacao")
@Dependent
public class Transacao {

    /**
     * Creates a new instance of Transacao
     */
    private int id;
    private Date data;
    private double valor;
    private char tipo;
    
    public Transacao() {
    }
    
}
