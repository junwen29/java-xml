package com.jw.xml.models;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *  This is a XML container class to store locations for XML marshalling in a single Event
 */
//@XmlRootElement(name = "locations")
public class Locations {

    /**
     * element that is going to be marshaled in the xml
     */
    List<Location> locations;

    public Locations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    @XmlElement(name = "location")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "locations=" + locations +
                '}';
    }
}
