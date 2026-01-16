package aula0711;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class maindois {

	 public static void main(String[] args) {	 
		 //Scanner input = new Scanner(System.in);
        //for(int i = 0;i<=5;i++ ) {
         // System.out.printf("Digite o produto %s: ",i+1);
    	  //String produto = input.nextLine();
    	  //System.out.println(produto);
		 //ArrayList<String> times = new ArrayList<>();
		 //times.add("Ceara");
		 //times.add("Floresta");
		 //times.add("Ferroviario");
		 //times.add("Tirol");
		 //times.add("Fortaleza");
		 
		 //System.out.println(times);
		 //times.remove(4);
		 //System.out.println(times);
		 //String melhortime = times.get(1);
		 //System.out.println(times.get(1)+ " "+times.get(2));
		 //System.out.println(" ");
		 
		 //for(int i=0;i<times.size();i++) {
		 //System.out.println(times.get(i));
		 
		 
		 ArrayList<String> comidagosto = new ArrayList<>();
		 comidagosto.add("pizza");
		 comidagosto.add("pastel");
		 comidagosto.add("salgado");
		 comidagosto.add("baiao");
		 comidagosto.add("churrasco");
		 comidagosto.add("lasanha");
		 comidagosto.add("churros");
		 comidagosto.add("acai");
		 comidagosto.add("frango");
		 comidagosto.add("maça");
	    Collections.sort(comidagosto);
		//ollections.sort(comidagosto,Collections.reverseOrder());
		// System.out.println(comidagosto);
		 for(int i=0;i<comidagosto.size();i++) {
			 System.out.println(comidagosto.get(i));	 
		 
	} 
	      Scanner input = new Scanner(System.in);
	      System.out.println("Qual produto você quer procurar ");
	      String pesquisa = input.nextLine();
	      int pos = Collections.binarySearch(comidagosto, pesquisa);
	      if (pos>=0){
	      System.out.println("Este produto esta na lista");
	      }else {
	    	  System.out.println("Item não encontrado!");
	      }
 
	 }
}
      
     