package com.peusoft.timetracker.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * Describes a time event.
 *
 * @author Yauheni Prykhodzka
 */
@Entity
public class TimeEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Timestamp begin;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp end;

    /**
     * Default constrcutor.
     */
    public TimeEvent() {
        // empty
    }

    /**
     * Constrcutor.
     * @param begin event begin
     * @param end event end
     */
    public TimeEvent(Timestamp begin, Timestamp end) {
        this.begin = begin;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getBegin() {
        return begin;
    }

    public void setBegin(Timestamp begin) {
        this.begin = begin;
    }

    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }
}
