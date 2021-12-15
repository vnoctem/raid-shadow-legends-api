package com.vg.raiddataapi.service;

import com.vg.raiddataapi.model.champion.Champion;
import com.vg.raiddataapi.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ChampionService {

    @Autowired
    private ChampionRepository championRepository;

    public List<Champion> getAllChampions() {
        return championRepository.findAll();
    }

    public Champion getChampionById(int id) {
        return championRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Champion saveChampion(Champion champion) {
        return championRepository.save(champion);
    }

    public void deleteChampion(int id) {
        championRepository.deleteById(id);
    }
}