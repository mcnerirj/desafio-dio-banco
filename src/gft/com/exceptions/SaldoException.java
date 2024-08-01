package gft.com.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcner
 */
public class SaldoException  extends Exception {
    
    public SaldoException() {
        super("Saldo insuficiente.");
    }

    // Construtor que permite uma mensagem personalizada
    public SaldoException(String message) {
        super(message);
    }   
}
