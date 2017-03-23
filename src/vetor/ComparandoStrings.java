/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ComparandoStrings {

    public static void main(String[] args) {
        int i, qtd;
        int som = 0;
        String aux;
        String[] v;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade do vetor?");
        qtd = sc.nextInt();
        v = new String[qtd];

        System.out.println("\nDigite " + qtd + " nomes.");
        for (i = 0; i < v.length; i++) {
            aux = sc.next();
            if (aux.charAt(0) == 'C') {
                v[som] = aux;
                som++;
                aux = "";
            } 
            
        }

        System.out.println("\nOs nomes armazenados foram: ");
        for (i = 0; i < som; i++) {
            System.out.println("Posição i   [" + i + "] - " + v[i]);
        }
    }

}
