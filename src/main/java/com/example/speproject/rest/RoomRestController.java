package com.example.speproject.rest;

import com.example.speproject.entity.Room;
import com.example.speproject.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RoomRestController {

    RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/room")
    public List<Room> getAll(){
        return roomService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path="/room",consumes = "application/JSON")
    public Optional<Room> addRoom(@RequestBody Room room){
        room.setId(0);
        return roomService.addRoom(room);
    }
}
