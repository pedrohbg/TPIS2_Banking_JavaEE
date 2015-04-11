/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidades.Exercicios;

/**
 *
 * @author Pedro
 */
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped; 
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Named(value = "contato")
@RequestScoped
public class Contato {
    @NotNull
    @Size(min = 5, message = "Nome deve possuir no mínimo 5 caracteres.")
    private String nome;
    private String sexo;
    @NotNull
    private String telefone;
    private Date aniversario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
    
    public void SalvarContato(){
        
    }
    
    
}
