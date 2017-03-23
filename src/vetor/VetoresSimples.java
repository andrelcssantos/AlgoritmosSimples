/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

/**
 *
 * @author andre
 */
import java.util.Scanner;

public class VetoresSimples {

    public static void main(String[] args) {

        int[] vetor = new int[3];
        int[] vetorAux = new int[3];
        int i;
        int aux = vetor.length - 1;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite os valores para o vetor[" + i + "] :");
            vetor[i] = sc.nextInt();
        }
        
        //imprime os valores pares do vetor
        System.out.print("\nValores Pares: \n");
        for (i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0)
                System.out.print("Posição ["+i+"]={" + vetor[i] + "} \n");
        }
        
        //imprime o valor do vetor de forma crescente
        System.out.print("\nVetor: ");
        for (i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        
        //imprime o valor do vetor de forma decrescente
        System.out.print("\nVetor Invertido: ");
        for (i = 0; i < vetor.length; i++) {
            vetorAux[i] = vetor[aux];
            aux--;
            System.out.print("[" + vetorAux[i] + "]");
        }
        
        
    }

}
