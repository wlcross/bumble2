import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegisterService } from '../services/register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  username = "";
  pass ="";
  confirmPass ="";
  error = "";
  user = -1;

  constructor(private registerService:RegisterService, private router:Router) { }

  ngOnInit(): void {
  }

  register() {
    console.log("Register");
    if (this.pass != this.confirmPass) {
      this.error = "Passwords do not match";
      return;
    }

    //Change user
    this.user = this.registerService.attemptRegister(this.username, this.pass);

    if (this.user == -1) {
      this.error = "Failed to register"
      return;
    }

    sessionStorage.setItem("User", String(this.user));

    this.router.navigate(['basic-setup']);
  }

  cancel() {
    this.router.navigate(['login']);
  }
}
