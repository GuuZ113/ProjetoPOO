package exemplodeclasses;
import java.util.Scanner;

public class DigitaContaCorrente{
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        Scanner digita = new Scanner(System.in);
        
           
        System.out.println("\n\n\nCadastro em Conta Corrente");
        System.out.println("O saldo é: " + cc.saldo);
        
        System.out.print("Numero da Conta: ");
        cc.numeroConta = digita.nextInt();
        
        System.out.print("Numero do Cliente: ");
        cc.numeroCliente = digita.nextInt();
        
        System.out.print("Data de abertura: ");
        cc.dataAbertura = digita.next();
           
        System.out.print("Codigo do Gerente: ");
        cc.gerente = digita.nextInt();
        
        System.out.print("Limite de Crédito: ");
        cc.limite = digita.nextDouble();
        
        System.out.print("Taxa mensal: ");
        cc.taxaMensal = digita.nextDouble();
        
        System.out.print("Valor do deposito: ");
        cc.depositoConta(digita.nextDouble());
          
        System.out.println("O saldo é: " + cc.saldo);
    }
}
