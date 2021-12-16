package com.vg.raiddataapi.controller;

import com.vg.raiddataapi.model.Champion;
import com.vg.raiddataapi.model.Skill;
import com.vg.raiddataapi.service.SkillService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping()
    @Operation(summary = "Get all skills",
            responses = {
                    @ApiResponse(description = "Returns a list of skills",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Skill.class)))
            })
    public ResponseEntity<?> getAllSkills() {
        List<Skill> skills = skillService.getAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
}