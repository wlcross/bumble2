import { JsonPipe } from '@angular/common';
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

  constructor(private basicSetupService:BasicSetupService, private router:Router) { }

  ngOnInit(): void {
    this.stateSetup();
  }

  stateSetup() {
    let statesub = this.basicSetupService.getStates();
    let states:string[] = [];

    statesub.subscribe(
      e => {
          //console.log(e);
          let s = JSON.stringify(e);
          states = JSON.parse(s);
          //console.log(states);


          let statesDoc = document.getElementsByName('state');
          statesDoc[0].innerHTML = "";
          let base = document.createElement('option');
          base.value = 'default';
          base.selected = true;
          base.disabled = true;
          base.text = "---";
          statesDoc[0].appendChild(base);


          for (var i in states) {
            let option = document.createElement('option');
            option.text = states[i];
            option.value = states[i];
            statesDoc[0].appendChild(option);
          }

          let option = document.createElement('option');
          option.text = "Other";
          option.value = "other";
          statesDoc[0].appendChild(option);
      }
      );
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
    } else {
      alert("Sorry, form not done");
    }
  }

  stateChange() {
    if(this.state === "" || this.state == "default" || this.state == "other") {
      this.error = "Unfortunately, we currently only provide serivce to the provided regions";
    } else {
      let citiesDoc = document.getElementsByName('city');
      citiesDoc[0].innerHTML = "";
      let base = document.createElement('option');
      base.value = 'default';
      base.selected = true;
      base.disabled = true;
      base.text = "---";
      citiesDoc[0].appendChild(base);

      //To Be replaced
      let cities:string[];

      let citysub = this.basicSetupService.getCities(this.state);

      citysub.subscribe(
        e => {
            //console.log(e);
            let s = JSON.stringify(e);
            cities = JSON.parse(s);
            //console.log(cities);
  
  
            for (var i in cities) {

              //console.log(cities[i]);
              let jsonstring = JSON.stringify(cities[i]);
              let cityI = JSON.parse(jsonstring);
              let option = document.createElement('option');
              option.text = cityI.city;
              option.value = cityI.id;
              citiesDoc[0].appendChild(option);
            }
      
            let option = document.createElement('option');
            option.text = "Other";
            option.value = "other";
            citiesDoc[0].appendChild(option);
        }
        );

      // if (this.state == '0') {
      //   states = ["Williamsburg", "Richmond"];
      // } else if (this.state = '1') {
      //   states = ["Rehoboth Beach", "Wilmington"];
      // } else {
      //   states = [];
      // }

        
    }
  }

  cityChange() {
    if(this.city === "" || this.city == "default" || this.city == "other") {
      this.error = "Unfortunately, we currently only provide serivce to the provided cities";
    }
  }

}
