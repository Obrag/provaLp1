/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Aluno Fatec
 */
public class sofa1 {
        
       public String cor;
       public String tamanho;
       public String preco;

    public sofa1(String cor, String tamanho, String preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
       
       
    public void sentar() {
		System.out.println("sentando");
	}
	
	public boolean levantar() {
		System.out.println("levanta");
		return true;
    

        
        }
}
