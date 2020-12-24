package com.example.erp.service;

import com.example.erp.bean.Bills;
import com.example.erp.bean.Students;
import com.example.erp.dao.StudentDao;
import com.example.erp.dao.implementation.StudentDaoImpl;

import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDaoImpl();
    public Students verifyEmail(Students student){
        return studentDao.emailVerify(student);
    }

    public List<Students> getStudents (){
        return studentDao.getStudents();
    }

    public boolean registerStudent(Students student){
        return studentDao.registerStudent(student);
    }

    public List<Bills> getBills() { return  studentDao.getBills();}

    //public List<Bills> getPaidBills() { return  studentDao.GetPaidBills();}

}
