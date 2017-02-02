package SIR.tp3;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;


public class App {
	public static void main(String[] args) throws UnknownHostException {
		Morphia morphia = new Morphia();
		Mongo mongo = new Mongo();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");

		Person p = new Person();
		Person pt = new Person();
		Person pd = new Person();
		p.setName("Tintin");
		pt.setName("René");
		pd.setName("Guy");

		List<Address> listAddress = new ArrayList<Address>();
		List<Address> listAdpt = new ArrayList<Address>();
		List<Address> listAdpd = new ArrayList<Address>();
		Address address = new Address();
		address.setStreet("123 Some street");
		address.setCity("Some city");
		address.setPostCode("123 456");
		address.setCountry("Some country");
		// set address
		listAddress.add(address);
		listAdpt.add(address);
		listAdpd.add(address);
		
		p.setAddress(listAddress);
		pt.setAddress(listAddress);
		pd.setAddress(listAddress);
		
		// Save the POJO
		ds.save(p);
		ds.save(pt);
		ds.save(pd);
		for (Person e : ds.find(Person.class)){
			System.out.println(e.getName());
		}
		
//		ds.createQuery(Person.class)
//			.field(arg0)


	}

}
