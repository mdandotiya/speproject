package com.example.speproject.service;

import com.example.speproject.dao.RoomDao;
import com.example.speproject.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService{

    RoomDao roomDao;

    @Autowired
    public RoomServiceImpl(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    @Override
    public List<Room> findAll() {
        return roomDao.findAll();
    }

    @Override
    public Optional<Room> findRoom(int id) {
        return roomDao.findById(id);
    }

    @Override
    public void deleteRoom(int id) {
        roomDao.deleteById(id);
    }

    @Override
    public Optional<Room> addRoom(Room room) {
        roomDao.save(room);
        return null;
    }
}
