package JAXB_tutorial.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import JAXB_tutorial.pojo.Libreria;
import JAXB_tutorial.pojo.Libro;

public class JAXB_main {

	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext content = JAXBContext.newInstance(Libreria.class) ;
		
		Marshaller marshaller = content.createMarshaller() ;
		
		Libro libro1 = new Libro("Java 8","Samuel M.","123456789");
		Libro libro2 = new Libro("Buenos Dias","Samuel M.","987654321");
		Libro libro3 = new Libro("Libro 3","Samuel M.","321456987");
		
		ArrayList<Libro> ar = new ArrayList<Libro>();
		ar.add(libro1);
		ar.add(libro2);
		ar.add(libro3);
		
		Libreria libreria = new Libreria("Mi libreria",ar);
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		//marshaller.marshal(libreria, System.out);
		
		marshaller.marshal(libreria, new FileWriter("milibreria.xml"));

	}

}
