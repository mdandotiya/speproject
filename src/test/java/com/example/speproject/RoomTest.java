package com.example.speproject;

import com.example.speproject.dao.RoomDao;
import com.example.speproject.entity.Room;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RoomTest.class)
public class RoomTest {

    private RoomDao roomDao;

    @Test
    public void testSaveRoom(){
        Room room = new Room(101,"AC","No");
        room.setId(15);
        roomDao.save(room);
        roomDao.findById(15).map(newRoom ->{
            Assert.assertEquals(101,newRoom.getRoomid());
            return true;
        });
    }

    @Test
    public void should_find_All_Rooms(){
        List<Room> rooms = roomDao.findAll();
        int noOfRooms = 4;
        Assert.assertEquals(noOfRooms,rooms.size());
    }

    @Test
    public void testDeleteRoom(){
        Room room = new Room(202,"AC","No");
        room.setId(16);
        roomDao.save(room);
        roomDao.deleteById(16);
        Assert.assertNotNull(roomDao.findById(16));
    }
}
