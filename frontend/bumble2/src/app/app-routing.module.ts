import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BasicSetupComponent } from './basic-setup/basic-setup.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  {path: '', redirectTo: 'login', pathMatch: 'full'}, 
  {path: 'login', component: LoginComponent }, 
  {path: 'basic-setup', component: BasicSetupComponent }, 
  {path: 'register', component: RegisterComponent },
  {path: '**', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
