package com.example.demo.dao;

import com.example.demo.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptDao extends JpaRepository<Dept, Integer> {
}