package com.jw.xml.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Events {

    private List<Event> events;

    public Events(List<Event> events) {
        this.events = events;
    }

    public Events() {
    }

    public List<Event> getEvents() {
        return events;
    }

    @XmlElement(name = "event")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Events{" +
                "events=" + events +
                '}';
    }
}
