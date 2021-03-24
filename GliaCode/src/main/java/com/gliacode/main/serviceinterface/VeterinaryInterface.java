package com.gliacode.main.serviceinterface;

import java.util.List;

import com.gliacode.main.model.Veterinary;

public interface VeterinaryInterface {

	public Veterinary saveVeterinary(Veterinary veterinary);
	
	public Veterinary updateVeterinary(Veterinary veterinary);
	
	
	public List<Veterinary> findAllVeterinaries();
	
	public void deleteVeterinary(int id);
	
	public List<Veterinary> findByVeterinaryLocationLatitudeAndVeterinaryLocationLongitude(Double veterinaryLocationLatitude,Double veterinaryLocationLongitude);
	
	//public List<Veterinary> findByVeterinaryCity(String veterinaryCity);
}
