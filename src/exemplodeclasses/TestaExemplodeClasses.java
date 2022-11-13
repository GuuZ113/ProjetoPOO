package exemplodeclasses;
//import javax.swing.JOpLionPane;

public class TestaExemplodeClasses {

    
    public static void main(String[] args) {
        
        ContaPoupanca cp = new ContaPoupanca(7800, "10-10-2022", 800);
        System.out.println("O saldo é: " + cp.saldo);
        System.out.println("O numero da conta é: " + cp.numeroConta);
        
  
        ContaCorrente cc = new ContaCorrente();
        System.out.println("O saldo em poupança é: " + cp.saldo);
        
        
    }
    
}
