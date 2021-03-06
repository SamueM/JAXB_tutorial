package JAXB_tutorial.pojo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="libreria")
@XmlType(propOrder= {"nombre","libros"})
public class Libreria {
	
	private String nombre ;
	
	private ArrayList<Libro> libros ;
	
	public Libreria() {
		
	}
	
	public Libreria(String n, ArrayList<Libro> al) {
		this.nombre = n ;
		this.libros = al ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@XmlElementWrapper(name="libros")
	@XmlElement(name="libro")
	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

}
