package io.serialization;

import java.io.Serializable;
import java.util.Objects;

public class User  implements Serializable{

	private String userId;
	private String name;
	private String location;
	private String gender;

	public User() {

	}

	

	public User(String userId, String name, String location, String gender) {
		super();
		this.userId = userId;
		this.name = name;
		this.location = location;
		this.gender = gender;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		
		return "("+userId+" "+location+" "+gender+")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userId, other.userId);
	}

	
	
	

}
