package service;

import domain.entity.Cliente;
import domain.entity.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.ImprimeInformacoesClientes();
    }
}
