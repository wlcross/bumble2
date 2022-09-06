import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
  })
export class BasicSetupService {

    constructor(private http:HttpClient) { }

    basicSetup() {
        
    }

    getStates() {
        let url = "http://localhost:8087/states";
        let statesub = (this.http.get(url));
        return statesub;
    }

    getCities(state:string) {
      let url = "http://localhost:8087/cities/" + state;
      let citysub = (this.http.get(url));
      return citysub;
    }
}