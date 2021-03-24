package com.gliacode.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gliacode.main.model.PetHotel;

@Repository 
public interface PetHotelRepository extends CrudRepository<PetHotel ,Integer>{
 
	PetHotel findByPetHotelLocationLatitudeAndPetHotelLocationLongitude(Double petHotelLocationLatitude, Double petHotelLocationLongitude);
}
