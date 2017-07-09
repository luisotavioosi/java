import java.util.ArrayList;
import java.util.Collections;

public class testando_collecion {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classa aula";
		String aula3 = "Trabalhando com Cursos e sets";
	
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		aulas.remove(0);
		System.out.println(aulas);
		for (String aula : aulas) {
				System.out.println("Aula: " +aula);
		
			}
		String PrimeiraAula = aulas.get(0);
		System.out.println(PrimeiraAula);
		int i;
		for(i = 0; i <aulas.size(); i++){
			System.out.println("Aula: " + aulas.get(i));
		}	
		aulas.add("Aumentando nosso conhecimento");
		Collections.sort(aulas);
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
}
}
