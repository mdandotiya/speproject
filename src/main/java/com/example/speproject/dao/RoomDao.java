package com.example.speproject.dao;

import com.example.speproject.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomDao extends JpaRepository<Room,Integer> {

}
