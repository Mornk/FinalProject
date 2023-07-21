package com.springBoot.project.repository;

import com.springBoot.project.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CityRepository extends JpaRepository<City, Long> {
}
