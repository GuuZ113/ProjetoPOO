
package exemplodeclasses;


public class ContaPoupanca extends Conta{
    String datasAniversarios;
    
    @Override
    void saqueConta(double valor){
        if((saldo - valor)< 0)
            System.out.println("ERRO:Saldo ficará abaixo de 0.00");
        else saldo=saldo - valor;       
    }
    
    ContaPoupanca(){
        
    }
    
    ContaPoupanca(String x , double y){
        dataAbertura = x;
        saldo = y;
    }
    
    ContaPoupanca(int numeroConta, String dataAbertura, double saldo){
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }
    
}
