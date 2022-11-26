package com.spring.core.jdbc.DAO;

public class Category {
	private int id;
	private String name;
	private String description;
	private String setId;
	
	
	public Category () 
	{
		super();
	}
    
	public Category(int id, String name,String description) {
		super();
		this.id =id;
		this.name =name;
		this.description = description;
		
	}

	public String getName() {
		return name;
	
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return getId();
	}

	public void setSetId(String setID) {
		this.setId = setID;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	
	
	public String toString() {
		 return "Categories [id=" +", name" +name+", description+" + description +"]" ;
	}
	
}
