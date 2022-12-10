package com.example.onlinecomplaintreporting_backend.controller;

import com.example.onlinecomplaintreporting_backend.dao.ComplaintDao;
import com.example.onlinecomplaintreporting_backend.model.Complaints;
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
}
