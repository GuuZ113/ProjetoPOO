
package exemplodeclasses;


public class Conta {
    
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    void saqueConta(double valor){
        saldo = saldo - valor;  
      
    }
    
    void depositoConta(double valor){
        saldo = saldo + valor;
    }
    
    Conta(){
        saldo = 100.00;
        dataAbertura = "14/02/2002";
        numeroConta = 7198847;
        numeroCliente = 142616;
    }
}
