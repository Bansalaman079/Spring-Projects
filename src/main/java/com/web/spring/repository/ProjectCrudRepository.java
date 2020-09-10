package com.web.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.model.Project;
@Repository
public interface ProjectCrudRepository extends CrudRepository<Project, Integer> {

}
