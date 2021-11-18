package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeacherRepositoryDao extends CrudRepository<Teacher, Integer> {
        //public List<Teacher> findTeacherByNombreAndAndEdad(String name, int edad);
/*
    @Query(value = "Select * from nombre de table where nombre=:nombre and edad=:edad",nativeQuery = true)
    public List<Teacher> findTeacherByNombreAndAndEdadPorQueryNativa(String name, int edad);

    @Query(value = "Select * from nombre de clase t where t.nombre=:nombre and t.edad=:edad")
    public List<Teacher> findTeacherByNombreAndAndEdadPorJPQueryN(String name, int edad);

 */
    }