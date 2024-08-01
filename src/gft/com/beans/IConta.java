/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft.com.beans;

import gft.com.exceptions.SaldoException;

public interface IConta {
    void sacar(Double valor) throws SaldoException;

    void depositar(Double valor);

    void transferir(Double valor, IConta contaDestino) throws SaldoException;

    void ìmprimirExtrato();
}
