package com.example.onlinecomplaintreporting_backend.controller;

import com.example.onlinecomplaintreporting_backend.dao.ComplaintDao;
import com.example.onlinecomplaintreporting_backend.model.Complaints;
import com.example.onlinecomplaintreporting_backend.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Patch;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ComplaintController {
    @Autowired
    ComplaintDao dao;
@CrossOrigin(origins = "*")
    @PostMapping(path ="/addcomplaint",consumes = "application/json",produces = "application/json")
public HashMap<String,String> addcomplaint(@RequestBody Complaints c)
    {
        HashMap<String,String> map=new HashMap<>();
        dao.save(c);
        map.put("status","success");
        return map;
    }


    @CrossOrigin(origins = "*")
   @GetMapping(path = "/viewallcomplaint")
    public List<Map<String,String>> viewall()
    {
        return (List<Map<String,String>>) dao.Compalints();
    }



    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewmycomplaint",consumes = "application/json",produces = "application/json")
    public List<Map<String,String>> complaintview(@RequestBody Complaints c)
    {
        String id=String.valueOf(c.getUserid());
        System.out.println(id);
        return (List<Map<String,String>>) dao.complaintview(c.getUserid());

    }






}
