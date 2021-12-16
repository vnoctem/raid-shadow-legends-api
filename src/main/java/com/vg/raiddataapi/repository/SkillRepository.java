package com.vg.raiddataapi.repository;

import com.vg.raiddataapi.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

    List<Skill> findByChampionId(Integer championId);

}
