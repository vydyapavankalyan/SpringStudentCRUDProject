package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.Entity.Studentpk;

@Repository
public interface StudentRepo extends JpaRepository<Studentpk, Integer> {

}
