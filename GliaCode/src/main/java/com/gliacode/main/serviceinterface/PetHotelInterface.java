package com.gliacode.main.serviceinterface;

import java.util.List;

import com.gliacode.main.model.PetHotel;

public interface PetHotelInterface {

	public PetHotel savePetHotel(PetHotel petHotel);
	
	public PetHotel updatePetHotel(PetHotel petHotel);
	
	
	public List<PetHotel> findAllPetHotels();
	
	public void deletePetHotel(int id);
	
	//public PetHotel findByPetHotelLocationLatitudeAndPetHotelLocationLongitude(Double petHotelLocationLatitude,Double petHotelLocationLongitude);

}
