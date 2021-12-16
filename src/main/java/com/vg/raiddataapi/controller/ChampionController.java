package com.vg.raiddataapi.controller;

import com.vg.raiddataapi.model.Skill;
import com.vg.raiddataapi.model.Champion;
import com.vg.raiddataapi.service.ChampionService;
import com.vg.raiddataapi.service.SkillService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/champions")
public class ChampionController {

    @Autowired
    private ChampionService championService;

    @Autowired
    private SkillService skillService;

    @GetMapping()
    @Operation(summary = "Get all champions",
            responses = {
                @ApiResponse(description = "Returns a list of champions",
                    content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Champion.class)))
            })
    public ResponseEntity<?> getAllChampions() {
        List<Champion> champions = championService.getAllChampions();
        return new ResponseEntity<>(champions, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @Operation(summary = "Get champion by id",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns a champion",
                            content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Champion.class))),
                    @ApiResponse(responseCode = "404",
                            description = "Entity not found")
            })
    public ResponseEntity<?> getChampionById(@PathVariable("id") Integer id) {
        Champion champion = championService.getChampionById(id);
        return new ResponseEntity<>(champion, HttpStatus.OK);
    }

    @GetMapping("/{id}/skills")
    @Operation(summary = "Get skills of a champion",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns a list of skills",
                            content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Skill.class))),
                    @ApiResponse(responseCode = "404",
                            description = "Entity not found")
            })
    public ResponseEntity<?> getChampionSkills(@PathVariable("id") Integer id) {
        List<Skill> skills = skillService.getSkillsByChampionId(id);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
}