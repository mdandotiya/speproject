package com.example.speproject;

import com.example.speproject.dao.*;
import com.example.speproject.entity.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SPETest {

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private CleaningStaffDao cleaningStaffDao;

    @Autowired
    private ChefDao chefDao;

    @Autowired
    private FoodDao foodDao;

    @Autowired
    private AttendentDao attendentDao;

    @Autowired
    private ComplaintsDao complaintsDao;


    @Test
    public void should_find_All_Rooms(){
        List<Room> rooms = roomDao.findAll();
        int noOfRooms = 4;
        Assert.assertEquals(noOfRooms,rooms.size());
    }

    @Test
    public void deleteTest(){
        Room room = new Room(105,"AC","No");
        roomDao.save(room);
        int id=0;
        List<Room> rooms = roomDao.findAll();
        for(int i=0;i<rooms.size();i++){
            if(rooms.get(i).getRoomid() == room.getRoomid()){
                id = rooms.get(i).getId();
                roomDao.deleteById(rooms.get(i).getId());
                break;
            }
        }
        Assert.assertFalse(roomDao.findById(id).isPresent());
    }

    @Test
    public void testAllStaff(){
        List<CleaningStaff> cleaningStaffList = cleaningStaffDao.findAll();
        int noOfStaff = 3;
        Assert.assertEquals(noOfStaff,cleaningStaffList.size());
    }

    @Test
    public void deleteStaffTest(){
        CleaningStaff cleaningStaff = new CleaningStaff("4th","Surendra Kumar","TTS");
        cleaningStaffDao.save(cleaningStaff);
        int id = 0;
        List<CleaningStaff> cleaningStaffs = cleaningStaffDao.findAll();
        for(int i=0;i<cleaningStaffs.size();i++) {
            if (cleaningStaffs.get(i).getId() == cleaningStaff.getId()) {
                id = cleaningStaffs.get(i).getId();
                cleaningStaffDao.deleteById(id);
                break;
            }
        }
        Assert.assertFalse(cleaningStaffDao.findById(id).isPresent());
    }

    @Test
    public void saveChefTest(){
        List<Food> foods = foodDao.findAll();
        Chef chef = new Chef("Pavan Kumar",foods.get(0));
        chefDao.save(chef);
        List<Chef> chefs = chefDao.findAll();
        for(int i=0;i<chefs.size();i++){
            if(chefs.get(i).getName()==chef.getName()){
                chef.setId(chefs.get(i).getId());
            }
        }
        Assert.assertTrue(chefDao.findById(chef.getId()).isPresent());
    }

    @Test
    public void deleteChefTest(){
        List<Food> foods = foodDao.findAll();
        Chef chef = new Chef("Sundar Lal",foods.get(0));
        chefDao.save(chef);
        List<Chef> chefs = chefDao.findAll();
        for(int i=0;i<chefs.size();i++){
            if(chefs.get(i).getName()==chef.getName()){
                chef.setId(chefs.get(i).getId());
            }
        }
        chefDao.deleteById(chef.getId());
        Assert.assertFalse(chefDao.findById(chef.getId()).isPresent());
    }


    @Test
    public void findAttendentTest(){
        List<Attendent> attendentList = attendentDao.findAll();
        Assert.assertTrue(attendentDao.findById(attendentList.get(0).getId()).isPresent());
    }

    @Test
    public void deleteAttendentTest(){
        List<Attendent> attendentList = attendentDao.findAll();
        attendentDao.deleteById(attendentList.get(0).getId());
        Assert.assertFalse(attendentDao.findById(attendentList.get(0).getId()).isPresent());
    }

    @Test
    public void updateComplaintTest(){
        Optional<Complaints> complaints = complaintsDao.findById(1);
        Complaints complaints1 = complaints.get();
        complaints1.setDetail("Internet of Third Floor not working");
        complaintsDao.save(complaints1);
        Assert.assertEquals(complaintsDao.findById(1).get(),complaints1);
    }

    @Test
    public void deleteComplaintTest(){
        Complaints complaints = new Complaints("Third floor TV Not Working",true);
        complaintsDao.save(complaints);
        List<Complaints> complaintsList = new ArrayList<>();
        int id =0;
        for(int i=0;i<complaintsList.size();i++){
            if(complaintsList.get(i).getDetail()==complaints.getDetail()){
                id = complaintsList.get(i).getId();
            }
        }
        Assert.assertFalse(complaintsDao.findById(id).isPresent());
    }

}
