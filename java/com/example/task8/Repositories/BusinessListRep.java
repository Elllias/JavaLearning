package com.example.task8.Repositories;

import com.example.task8.Models.BusinessList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessListRep extends JpaRepository<BusinessList, Long> {
}
