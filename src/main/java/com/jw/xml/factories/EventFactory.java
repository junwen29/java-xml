package com.jw.xml.factories;


import com.jw.xml.models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventFactory {

    public List<Event> createEvents(int num){
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            Event event = new Event();

            Country country = new Country("Singapore", 1);
            event.setCountry(country);

            event.setCreatedTimestamp(LocalDateTime.now());

            event.setCreator("System");

            LocalDateTime fromWhen = LocalDateTime.now().plusDays(2);
            LocalDateTime toWhen = fromWhen.plusDays(3);

            DateRange dateRange = new DateRange(fromWhen, toWhen);
            event.setDateRange(dateRange);

            event.setDescription("Techweek curates exciting programming that allows a global spotlight to shine on each ecosystem and its leaders. Past speakers include Rahm Emanuel, Travis Kalanick (CEO, Uber), Craig Newmark (Founder, Craigslist), Barney Harford (CEO, Orbitz), and Chuck Templeton (Founder, OpenTable). The Techweek expo has gathered more than 200 sponsors, including companies such as Google, Groupon, Microsoft, Motorola, Redbox, Uber, and Wordpress.");

            List<Edit> editList = new ArrayList<>();
            Edit edit1 = new Edit("Albert", LocalDateTime.now().plusHours(2));
            Edit edit2 = new Edit("Bob", LocalDateTime.now().plusHours(3));
            Edit edit3 = new Edit("Charles", LocalDateTime.now().plusHours(4));

            editList.add(edit1);
            editList.add(edit2);
            editList.add(edit3);

            Edits edits = new Edits(editList);

            event.setEdits(edits);

            event.setLastModifiedBy(edit3.getAuthor());
            event.setLastModifiedTimestamp(edit3.getTimestamp());

            event.setName("Techweek curates exciting programming that allows a global spotlight to shine on each ecosystem and its leaders.");

            List<Location> locationList  = new ArrayList<>();
            Location location1 = new Location("Millennium Park", 41.882702, -87.619392);
            Location location2 = new Location("Willis Tower", 41.8789, -87.6358);
            Location location3 = new Location("Navy Pier", 41.892654, -87.610168);

            locationList.add(location1);
            locationList.add(location2);
            locationList.add(location3);

            Locations locations = new Locations(locationList);

            event.setLocations(locations);

            event.setNumView(1000);

            event.setSource("GDELT");

            List<String> tagList = new ArrayList<>();
            tagList.add("Chicago");
            tagList.add("Technology");
            tagList.add("USA");

            Tags tags = new Tags(tagList);

            event.setTags(tags);

            events.add(event);
        }

        System.out.println(events.toString());

        return events;
    }
}
