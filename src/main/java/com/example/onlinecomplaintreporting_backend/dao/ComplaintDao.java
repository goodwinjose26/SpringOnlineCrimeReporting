package com.example.onlinecomplaintreporting_backend.dao;

import com.example.onlinecomplaintreporting_backend.model.Complaints;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintDao extends CrudRepository<Complaints,Integer> {
}
