package SIR.tp3;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class Address {
	
	@Id
	private ObjectId id;
	private String city;
	private String street;
	private String postCode;
	private String country;
	
	public Address(){
	}
		
	public Address(String city, String street, String postCode, String country) {
		this.city = city;
		this.street = street;
		this.postCode = postCode;
		this.country = country;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
		

}
