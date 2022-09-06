import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
  })
export class RegisterService {

    constructor(private http:HttpClient) { }

    attemptRegister(username:String, pass:String) {
        let url = "http://localhost:8087/createAccount";
        console.log("Registration attempted");
        return 1;
    }
}