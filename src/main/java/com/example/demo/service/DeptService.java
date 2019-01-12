package com.example.demo.service;


import com.example.demo.dao.DeptDao;
import com.example.demo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DeptService {
    @Autowired
    DeptDao deptDAO;

    public List<Dept> getAllUsers() {
        return this.deptDAO.findAll();
    }

    public Dept addUser(Dept user) {
        return this.deptDAO.save(user);

    }

    public List<Dept> allUsers(){
        List<Dept> users = new ArrayList<Dept>();
        for(Dept user: deptDAO.findAll()){
            users.add(user);
        }
        return users;
    }
    public void deleteMyUser(int id){
        deptDAO.deleteById(id);
    }
    public Dept editUser(int id) {
        Optional<Dept> userOptional = deptDAO.findById(id);
        if (userOptional.isPresent()) {
            Dept user = userOptional.get();
            return user;
        }
        return null;
    }
}
