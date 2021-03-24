package com.gliacode.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gliacode.main.model.Veterinary;

@Repository
public interface VeterinaryRepository extends CrudRepository<Veterinary,Integer>{

	
	//Veterinary findByVeterinaryLocationLatitudeAndVeterinaryLocationLongitude(Double veterinaryLocationLatitude, Double veterinaryLocationLongitude);
 
	@Query(value="SELECT *FROM veterinary_table WHERE veterinary_location_latitude=? AND veterinary_Location_Longitude=?",nativeQuery=true)
	List<Veterinary> findByVeterinaryLocationLatitudeAndVeterinaryLocationLongitude(Double veterinaryLocationLatitude, Double veterinaryLocationLongitude);
	
//	@Query(value="SELECT * FROM veterinary_table WHERE veterinary_city=? IN ?,?,?",nativeQuery=true)
//	List<Veterinary> findByVeterinaryCity(String veterinaryCity);
	
//	@Query( "select * from veterinary_table  where veterinary_city in : ids" )
//	List<Veterinary> findByVeterinaryCity(@Param("ids") String veterinaryCity);
}
