package exemplodeclasses;
import java.util.Scanner;


public class MenuDigitaDados {
   
    public static void main(String[] args) {
     Scanner escolha = new Scanner(System.in);
     int opcao;
     
        System.out.println("Cadastro da Conta");
        
        
        
        do{
        System.out.println("\nSelecione o Tipo de Conta: \n<1> para Corrente \n<2> para Poupança \n<0> para Sair\n");
        opcao = escolha.nextInt();
        
        if(opcao == 1)
        {
            DigitaContaCorrente.main(args);
        }
        else if(opcao == 2){
            DigitaContaPoupanca.main(args);
        }
        else if(opcao == 0){
            System.out.println("Você escolheu sair!");
        }
        else{
            System.out.println("Opção Inválida!");
        }
        }while(opcao != 0);
    }
    
}

