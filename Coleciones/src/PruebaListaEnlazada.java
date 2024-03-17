import java.util.*;


public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LinkedList<String> paises=new LinkedList<String>();
		
		paises.add("España");
		paises.add("China");
		paises.add("Irlanda");
		paises.add("Mexico");
		
		
	LinkedList<String> capitales=new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Pekin");
		capitales.add("Dublin");
		capitales.add("DF");
		
		//System.out.println(paises);
		//System.out.println(capitales);
		
		
		ListIterator<String> iterA=paises.listIterator();
		ListIterator<String> iterB=capitales.listIterator();
		
		while(iterB.hasNext()) {
			
			if(iterA.hasNext()) {
				
				iterA.next();
			}
			iterA.add(iterB.next());
		}
		
		System.out.println(paises);
		
		
		iterB=capitales.listIterator();
		
		while(iterB.hasNext()) {
			
			iterB.next();
			
			if(iterB.hasNext()){
				
				iterB.next();
				
				iterB.remove();
					
			
				
				
				
			}
		}
		System.out.println(capitales);
		
		paises.removeAll(capitales);
		
		System.out.println(paises);
	}

}
