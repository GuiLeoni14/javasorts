package javassortaula;

import java.util.Comparator;

public class BubbleSort<T> {
	private long contaComparacaoes;
     void troca(T[] v, int i, int j){
        T temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    public T[] sort(T v[], Comparator<T> comparador){
        int n = v.length;
        this.contaComparacaoes = 0;
        for(int fase=1;fase<n;fase++)
            for(int j=0;j<n-fase;j++) {
            	this.contaComparacaoes += 1;
                if(comparador.compare(v[j], v[j+1])>0)
                    troca(v,j,j+1);
            }
        return v;
    }
    
	public Long getContaComparacoes() {
		return this.contaComparacaoes;
	}
    
}
