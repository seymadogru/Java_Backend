package com.gliacode.main.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gliacode.main.dao.VeterinaryRepository;
import com.gliacode.main.model.Veterinary;
import com.gliacode.main.serviceinterface.VeterinaryInterface;

@Service
public class VeterinaryServiceImpl implements VeterinaryInterface{

	@Autowired
	private VeterinaryRepository veterinaryRepository;
	
	@Override
	public Veterinary saveVeterinary(Veterinary veterinary) {
		
		return veterinaryRepository.save(veterinary);
	}

	@Override
	public Veterinary updateVeterinary(Veterinary veterinary) {
		
		return veterinaryRepository.save(veterinary);
	}

	@Override
	public List<Veterinary> findAllVeterinaries() {
		
		return (List<Veterinary>) veterinaryRepository.findAll();
	}
	

	@Override
	public void deleteVeterinary(int id) {
		
		veterinaryRepository.deleteById(id);
	}
	
	@Override
	public List<Veterinary> findByVeterinaryLocationLatitudeAndVeterinaryLocationLongitude(Double veterinaryLocationLatitude,
			Double veterinaryLocationLongitude) {
		
		return veterinaryRepository.findByVeterinaryLocationLatitudeAndVeterinaryLocationLongitude(veterinaryLocationLatitude, veterinaryLocationLongitude);
	}

//	@Override
//	public List<Veterinary> findByVeterinaryCity(String veterinaryCity) {
//		
//		return veterinaryRepository.findByVeterinaryCity(veterinaryCity);
//	}
  

}
