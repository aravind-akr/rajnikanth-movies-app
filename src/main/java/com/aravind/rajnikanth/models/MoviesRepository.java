package com.aravind.rajnikanth.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MoviesRepository extends CrudRepository<MoviesModel, Integer> {

    MoviesModel findById(int id);

}
