import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    
	    Scanner ler = new Scanner(System.in);
		int i, j , a, p, n;
		n = 5;
		int vetor[] = new int[n]; 
    
    for (i=0; i<n; i++) {
      vetor[i] = ler.nextInt();
    }
		
		System.out.println(i);
                
		for (i=5;i <= 5 ;i++){
                    System.out.println(i);
		    for (j=1;j<=5 - vetor[i] ; j++){
		        p = j + 1;
		        if(vetor[j] > vetor[p]){
		            a = vetor[j];
		            vetor[j] = vetor[p];
		            vetor[p] = a;
		        }
		    } 
		} 
	
	    for (;i<=5 ; i++){
	        System.out.println(vetor[i]);
	    }
	}
}