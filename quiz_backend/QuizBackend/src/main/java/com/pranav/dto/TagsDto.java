package com.pranav.dto;


public class TagsDto {
	
	private int id;

	private String name;
	
	private String imageUrl;
	

	public TagsDto() {}

	public TagsDto(int id, String name, String imageURl) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageURl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	

}
