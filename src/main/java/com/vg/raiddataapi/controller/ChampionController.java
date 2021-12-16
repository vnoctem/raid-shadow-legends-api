package com.vg.raiddataapi.controller;

import com.vg.raiddataapi.model.Skill;
import com.vg.raiddataapi.model.Champion;
import com.vg.raiddataapi.service.ChampionService;
import com.vg.raiddataapi.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/champions")
public class ChampionController {

    @Autowired
    private ChampionService championService;

    @Autowired
    private SkillService skillService;

    @GetMapping()
    public ResponseEntity<?> getAllChampions() {
        List<Champion> champions = championService.getAllChampions();
        return new ResponseEntity<>(champions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getChampionById(@PathVariable("id") Integer id) {
        Champion champion = championService.getChampionById(id);
        return new ResponseEntity<>(champion, HttpStatus.OK);
    }

    @GetMapping("/{id}/skills")
    public ResponseEntity<?> getChampionSkills(@PathVariable("id") Integer id) {
        List<Skill> skills = skillService.getSkillsByChampionId(id);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
}