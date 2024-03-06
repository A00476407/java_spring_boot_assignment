package com.assign.SpringBootApp.services;

import com.assign.SpringBootApp.data.Hotel;
import com.assign.SpringBootApp.data.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public Hotel createHotel(Hotel newHotel) {
        return hotelRepository.save(newHotel);
    }

    public Hotel updateHotel(Long id, Hotel updatedHotel) {
        Optional<Hotel> optionalHotel = hotelRepository.findById(id);
        if (optionalHotel.isPresent()) {
            Hotel existingHotel = optionalHotel.get();
            existingHotel.setName(updatedHotel.getName());
            existingHotel.setRanking(updatedHotel.getRanking());
            existingHotel.setLocation(updatedHotel.getLocation());
            return hotelRepository.save(existingHotel);
        } else {
            // Handle hotel not found scenario
            return null;
        }
    }

    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }
}