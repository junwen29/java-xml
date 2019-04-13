package com.jw.xml.models;

import com.jw.xml.adapters.LocalDateTimeAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

@XmlType(propOrder = {"name", "creator", "createdTimestamp", "source", "dateRange", "country", "numView", "tags", "lastModifiedBy", "lastModifiedTimestamp", "description", "locations", "edits"})
public class Event {

    private String name;

    private String description;

    private String creator;

    private String lastModifiedBy;

    private String source;

    private Tags tags;

    private Locations locations; // note where the locations need to be contained within the country

    private Edits edits;

    private LocalDateTime createdTimestamp;

    private LocalDateTime lastModifiedTimestamp;

    private Country country; // where the event happens in

    private DateRange dateRange; // the event period

    private int numView; // number of views on this event

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    @XmlElement
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    @XmlElement
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getSource() {
        return source;
    }

    @XmlElement
    public void setSource(String source) {
        this.source = source;
    }


    public LocalDateTime getCreatedTimestamp() {
        return createdTimestamp;
    }

    @XmlElement
    @XmlJavaTypeAdapter( LocalDateTimeAdapter.class )
    public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public LocalDateTime getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }

    @XmlElement
    @XmlJavaTypeAdapter( LocalDateTimeAdapter.class )
    public void setLastModifiedTimestamp(LocalDateTime lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    public Country getCountry() {
        return country;
    }

    @XmlElement
    public void setCountry(Country country) {
        this.country = country;
    }

    public DateRange getDateRange() {
        return dateRange;
    }

    @XmlElement(type = DateRange.class)
    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public int getNumView() {
        return numView;
    }

    @XmlElement
    public void setNumView(int numView) {
        this.numView = numView;
    }

    public Tags getTags() {
        return tags;
    }

    @XmlElement(type = Tags.class)
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Locations getLocations() {
        return locations;
    }

    @XmlElement(type = Locations.class)
    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    public Edits getEdits() {
        return edits;
    }

    @XmlElement(type = Edits.class)
    public void setEdits(Edits edits) {
        this.edits = edits;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creator='" + creator + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", source='" + source + '\'' +
                ", tags=" + tags +
                ", locations=" + locations +
                ", edits=" + edits +
                ", createdTimestamp=" + createdTimestamp +
                ", lastModifiedTimestamp=" + lastModifiedTimestamp +
                ", country=" + country +
                ", dateRange=" + dateRange +
                ", numView=" + numView +
                '}';
    }
}
