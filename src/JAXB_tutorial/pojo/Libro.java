package JAXB_tutorial.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="libro")
@XmlType(propOrder= {"isbn","autor","titulo"})
public class Libro {
	
	private String titulo ;
	
	private String autor ;
	
	private String isbn ;
	
	public Libro() {
		
	}
	
	public Libro(String t, String a, String i) {
		this.titulo = t ;
		this.autor = a ;
		this.isbn = i ;
	}

	@XmlAttribute(name="isbn")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	 /* Si no indicamos nada en titulo o en autor lo toma como si fuera un elemento del mismo nombre */

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
