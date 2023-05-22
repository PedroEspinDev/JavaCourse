package com.example.testFootball.controller;

import com.example.testFootball.entity.Team;
import com.example.testFootball.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
public class TeamController {
    private final TeamService teamService;

    @PostMapping("/createTeam")
    public ResponseEntity<Team> createTeam(@Valid @RequestBody Team team){
        return new ResponseEntity<>(teamService.saveTeam(team), HttpStatus.OK);
    }
    @GetMapping("/getAllTeams")
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }
}
