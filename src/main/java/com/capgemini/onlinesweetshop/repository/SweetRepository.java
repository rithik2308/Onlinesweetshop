package com.capgemini.onlinesweetshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinesweetshop.entity.Sweet;

@Repository
public interface SweetRepository extends JpaRepository<Sweet, Long> {
    
}
