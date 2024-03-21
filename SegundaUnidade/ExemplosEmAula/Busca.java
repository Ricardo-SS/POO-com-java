package SegundaUnidade.ExemplosEmAula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Busca {
  public static void main(String[] args) {
    ArrayList<String> cores = new ArrayList<>(Arrays.asList("vermelho", "branco", "verde", "azul", "preto", "roxo", "laranja", "rosa" ));
    System.out.println(cores);
    Collections.sort(cores);
    System.out.println(cores);

    buscaElemento(cores, "preto");
  }

  public static void buscaElemento(ArrayList<String> lista, String alvo) {
    int index;
    System.out.println("Bucando por " + alvo);
    index.Collections

  }
}
