package com.Marshalling_and_Unmarshalling;

import java.io.StringReader;
import java.io.StringWriter;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

@SpringBootApplication
public class MarshallingAndUnmarshallingApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(MarshallingAndUnmarshallingApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	  
		// Marshalling -> Converting Java Object to XML
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = context.createMarshaller();
		
		Person person = new Person("AB", "Devillers", "17/02/1984" , "South Africa" );
		
		StringWriter writer =  new StringWriter();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(person, writer);
		
		String xml = writer.toString();
		
		System.out.println(xml);
		
		System.out.println("-------------------------------------");
		
		// UnMarshalling -> XML to Java Object
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		StringReader reader = new StringReader(xml);
		System.out.println(unmarshaller.unmarshal(reader));
		
		
		
		
		
		
		
		
		
		
	}
  
}
