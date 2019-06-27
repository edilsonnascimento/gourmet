package br.com.objective.gourmet;

public class InicializaJogo {
    
    public static void main(String args[]) {

        BaseDados base = new BaseDados();
        Mensagem mensagem = new Mensagem();
        int opcao;
        int i = 0;
        boolean jogar = true;
        
        base.Inicializa();                
        
        while (jogar){                        
            opcao = mensagem.inicial();

            if(opcao == -1) System.exit(0);

            if(opcao == 0){
                while(base.getPratos().size() > i ){                    
                    opcao = mensagem.confirma(base.getPratos().get(i).getTipo());                                        
                    if(opcao == -1) break;                    
                    if(opcao == 1) i++;                    
                    if(opcao == 0){
                       opcao = mensagem.confirma(base.getPratos().get(i).getNome());
                       if(opcao == 0){
                           mensagem.acertei();
                           break;
                       }
                       if(opcao == 1){
                           mensagem.desisto(base);
                           break;                           
                       }
                    }
                }
                
                if(base.getPratos().size() == i){
                   opcao = mensagem.confirma("Bolo de Chocolate");                   
                   if(opcao == 0) mensagem.acertei();                   
                   if(opcao == 1) mensagem.desisto(base);                   
                }                
            }
            i = 0;            
        }
        System.exit(0);    
    }
}
