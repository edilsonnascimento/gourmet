package br.com.objective.gourmet;

import javax.swing.JOptionPane;

public class Mensagem {
    
    public int inicial(){
            return JOptionPane.showOptionDialog(null, "Pense em um Prato","Jogo Gourmet",JOptionPane.CLOSED_OPTION, -1, null, null, null);
    }
    
    public int confirma(String prato){
        return JOptionPane.showConfirmDialog(null,"O prato que você pensou é " + prato, "Confirm", JOptionPane.YES_NO_OPTION);
    }

    public int acertei() {
         return JOptionPane.showOptionDialog(null, "Acertei","Jogo Gourmet",JOptionPane.CLOSED_OPTION, -1, null, null, null);
    }
    
    public void desisto(BaseDados base){
        
       String nomePrato = JOptionPane.showInputDialog(null,"Qual prato você pensou?", "Desisto", JOptionPane.PLAIN_MESSAGE);
       String tipoPrato = JOptionPane.showInputDialog(null, nomePrato + " é _______mas Bolo de Chocolate não", "Complete", JOptionPane.PLAIN_MESSAGE);
       base.addPratos(new Prato(nomePrato, tipoPrato));       
    }
    
}
