package com.gliacode.main.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pethotel_table", catalog="gliacode_database")
public class PetHotel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String petHotelName;
	private String petHotelOwnerName;
	private int petHotelPhone;
	private String petHotelAddress;
	private String petHotelCountry;
	private String petHotelCity;
	private int petHotelLocationLatitude;
	private int petHotelLocationLongitude;
	private ArrayList<String> imgList;
	public PetHotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PetHotel(int id, String petHotelName, String petHotelOwnerName, int petHotelPhone, String petHotelAddress,
			String petHotelCountry, String petHotelCity, int petHotelLocationLatitude, int petHotelLocationLongitude,
			ArrayList<String> imgList) {
		super();
		this.id = id;
		this.petHotelName = petHotelName;
		this.petHotelOwnerName = petHotelOwnerName;
		this.petHotelPhone = petHotelPhone;
		this.petHotelAddress = petHotelAddress;
		this.petHotelCountry = petHotelCountry;
		this.petHotelCity = petHotelCity;
		this.petHotelLocationLatitude = petHotelLocationLatitude;
		this.petHotelLocationLongitude = petHotelLocationLongitude;
		this.imgList = imgList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPetHotelName() {
		return petHotelName;
	}
	public void setPetHotelName(String petHotelName) {
		this.petHotelName = petHotelName;
	}
	public String getPetHotelOwnerName() {
		return petHotelOwnerName;
	}
	public void setPetHotelOwnerName(String petHotelOwnerName) {
		this.petHotelOwnerName = petHotelOwnerName;
	}
	public int getPetHotelPhone() {
		return petHotelPhone;
	}
	public void setPetHotelPhone(int petHotelPhone) {
		this.petHotelPhone = petHotelPhone;
	}
	public String getPetHotelAddress() {
		return petHotelAddress;
	}
	public void setPetHotelAddress(String petHotelAddress) {
		this.petHotelAddress = petHotelAddress;
	}
	public String getPetHotelCountry() {
		return petHotelCountry;
	}
	public void setPetHotelCountry(String petHotelCountry) {
		this.petHotelCountry = petHotelCountry;
	}
	public String getPetHotelCity() {
		return petHotelCity;
	}
	public void setPetHotelCity(String petHotelCity) {
		this.petHotelCity = petHotelCity;
	}
	public int getPetHotelLocationLatitude() {
		return petHotelLocationLatitude;
	}
	public void setPetHotelLocationLatitude(int petHotelLocationLatitude) {
		this.petHotelLocationLatitude = petHotelLocationLatitude;
	}
	public int getPetHotelLocationLongitude() {
		return petHotelLocationLongitude;
	}
	public void setPetHotelLocationLongitude(int petHotelLocationLongitude) {
		this.petHotelLocationLongitude = petHotelLocationLongitude;
	}
	public ArrayList<String> getImgList() {
		return imgList;
	}
	public void setImgList(ArrayList<String> imgList) {
		this.imgList = imgList;
	}
	
	
	
	
}
