package com.jw.xml.models;

import com.jw.xml.adapters.LocalDateTimeAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

public class Edit {

    private String author;

    private LocalDateTime timestamp;

    public Edit(String author, LocalDateTime timestamp) {
        this.author = author;
        this.timestamp = timestamp;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @XmlJavaTypeAdapter( LocalDateTimeAdapter.class )
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Edit{" +
                "author='" + author + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
