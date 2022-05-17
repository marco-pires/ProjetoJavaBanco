package br.com.java;

public class TesteConta {
    public static void main(String[] args) {

        Conta cc = new Conta(50.0);
        System.out.println(cc.recuperarSaldo());

        //Comando "new" gera um objeto em memória, "contaCorrente" é uma nova variável
        /*
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.50;
        contaCorrente.cliente.nome = "Marco";
        contaCorrente.cliente.idade = 30;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente.nome = "Fulano";
        contaPoupanca.cliente.idade = 40;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "Ciclano";
        contaInvestimento.cliente.idade = 50;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);
                 */

    }
}
