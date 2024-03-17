
import java.util.*;
public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	/*	TreeSet<String> ordenaPersonas=new TreeSet<String>();
		
		
		ordenaPersonas.add("JNes");
		
		ordenaPersonas.add("Nestavin");
			
		ordenaPersonas.add("Alba");
		
		for (String s : ordenaPersonas) {
			
			
			System.out.println(s);
		}*/
		
		
		
		Articulo primero=new Articulo(1, "Primer articulo");
		
		Articulo segundo=new Articulo(4, "Y este el Segundo articulo");
		
		Articulo tercero=new Articulo(3, "Este es el Tercer articulo");
		
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercero);
		
		ordenaArticulos.add(primero);
		
		ordenaArticulos.add(segundo);
		
		
		for (Articulo art : ordenaArticulos) {
			
			
			System.out.println(art.getDescripcion());
			
		}
		//Articulo compArticulo= new Articulo();
		
		//TreeSet<Articulo> ordenaArt2=new TreeSet<Articulo>(compArticulo);
		
		//ComparadorArticulos compara_art=new ComparadorArticulos();
		
		TreeSet<Articulo> ordenaArt2=new TreeSet<Articulo>(new Comparator<Articulo>() {
			public int compare(Articulo o1, Articulo o2) {
				// TODO Auto-generated method stub
				
				String desc1=o1.getDescripcion();
				String desc2=o2.getDescripcion();
				
				return desc1.compareTo(desc2);
			}
		});
		
		ordenaArt2.add(primero);
		ordenaArt2.add(segundo);
		ordenaArt2.add(tercero);
		
		
		for (Articulo art : ordenaArt2) {
			
			System.out.println(art.getDescripcion());
		}
		
	}

	
	
	
	
}


class Articulo implements Comparable<Articulo>{
	
	
	
	public Articulo(int num,String desc) {
		
		num_art=num;
		
		descripcion=desc;
		
		
	}
	

	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return num_art - o.num_art;
	}
	
	public String getDescripcion(){
		
		return descripcion;
	}
	
	private int num_art;
	
	private String descripcion;

	
}



