package com.vg.raiddataapi.service;

import com.vg.raiddataapi.exception.EntityNotFoundException;
import com.vg.raiddataapi.model.Skill;
import com.vg.raiddataapi.model.Champion;
import com.vg.raiddataapi.repository.ChampionRepository;
import com.vg.raiddataapi.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private ChampionRepository championRepository;

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public List<Skill> getSkillsByChampionId(Integer championId) throws EntityNotFoundException {
        if (!championRepository.existsById(championId)) {
            throw new EntityNotFoundException(Champion.class, "championId", championId.toString());
        }

        return skillRepository.findByChampionId(championId);
    }

    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public void deleteSkill(Integer id) {
        skillRepository.deleteById(id);
    }
}
