import { Component, OnInit } from '@angular/core';

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

  constructor() { }

  ngOnInit(): void {
  }

  register() {
    console.log("Register");
    if (this.pass != this.confirmPass) {
      this.error = "Passwords do not match";
      return;
    }

    //Change user

    if (this.user == -1) {
      this.error = "Failed to register"
      return;
    }
  }

  cancel() {
    
  }
}
