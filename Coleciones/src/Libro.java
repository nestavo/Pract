import java.util.Objects;

public class Libro {

	public Libro(String titulo,String autor, int ISBM) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.ISBM=ISBM;
		
		
	}

	public String getDatos() {
		
		return "El titulo es " +titulo+ ". El autor es "+ autor +
				". Y el ISBM es "+ ISBM;
	}
	
	/*public boolean equals(Object obj) {
		
		if(obj instanceof Libro) {
			
			Libro otro=(Libro)obj;
			
			if(this.ISBM==otro.ISBM) {
				
				return true;
				
			}else {
				
				return false;
			}
			
		}else {
			
			return false;
		}
	}*/
	
	
	
	
	
	
	
	private String titulo;
	@Override
	public int hashCode() {
		return Objects.hash(ISBM);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBM == other.ISBM;
	}

	private String autor;
	private int ISBM;
	
	
	
	
}
