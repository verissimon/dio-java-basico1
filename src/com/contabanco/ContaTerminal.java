package com.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) throws Exception {
        /*
         * Permita que os dados sejam inseridos via terminal sendo que o usuário
         * receberá a mensagem de qual informação será solicitada.
         */
        System.out.println("Por favor, digite o número da Agência");
        Scanner scanner = new Scanner(System.in);
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta");
        double saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        /*
         * Exemplo de saída::
         * Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência
         * é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para
         * saque.
         */
        System.out.println(
                "Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo()
                        + " já está disponível para saque.");

        scanner.close();

    }
}
