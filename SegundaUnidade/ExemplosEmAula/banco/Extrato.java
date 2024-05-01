package SegundaUnidade.ExemplosEmAula.banco;

import java.util.ArrayList;

public class Extrato {
  private double saldo;
  private ArrayList<Double> transacoes;

  Extrato () {
    saldo = 0;
    transacoes = new ArrayList<Double>();
  }

  public void deposito(double valor) {
    saldo += valor;
    transacoes.add(valor);
  }

  public void saque(double valor) {
    if (saldo >= valor){ 
      saldo -= valor;
      transacoes.add(-valor);
    } else {
      System.out.println("Saldo insuficiente! ");
      System.out.println("Tecle 3 para visualizar o saldo! ");
    }
  }

  public void visualizar() {
    System.out.println("===========================");
    for (int i = 0; i < transacoes.size(); i++) {
      if(transacoes.get(i) > 0){
        System.out.println(" Transação " + i + ": \t" + transacoes.get(i) + " C");
      } else {
        System.out.println(" Transação " + i + ": \t" + transacoes.get(i) + " D");
      }
    }
    System.out.println("===========================");
    System.out.println("\tSaldo: " + saldo);
    System.out.println("===========================");
  }
}
