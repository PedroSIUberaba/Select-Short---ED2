package SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        //int[] vetor = {3, 5, 6, 8, 9};
        int nt = 10;
        int[] vetor = new int[nt];
        Random rand = new Random();

        for(int i = 0; i < nt; i++){
            vetor[i] = rand.nextInt(101)*10;
        }

        int tv = vetor.length;

        for(int i = 0; i < tv-1; i++){
            int vmenor = vetor[i];
            int pmenor = i;
            for(int j = i + 1; j < tv; j++){
                if (vmenor > vetor[j]){
                    vmenor = vetor[j];
                    pmenor = j;
                }
            }
            int bkp = vetor[i];
            vetor[i] = vmenor;
            vetor[pmenor] = bkp;
        }
        System.out.println(Arrays.toString(vetor));
    }


}
