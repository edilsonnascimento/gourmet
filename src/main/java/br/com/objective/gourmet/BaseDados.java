package br.com.objective.gourmet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edilson
 */
public class BaseDados {
    private List<Prato> pratos = new ArrayList<Prato>();

    public void Inicializa() {  
        Prato prato = new Prato("Lasanha", "Massa");
        addPratos(prato);
    }

    public List<Prato> getPratos() {
        return this.pratos;
    }
    
    public void addPratos(Prato prato){
        pratos.add(prato);
    }
    
}
