import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		MergeArray arr = new MergeArray(N, K);
		
		for (int i = 0; i < N; i++) {
			arr.A[i] = sc.nextInt();
		}
		
		arr.merge_sort(0, N - 1);				
    	System.out.println(-1);
	}
}

class MergeArray{
	int[] A;
	private int[] tmp;
	private int k;
	private int cnt;
	public void merge_sort(int p, int r) {		
		int q;
	    if (p < r) {
	        q = (p + r) / 2;
	        merge_sort(p, q);
	        merge_sort(q + 1, r);
	        merge(p, q, r);
	    }
	}
	
	private void merge(int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;				
	    while (i <= q && j <= r) {
	        if (A[i] <= A[j])
	        	tmp[t++] = A[i++];
	        else  
	        	tmp[t++] = A[j++];
	    }
	    while (i <= q)
	        tmp[t++] = A[i++];
	    while (j <= r)
	        tmp[t++] = A[j++];
	    i = p; t = 0;				
	    while (i <= r) {
	    	A[i++] = tmp[t++];
	    	cnt++;
	    	if(cnt == k) {
	    		System.out.println(A[i - 1]);
	    		System.exit(0);
	    	}
	    }
	}
	
	MergeArray(int n, int k){
		A = new int[n];
		tmp = new int[n];
		this.k = k;
		cnt = 0;
	}
}