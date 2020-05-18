package com.example.demo.Dao;

import com.example.demo.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDao extends JpaRepository<Location, Integer> {
}
