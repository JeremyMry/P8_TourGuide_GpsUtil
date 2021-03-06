package com.tourguide.gpsUtil.controller;

import com.tourguide.gpsUtil.model.Attraction;
import com.tourguide.gpsUtil.model.Location;
import com.tourguide.gpsUtil.model.VisitedLocation;
import com.tourguide.gpsUtil.service.GpsUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GpsUtilController {

    @Autowired
    GpsUtilService gpsUtilService;

    @GetMapping("/getUserLocation")
    public VisitedLocation getUserLocationServer(@RequestParam String user) {
        return gpsUtilService.getUserLocation(UUID.fromString(user));
    }

    @GetMapping("/getAllAttractions")
    public List<Attraction> getAllAttractionsServer() {
        return gpsUtilService.getAttraction();
    }
}
