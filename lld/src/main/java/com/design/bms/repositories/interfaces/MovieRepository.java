package com.lld.sysdesign.bms.repositories.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lld.sysdesign.bms.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByName(String movieName);

}
