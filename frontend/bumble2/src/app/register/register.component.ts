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

  constructor() { }

  ngOnInit(): void {
  }

  register() {

  }
}
