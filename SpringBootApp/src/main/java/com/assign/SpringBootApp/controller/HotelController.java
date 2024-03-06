package com.assign.SpringBootApp.controller;

import com.assign.SpringBootApp.data.Hotel;
import com.assign.SpringBootApp.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @GetMapping()
    public List<Hotel> getAllHotel() {
        return hotelService.getAllHotels();
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel newHotel) {
        return hotelService.createHotel(newHotel);
    }

    @PutMapping("/{id}")
    public Hotel updateHotel(@PathVariable Long id, @RequestBody Hotel updatedHotel) {
        return hotelService.updateHotel(id, updatedHotel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHotel(@PathVariable Long id) {
        hotelService.deleteHotel(id);
        return new ResponseEntity<>("Hotel deleted successfully", HttpStatus.OK);
    }
}
