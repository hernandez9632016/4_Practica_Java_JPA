package com.example.practica.spring611.controller;

import com.example.practica.spring611.entity.Teacher;
import com.example.practica.spring611.entity.Teacher2;
import com.example.practica.spring611.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService serviceteacher;


    //Creacion del maestro
    @PostMapping("/agregarteacher")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
        System.out.println("Se hizo la solicitud");
        serviceteacher.AddTeacher(teacher);
        return ResponseEntity.ok(teacher);
    }


    @GetMapping("/teacher/{pornombre}/{nombrevariable}")
    public Teacher getTeacherByName(@PathVariable("nombrevariable") String nombre) {
        return serviceteacher.getTeacher(nombre);
    }

    @GetMapping("/teacher2/{edad}")
    public List<Teacher2> getTeacherByName2(@PathVariable("edad") Integer id) {
        return serviceteacher.getTeacher2(id);
    }

    @GetMapping("/teacher3/{edad}")
    public List<String> getTeacherByName3(@PathVariable("edad") Integer id) {

        return serviceteacher.getTeacher3(id);
    }


}

