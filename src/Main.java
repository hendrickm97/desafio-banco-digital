import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Hendrick");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Mayara");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Paulo");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        Conta cc2 = new ContaCorrente(cliente2);
        Conta poupanca2 = new ContaPoupanca(cliente2);

        Conta cc3 = new ContaCorrente(cliente3);
        Conta poupanca3 = new ContaPoupanca(cliente3);

        cc.depositar(2000);
        cc.transferir(800, poupanca);

        cc2.depositar(3000);
        cc2.transferir(1500, poupanca2);

        cc.depositar(12000);
        cc.transferir(5000, poupanca3);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        ((ContaPoupanca) poupanca).renderJuros();

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();
        ((ContaPoupanca) poupanca2).renderJuros();

        cc3.imprimirExtrato();
        poupanca3.imprimirExtrato();
        ((ContaPoupanca) poupanca3).renderJuros();
    }
}
