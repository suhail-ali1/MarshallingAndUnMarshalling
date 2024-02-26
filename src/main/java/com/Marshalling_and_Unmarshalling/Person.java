package com.Marshalling_and_Unmarshalling;

import java.time.LocalDate;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Person")
@XmlType(name="" , propOrder = { "firstname" , "lastname" , "dob" , "address" } )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	@XmlElement(required = true)
	private String firstname;
	
	@XmlElement(required = true)
	private String lastname;
	
	@XmlElement(required = true)
	private String dob;
	
	@XmlElement(required = true)
	private String address;
	
}
