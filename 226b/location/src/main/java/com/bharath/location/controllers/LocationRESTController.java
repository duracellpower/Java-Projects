package com.bharath.location.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.xml.stream.Location;
import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {
    public List<Location> getLocations(){
    }
}
