package com.jw.xml.models;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *  This is a XML container class to store tags for XML marshalling in a single Event
 */
public class Tags {

    /**
     * element that is going to be marshaled in the xml
     */
    List<String> tags;

    public Tags() {
    }

    public Tags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }

    @XmlElement(name = "tag")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "tags=" + tags +
                '}';
    }
}
