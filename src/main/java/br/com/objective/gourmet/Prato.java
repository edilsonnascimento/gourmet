package br.com.objective.gourmet;

/**
 *
 * @author edilson
 */
public class Prato {
        
    private String nome;
    private String tipo;

    public Prato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }   
    
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }    
}
