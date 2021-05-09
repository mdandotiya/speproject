package com.example.speproject.service;

import com.example.speproject.entity.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    public List<Room> findAll();
    public Optional<Room> findRoom(int id);
    public void deleteRoom(int id);
    public Optional<Room> addRoom(Room room);

}
