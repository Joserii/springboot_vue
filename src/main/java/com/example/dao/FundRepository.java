package com.example.dao;

import com.example.entity.Fund;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FundRepository extends JpaRepository<Fund, Long> {
    @Query(value = "select * from `fund` where `f_name` like %?1%", nativeQuery = true)
    Page<Fund> findNameLike(String name, PageRequest pageRequest);
}
