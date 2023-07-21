package com.springBoot.project.repository;

import com.springBoot.project.model.CountOfProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CountOfProductRepository extends JpaRepository<CountOfProduct, Long> {
}
