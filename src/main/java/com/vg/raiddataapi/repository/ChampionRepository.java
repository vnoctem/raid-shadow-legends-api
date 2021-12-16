package com.vg.raiddataapi.repository;

import com.vg.raiddataapi.model.Champion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionRepository extends JpaRepository<Champion, Integer> {
}