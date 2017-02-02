package SIR.tp3;

import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity
public class Person {
	
	@Id
	private ObjectId id;
	private String name;
	@Embedded
	private List<Address> address;
	
	public Person() {
	}
	
	public Person(String name, List<Address> address) {
		this.name = name;
		this.address = address;
	}

	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	
	
	

}
