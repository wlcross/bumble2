import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  username ="";
  pass = "";

  constructor(private loginSerivce:LoginService, private router:Router) { }

  ngOnInit(): void {
  }

  login() {
    this.loginSerivce.attemptLogin(this.username, this.pass);
  }

  register() {
    this.router.navigate(['register']);
  }

}
