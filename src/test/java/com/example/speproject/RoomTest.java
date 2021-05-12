package com.example.speproject;

import com.example.speproject.dao.RoomDao;
import com.example.speproject.entity.Room;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RoomTest {

    @Autowired
    private RoomDao roomDao;

    @Test
    public void should_find_All_Rooms(){
        List<Room> rooms = roomDao.findAll();
        int noOfRooms = 4;
        Assert.assertEquals(noOfRooms,rooms.size());
    }

    @Test
    public void deleteTest(){
        Room room = new Room(105,"AC","No");
        room.setId(5);
        roomDao.save(room);
        roomDao.delete(room);
        Assert.assertFalse(roomDao.findById(5).isPresent());
    }

}
