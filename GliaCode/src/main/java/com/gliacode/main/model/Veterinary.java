package com.gliacode.main.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="veterinary_table", catalog="gliacode_database")
public class Veterinary {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String veterinaryName;
	private String VeterinaryOwnerName;
	private int veterinaryPhone;
	private String veterinaryAddress;
	private String veterinaryCountry;
	private String veterinaryCity;
	private Double veterinaryLocationLatitude;
	private Double veterinaryLocationLongitude;
	private ArrayList<String> imgList;
	
	public Veterinary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veterinary(int id, String veterinaryName, String veterinaryOwnerName, int veterinaryPhone,
			String veterinaryAddress, String veterinaryCountry, String veterinaryCity,
			Double veterinaryLocationLatitude, Double veterinaryLocationLongitude, ArrayList<String> imgList) {
		super();
		this.id = id;
		this.veterinaryName = veterinaryName;
		VeterinaryOwnerName = veterinaryOwnerName;
		this.veterinaryPhone = veterinaryPhone;
		this.veterinaryAddress = veterinaryAddress;
		this.veterinaryCountry = veterinaryCountry;
		this.veterinaryCity = veterinaryCity;
		this.veterinaryLocationLatitude = veterinaryLocationLatitude;
		this.veterinaryLocationLongitude = veterinaryLocationLongitude;
		this.imgList = imgList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVeterinaryName() {
		return veterinaryName;
	}

	public void setVeterinaryName(String veterinaryName) {
		this.veterinaryName = veterinaryName;
	}

	public String getVeterinaryOwnerName() {
		return VeterinaryOwnerName;
	}

	public void setVeterinaryOwnerName(String veterinaryOwnerName) {
		VeterinaryOwnerName = veterinaryOwnerName;
	}

	public int getVeterinaryPhone() {
		return veterinaryPhone;
	}

	public void setVeterinaryPhone(int veterinaryPhone) {
		this.veterinaryPhone = veterinaryPhone;
	}

	public String getVeterinaryAddress() {
		return veterinaryAddress;
	}

	public void setVeterinaryAddress(String veterinaryAddress) {
		this.veterinaryAddress = veterinaryAddress;
	}

	public String getVeterinaryCountry() {
		return veterinaryCountry;
	}

	public void setVeterinaryCountry(String veterinaryCountry) {
		this.veterinaryCountry = veterinaryCountry;
	}

	public String getVeterinaryCity() {
		return veterinaryCity;
	}

	public void setVeterinaryCity(String veterinaryCity) {
		this.veterinaryCity = veterinaryCity;
	}

	public double getVeterinaryLocationLatitude() {
		return veterinaryLocationLatitude;
	}

	public void setVeterinaryLocationLatitude(Double veterinaryLocationLatitude) {
		this.veterinaryLocationLatitude = veterinaryLocationLatitude;
	}

	public double getVeterinaryLocationLongitude() {
		return veterinaryLocationLongitude;
	}

	public void setVeterinaryLocationLongitude(Double veterinaryLocationLongitude) {
		this.veterinaryLocationLongitude = veterinaryLocationLongitude;
	}

	public ArrayList<String> getImgList() {
		return imgList;
	}

	public void setImgList(ArrayList<String> imgList) {
		this.imgList = imgList;
	}
	
	
	
}
