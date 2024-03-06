package com.assign.SpringBootApp.util;

import com.assign.SpringBootApp.data.Hotel;
import com.assign.SpringBootApp.data.HotelRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final HotelRepository hotelRepository;

    public AppStartupEvent(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Hotel> hotel = this.hotelRepository.findAll();
        hotel.forEach(System.out::println);
    }
}
