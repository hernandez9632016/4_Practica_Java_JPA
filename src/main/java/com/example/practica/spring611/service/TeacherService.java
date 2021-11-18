package com.example.practica.spring611.service;

import com.example.practica.spring611.entity.Student;
import com.example.practica.spring611.entity.Teacher;
import com.example.practica.spring611.repository.StudentRepository;
import com.example.practica.spring611.repository.TeacherRepository;
import com.example.practica.spring611.repository.TeacherRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    //TeacherRepositoryDao teacherRepositoryDao;
    TeacherRepository teacherRepository;

    public void AddTeacher(Teacher teacher) {

        teacherRepository.creacionMaestros(teacher);

    }

    public List<Teacher> getLista() {
        return null;
    }

    public Teacher getTeacher(String name) {
        return null;
    }


    //public List<Teacher> getTeacherByNameAndAge(String name, int edad) {
      //  return teacherRepositoryDao.findTeacherByNombreAndAndEdad(name, edad);
    //}
}