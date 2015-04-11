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
@Named(value = "investimento")
@Dependent
public class Investimento {

    /**
     * Creates a new instance of Investimento
     */
    private Conta conta;
    private int id;    
    private Date dataCriacao;    
    private double rendimento;
    private double valor;
        
    public Investimento() {
    }
    
}
