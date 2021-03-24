package com.gliacode.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gliacode.main.model.PetHotel;
import com.gliacode.main.model.Veterinary;
import com.gliacode.main.serviceimplementation.PetHotelServiceImpl;
import com.gliacode.main.serviceimplementation.VeterinaryServiceImpl;

@RestController
@CrossOrigin("*")
public class HomeController {

	
	// Veterinary Controller Part
	
	
	@Autowired
	private VeterinaryServiceImpl veterinaryServiceImpl;
	
	@PostMapping(value="saveVeterinary")
	public Veterinary saveVeterinary(@RequestBody Veterinary veterinary) {
		System.out.println("..............Save metodu başarıyla çalışıyor.....................");
		veterinaryServiceImpl.saveVeterinary(veterinary);
		return veterinary;
	}
	
	@GetMapping(value="getAllVeterinaries")
	public List<Veterinary> findAllVeterinary(){
		System.out.println("..............GetAll metodu başarıyla çalışıyor.....................");
		return veterinaryServiceImpl.findAllVeterinaries();
	}
	
	@PutMapping("updateVeterinary")
	public Veterinary updateVeterinary(@RequestBody Veterinary veterinary) {
		System.out.println("..............Update metodu başarıyla çalışıyor.....................");
		return veterinaryServiceImpl.updateVeterinary(veterinary);
	}
	
	@DeleteMapping("deleteVeterinary")
	public String deleteVeterinary(@RequestParam int id) {
		veterinaryServiceImpl.deleteVeterinary(id);
		System.out.println("..............Delete metodu başarıyla çalışıyor.....................");
		return "Veterinary Deleted!";
	}
	
	@RequestMapping(path="/{veterinaryLocationLatitude}/{veterinaryLocationLongitude}")
	public ModelAndView searchByLocation(@PathVariable String veterinaryLocationLatitude, @PathVariable String veterinaryLocationLongitude) {
		ModelAndView model = new ModelAndView("veterinary");
		//Veterinary veterinary = veterinaryServiceImpl.findByLocation(veterinaryLocationLatitude, veterinaryLocationLongitude);
		model.addObject("veterinary",null);
		System.out.println("..............location içine girdi.....................");
		return model;
	}	
	@GetMapping("/api/{id}/{name}")
	@ResponseBody
	public List<Veterinary> getEmployeesByIdAndName(@PathVariable("id") Double veterinaryLocationLatitude, @PathVariable ("name") Double veterinaryLocationLongitude) {
		List<Veterinary> veterinary = veterinaryServiceImpl.findByVeterinaryLocationLatitudeAndVeterinaryLocationLongitude(veterinaryLocationLatitude, veterinaryLocationLongitude);
		return veterinary;
	}

//	@GetMapping("/city/{city1}/{city2}/{city3}")
//	@ResponseBody
//	public List<Veterinary> getVeterinaryByCity(@PathVariable("city1") String veterinaryCity) {
//		List<Veterinary> veterinary = veterinaryServiceImpl.findByVeterinaryCity(veterinaryCity);
//		return veterinary;
//	}
	
	//PetHotel Controller Part
	
	
	
	@Autowired
	private PetHotelServiceImpl petHotelServiceImpl;
	
	
	@PostMapping(value="savePetHotel")
	public PetHotel savePetHotel(@RequestBody PetHotel petHotel) {
		System.out.println("..............Save metodu başarıyla çalışıyor.....................");
		petHotelServiceImpl.savePetHotel(petHotel);
		return petHotel;
	}
	
	@GetMapping(value="getAllPetHotels")
	public List<PetHotel> findAllPetHotel(){
		System.out.println("..............GetAll metodu başarıyla çalışıyor.....................");
		return petHotelServiceImpl.findAllPetHotels();
	}
	
	@PutMapping("updatePetHotel")
	public PetHotel updatePetHotel(@RequestBody PetHotel petHotel) {
		System.out.println("..............Update metodu başarıyla çalışıyor.....................");
		return petHotelServiceImpl.updatePetHotel(petHotel);
	}
	
	@DeleteMapping("deletePetHotel")
	public String deletePetHotel(@RequestParam int id) {
		petHotelServiceImpl.deletePetHotel(id);
		System.out.println("..............Delete metodu başarıyla çalışıyor.....................");
		return "Pet Hotel Deleted!";
	}
	

//	@GetMapping("/petHotel/{latitude}/{longitude}")
//	@ResponseBody
//	public PetHotel getPetHotelsByLatitudeAndLongitude(@PathVariable("latitude") Double petHotelLocationLatitude, @PathVariable ("longitude") Double petHotelLocationLongitude) {
//		PetHotel petHotel = petHotelServiceImpl.findByPetHotelLocationLatitudeAndPetHotelLocationLongitude(petHotelLocationLatitude, petHotelLocationLongitude);
//		return petHotel;
//	}
}
