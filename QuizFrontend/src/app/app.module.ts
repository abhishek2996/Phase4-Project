import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { QuizComponent } from './components/quiz/quiz.component';
import { QuizFormComponent } from './components/quiz/quiz-form/quiz-form.component';
import {HttpClientModule} from '@angular/common/http';
import { QuizQuestionsComponent } from './components/quiz/quiz-questions/quiz-questions.component';
import { QuizResultComponent } from './components/quiz/quiz-result/quiz-result.component';
import { ReviewComponent } from './components/quiz/review/review.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    QuizComponent,
    QuizFormComponent,
    QuizQuestionsComponent,
    QuizResultComponent,
    ReviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
