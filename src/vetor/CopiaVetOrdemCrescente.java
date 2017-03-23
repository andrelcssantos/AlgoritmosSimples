/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author andre
 */
public class CopiaVetOrdemCrescente {

    int menor, maior, i, j, numero;
    int[] vet1;
    int[] vet2;

    public int[] copiaVet(int qtd) {
        vet1 = new int[qtd];
        vet2 = new int[qtd];
        for (i = 0; i < vet1.length; i++) {
            vet1[i] = (int) criaRandom(qtd).get(i);
        }
        return vet1;
    }

    public List criaRandom(int qtd) {
        List<Integer> numeros = new ArrayList<Integer>();
        for (i = 0; i < qtd; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros);
//        for (i = 0; i < qtd; i++) {
//            System.out.print("["+i+"] <- {"+numeros.get(i)+"}\n");
//        }
        return numeros;
    }

    public static void main(String[] args) {
        CopiaVetOrdemCrescente a = new CopiaVetOrdemCrescente();
        a.copiaVet(5);
    }

}
