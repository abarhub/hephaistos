import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ProjectModel} from "../model/project.model";

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  configUrl = 'api/projects';

  constructor(private http: HttpClient) { }

  getProjects():Observable<ProjectModel[]> {
    return this.http.get<ProjectModel[]>(this.configUrl);
  }
}
