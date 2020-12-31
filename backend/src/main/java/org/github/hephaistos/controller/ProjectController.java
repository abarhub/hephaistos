package org.github.hephaistos.controller;

import org.github.hephaistos.domain.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/projects")
@RestController()
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {

    @GetMapping(value = "")
    public ResponseEntity<List<Project>> getProjects() {
        Project project=new Project();
        project.setId(1L);
        project.setName("nom1");

        return ResponseEntity.ok(List.of(project));
    }

}
