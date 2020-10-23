import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Mencari Public Key dan Private Key RSA ===");
		long p, q, n, phi, e, d;
		System.out.print("input p = ");
		p = input.nextLong();
		System.out.print("input q = ");
		q = input.nextLong();
		System.out.print("input e = ");
		e = input.nextLong();

		n = p * q;
		phi = (p - 1) * (q - 1);
		d = class1.dlook(phi, e);

		System.out.printf("== Private key ==\nd = %d\nphi = %d\n== Public key ==\nn = %d\ne = %d\n", d, phi, n, e);
		System.out.println("wait..");
		if(class1.ikimethod(phi, e) && class1.primetest(p) && class1.primetest(q)){
			System.out.println("OK");
		}else{
			System.out.println("Not OK");
		}
	}
}