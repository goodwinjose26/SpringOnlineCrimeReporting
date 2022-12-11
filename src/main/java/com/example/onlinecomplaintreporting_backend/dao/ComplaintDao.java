package com.example.onlinecomplaintreporting_backend.dao;

import com.example.onlinecomplaintreporting_backend.model.Complaints;
import com.example.onlinecomplaintreporting_backend.model.Customers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ComplaintDao extends CrudRepository<Complaints,Integer> {
    @Query(value = "SELECT c. `address`,c. `email`,c. `name`, c. `phno`,s.compalaint FROM `customer` c JOIN complaints s on s.userid=c.id",nativeQuery = true)
    List<Map<String,String>> Compalints();

    @Query(value = "SELECT `compalaint` FROM `complaints` WHERE `userid`=:id",nativeQuery = true)
    List<Map<String,String>> complaintview(@Param("id") Integer id);


}
