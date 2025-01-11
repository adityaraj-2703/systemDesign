package com.lld.sysdesign.bms.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "MOVIES")
public class Movie extends Auditable {
    private String name;
    private Integer duration;
    private Integer likes;
    Lock lock = new ReentrantLock();

    @OneToMany(mappedBy = "movie")
    private List<Show> shows = new ArrayList<>();

    public Integer upvote() {
        lock.lock();
        try {
            this.likes++;
        } finally {
            lock.unlock();
        }

        return this.likes;
    }

}
