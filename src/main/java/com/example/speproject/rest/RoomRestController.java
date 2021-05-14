package com.example.speproject.rest;

import com.example.speproject.entity.Room;
import com.example.speproject.service.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RoomRestController {
    private static Logger logger = LoggerFactory.getLogger(RoomRestController.class);
    RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
 //   @CrossOrigin(origins = "*")
    @GetMapping("/room")
    public List<Room> getAll(){
        logger.info("[Number of Rooms] - "+roomService.findAll().size());
        return roomService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
 //   @CrossOrigin(origins = "*")
    @PostMapping(path="/room",consumes = "application/JSON")
    public Optional<Room> addRoom(@RequestBody Room room){
        room.setId(0);
        logger.info("[Room Type] - "+room.getType());
        return roomService.addRoom(room);
    }
}
