
public class fib {
    public static void main(String[] args) {
	int sum = 0;
	for(int i = 1, j = 2, k; j <= 4000000L; k = j, j+=i, i = k) {
	    if(j%2==0) {
		sum+=j;
	    }
	}
	System.out.println(sum);
    }
}
