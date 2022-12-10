package com.example.onlinecomplaintreporting_backend.dao;

import com.example.onlinecomplaintreporting_backend.model.Complaints;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface ComplaintDao extends CrudRepository<Complaints,Integer> {
    @Query(value = "SELECT c. `address`,c. `email`,c. `name`, c. `phno`,s.compalaint FROM `customer` c JOIN complaints s on s.userid=c.id",nativeQuery = true)
    List<Map<String,String>> Compalints();
}
