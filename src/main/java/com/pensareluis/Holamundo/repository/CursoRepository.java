package com.pensareluis.Holamundo.repository;

import com.pensareluis.Holamundo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author Jorge Álvarez
 * @version 1.0 - 2018/03/23
 */
@Repository
public interface CursoRepository extends JpaRepository<Course, Integer>, Serializable {
}
