public class class1{
	static boolean primetest(long a){
		long b = 2;
		boolean c = true;
		for (int i = 0; i < a/2; i++){
			if(a % b == 0){
				return false;
			}else{
				b++;
			}
		}
		return true;
	}
	static long dlook(long phi, long e){
		long dp[] = {phi, phi, e, 1};
		long a, b, hasil = 0;
		boolean z = true;
		while (dp[2] != 1){
			a = dp[0] % dp[2];
			b = dp[1] - (dp[0] / dp[2] * dp[3]);
			if(b < 0){
				b = (b < 0) ? (phi - (Math.abs(b) % phi) ) % phi : (b % phi);
			}
			dp[0] = dp[2];
			dp[1] = dp[3];
			dp[2] = a;
			dp[3] = b;
			hasil = dp[3];
		}
		return hasil;
	}
	static boolean ikimethod(long phi,long e){
		boolean hasil = true;
		if (phi % e == 0) {
			hasil = false;
		}
		boolean z = primetest(e);
		return hasil && z;
	}
}