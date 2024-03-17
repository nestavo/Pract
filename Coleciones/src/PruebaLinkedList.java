import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LinkedList<String> personas = new LinkedList<String>();
		
		
		personas.add("Pepe");
		
		personas.add("Plin Plin");
		
		personas.add("Lola");
		
		personas.add("Bartolito");
		
		personas.add("Chancha");
		
		
		System.out.println(personas.size());
		
		ListIterator<String> it=personas.listIterator();
		
		it.next();
		
		it.add("Beto");
		
		for (String persona : personas) {
			
			System.out.println(persona);
		}
		
	}

}
