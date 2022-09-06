import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BasicSetupService } from '../services/basic-setup.service';

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
    this.stateSetup();
  }

  stateSetup() {
    //Temp, will be accessed from db later
    let states:string[] = ['Virginia', 'Delaware'];

    console.log("Setup");

    let statesDoc = document.getElementsByName('state');
    for (var i in states) {
      let option = document.createElement('option');
      option.text = states[i];
      option.value = i;
      statesDoc[0].appendChild(option);
    }

    let option = document.createElement('option');
    option.text = "Other";
    option.value = "other";
    statesDoc[0].appendChild(option);
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
    } else {
      let statesDoc = document.getElementsByName('city');
      statesDoc[0].innerHTML = "";
      let base = document.createElement('option');
      base.value = 'default';
      base.selected = true;
      base.disabled = true;
      base.text = "---";
      statesDoc[0].appendChild(base);

      //To Be replaced
      let states:string[];

      if (this.state == '0') {
        states = ["Williamsburg", "Richmond"];
      } else if (this.state = '1') {
        states = ["Rehoboth Beach", "Wilmington"];
      } else {
        states = [];
      }


      for (var i in states) {
        let option = document.createElement('option');
        option.text = states[i];
        option.value = i;
        statesDoc[0].appendChild(option);
      }

      let option = document.createElement('option');
      option.text = "Other";
      option.value = "other";
      statesDoc[0].appendChild(option);
        
    }
  }

  cityChange() {
    if(this.city === "" || this.city == "default" || this.city == "other") {
      this.error = "Unfortunately, we currently only provide serivce to the provided cities";
    }
  }

}
