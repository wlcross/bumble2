import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BasicSetupComponent } from './basic-setup/basic-setup.component';
import { LoginComponent } from './login/login.component';
import { QuizComponent } from './quiz/quiz.component';
import { RegisterComponent } from './register/register.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserProfileComponent } from './user-profile/user-profile.component';

const routes: Routes = [
  {path: '', redirectTo: 'login', pathMatch: 'full'}, 
  {path: 'login', component: LoginComponent }, 
  {path: 'basic-setup', component: BasicSetupComponent }, 
  {path: 'register', component: RegisterComponent },
  {path: 'quiz', component: QuizComponent },
  {path: 'user-list', component: UserListComponent },
  {path: 'user-profile', component: UserProfileComponent },
  {path: '**', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
