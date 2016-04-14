package br.ufg.inf.es.aob.search;

public class Binary {

    public static int buscaIterativa(float vetor[], int key, int lenght){
        int l = 0;
        int r = lenght;

        while (l < r){
            int m = (l + r) / 2;
            if(key == vetor[m]){
                return m;
            }
            if(key < vetor[m]){
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }

        return -1;
    }

    public static int buscaRecursiva(float vetor[], int key, int l, int r){
        if (l > r){
            return -1;
        }
        int m = (l + r) / 2;

        if(vetor[m] == key){
            return m;
        }
        if(vetor[m] > key){
            return buscaRecursiva(vetor, key, l, m - 1);
        }
        else{
            return buscaRecursiva(vetor, key, m + 1, r);
        }
    }

}
