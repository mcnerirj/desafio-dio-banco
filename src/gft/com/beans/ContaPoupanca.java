/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft.com.beans;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ìmprimirExtrato() {
        System.out.println("EXTRATO CONTA CORRENTE");
        super.imprimirConta();
    }
}
