package com.jw.xml.models;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *  This is a XML container class to store edits for XML marshalling in a single Event
 */
public class Edits {

    /**
     * element that is going to be marshaled in the xml
     */
    List<Edit> edits;

    public Edits() {
    }

    public Edits(List<Edit> edits) {
        this.edits = edits;
    }

    public List<Edit> getEdits() {
        return edits;
    }

    @XmlElement(name = "edit")
    public void setEdits(List<Edit> edits) {
        this.edits = edits;
    }

    @Override
    public String toString() {
        return "Edits{" +
                "edits=" + edits +
                '}';
    }
}
