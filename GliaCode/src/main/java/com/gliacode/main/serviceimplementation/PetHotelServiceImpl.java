package com.gliacode.main.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gliacode.main.dao.PetHotelRepository;
import com.gliacode.main.model.PetHotel;
import com.gliacode.main.serviceinterface.PetHotelInterface;


@Service
public class PetHotelServiceImpl implements PetHotelInterface {

	@Autowired
	private PetHotelRepository petHotelRepository;
	
	@Override
	public PetHotel savePetHotel(PetHotel petHotel) {
		
		return petHotelRepository.save(petHotel);
	}

	@Override
	public PetHotel updatePetHotel(PetHotel petHotel) {
		
		return petHotelRepository.save(petHotel);
	}

	@Override
	public List<PetHotel> findAllPetHotels() {
		
		return (List<PetHotel>) petHotelRepository.findAll();
	}

	@Override
	public void deletePetHotel(int id) {
		petHotelRepository.deleteById(id);
		
	}

//	@Override
//	public PetHotel findByPetHotelLocationLatitudeAndPetHotelLocationLongitude(Double petHotelLocationLatitude,
//			Double petHotelLocationLongitude) {
//		// TODO Auto-generated method stub
//		return petHotelRepository.findByPetHotelLocationLatitudeAndPetHotelLocationLongitude(petHotelLocationLatitude, petHotelLocationLongitude);
//	}

	

}
