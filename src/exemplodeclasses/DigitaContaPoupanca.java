package exemplodeclasses;
import java.util.Scanner;

public class DigitaContaPoupanca{
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        Scanner digita = new Scanner(System.in);
        
           
        System.out.println("Cadastro em Conta Poupança");
        
        System.out.println("O saldo é: " + cp.saldo);
        
        System.out.print("Numero da Conta: ");
        cp.numeroConta = digita.nextInt();
        
        System.out.print("Numero do Cliente: ");
        cp.numeroCliente = digita.nextInt();
        
        System.out.print("Data de abertura: ");
        cp.dataAbertura = digita.next();
        
        System.out.print("Datas de aniversario da conta: ");
        digita.nextLine();
        cp.datasAniversarios = digita.nextLine();
        
        System.out.print("Valor do deposito: ");
        cp.depositoConta(digita.nextDouble());
        
        System.out.print("Valor do saque: ");
        cp.saqueConta(digita.nextDouble());
      
        System.out.println("O saldo é: " + cp.saldo);
    }
}
