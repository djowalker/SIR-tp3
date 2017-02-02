package SIR.tp3;

import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity
public class Article {
	
	@Id
	private ObjectId id;
	private String name;
	private int stars;
	
	@Reference
	private List<Person> buyers;
	
	public Article(){
	}
	
	public Article(String name, int stars) {
		this.name = name;
		this.stars = stars;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}
	

}
