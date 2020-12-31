import {Component, OnInit} from '@angular/core';
import {ProjectModel} from "./model/project.model";
import {ProjectService} from "./services/project.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'frontend';
  listProjects: ProjectModel[] = [];

  constructor(private projectService: ProjectService) {
  }

  ngOnInit(): void {

    this.projectService.getProjects().subscribe((data: ProjectModel[]) => {
      console.log("data", data);
      this.listProjects = data;
    }, error => {
      console.error("Erreur", error);
    });

  }


}
