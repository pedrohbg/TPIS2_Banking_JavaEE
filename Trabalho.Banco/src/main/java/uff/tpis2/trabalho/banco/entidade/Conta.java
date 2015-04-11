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
@Named(value = "conta")
@Dependent
public class Conta {

    /**
     * Creates a new instance of Conta
     */
    private int id;
    private char tipo;
    private double saldo;
    private Date dataCriacao;
    private Cliente cliente;
    
}
