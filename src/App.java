import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
    
    String[] moeda = {"Cara","Coroa"};
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int escolha =0;
    String sopadeLegumes = "";
    int vitoria = 0;
    int derrota = 0;

        for(int j = 0; j <6; j++){
            
        	String armazena = "";
            for (int i = 0; i < 1; i++) {
                int sort = rand.nextInt(2);
                armazena += moeda[sort];
            }
                System.out.println("Escolha:\n[1] - CARA\n[2] - COROA");
                escolha = sc.nextInt();
                if(escolha == 1){
                    sopadeLegumes = "Cara";
                }if(escolha == 2){
                    sopadeLegumes = "Coroa";
                }
        
        System.out.println("Voce escolheu: "+sopadeLegumes);
        System.out.println("A moeda deu: "+armazena);
            if(sopadeLegumes.equals(armazena)){
                vitoria++;
            }else{
                derrota++;
            }
            
        }
        limparTela();
        System.out.println(":::::::::::::::::PLACAR FINAL:::::::::::::::::");
        System.out.println("||    VITORIAS: "+vitoria+"                 ||");
        System.out.println("||    DERROTAS: "+derrota+"                 ||");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
    

}
public static void limparTela() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
  }

