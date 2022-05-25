package com.cuc.hipertencion.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuc.hipertencion.models.Crud;

@Repository
public interface CrudRepository extends JpaRepository<Crud,Long>{

}
