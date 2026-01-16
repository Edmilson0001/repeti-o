package sorteiosenac;
import java.security.SecureRandom;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Set<Integer> numerosrepetidos = new HashSet<>();
		for(int i = 0;i<3;i++) {
			int numero = new SecureRandom().nextInt(10);
			numerosrepetidos.add(numero);
		}
        List<Integer> sorteio = new ArrayList<>(numerosrepetidos);
        System.out.println(sorteio);
	}

}
