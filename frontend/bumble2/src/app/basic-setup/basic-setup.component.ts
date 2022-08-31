import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-basic-setup',
  templateUrl: './basic-setup.component.html',
  styleUrls: ['./basic-setup.component.scss']
})
export class BasicSetupComponent implements OnInit {

  fName = "";
  lName = "";
  state = "";
  city = "";
  gender = "";
  sexuality = "";
  error = "";

  constructor() { }

  ngOnInit(): void {
  }

  submit() {
    if (this.fName === "" ||
        this.lName === "" ||
        this.state === "" || 
        this.city === "" ||
        this.gender === "" ||
        this.sexuality === "") {
          this.error = "Please finish completing the form";
          return;
        }
  }

  stateChange() {
    if(this.state === "" || this.state == "default" || this.state == "other") {
      this.error = "Unfortunately, we currently only provide serivce to the provided regions";
    }
  }

  cityChange() {
    if(this.city === "" || this.city == "default" || this.city == "other") {
      this.error = "Unfortunately, we currently only provide serivce to the provided cities";
    }
  }

}
