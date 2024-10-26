import domain.entity.Cliente;
import domain.entity.Conta;
import service.ContaCorrente;
import service.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(5000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
