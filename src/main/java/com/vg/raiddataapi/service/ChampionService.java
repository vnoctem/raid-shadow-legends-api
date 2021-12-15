package com.vg.raiddataapi.service;

import com.vg.raiddataapi.exception.EntityNotFoundException;
import com.vg.raiddataapi.model.champion.Champion;
import com.vg.raiddataapi.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionService {

    @Autowired
    private ChampionRepository championRepository;

    public List<Champion> getAllChampions() {
        return championRepository.findAll();
    }

    public Champion getChampionById(Integer id) throws EntityNotFoundException{
        return championRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Champion.class, "id", id.toString()));
    }

    public Champion saveChampion(Champion champion) {
        return championRepository.save(champion);
    }

    public void deleteChampion(Integer id) {
        championRepository.deleteById(id);
    }
}