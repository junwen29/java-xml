package com.jw.xml.models;

import com.jw.xml.adapters.LocalDateTimeAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

public class DateRange {

    private LocalDateTime fromWhen;

    private LocalDateTime toWhen;

    public DateRange(LocalDateTime fromWhen, LocalDateTime toWhen) {
        this.fromWhen = fromWhen;
        this.toWhen = toWhen;
    }

    public LocalDateTime getFromWhen() {
        return fromWhen;
    }

    @XmlJavaTypeAdapter( LocalDateTimeAdapter.class )
    public void setFromWhen(LocalDateTime fromWhen) {
        this.fromWhen = fromWhen;
    }

    public LocalDateTime getToWhen() {
        return toWhen;
    }

    @XmlJavaTypeAdapter( LocalDateTimeAdapter.class )
    public void setToWhen(LocalDateTime toWhen) {
        this.toWhen = toWhen;
    }

    @Override
    public String toString() {
        return "DateRange{" +
                "fromWhen=" + fromWhen +
                ", toWhen=" + toWhen +
                '}';
    }
}
