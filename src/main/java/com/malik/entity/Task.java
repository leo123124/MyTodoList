package com.malik.entity;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Vasyl on 21/04/2016.
 */

@Entity
@Table(name = "task")
public class Task implements Serializable {
    private static long serialVersionUID = 123456789L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "description", nullable = false)
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name="createDate", updatable = false)
    private Date addDate = new Date();

    @Column(name = "isDone", nullable = false)
    private byte isDone;

    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public byte getIsDone() {
        return isDone;
    }

    public void setIsDone(byte done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", addDate=" + addDate +
                ", isDone=" + isDone +
                '}';
    }
}
