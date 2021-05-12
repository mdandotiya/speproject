package com.example.speproject;

import com.example.speproject.dao.CleaningStaffDao;
import com.example.speproject.entity.CleaningStaff;
import com.example.speproject.entity.ComplaintStaff;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CleaningStaffTest {

    @Autowired
    CleaningStaffDao cleaningStaffDao;

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
}
