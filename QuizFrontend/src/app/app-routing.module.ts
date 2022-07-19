import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { QuizFormComponent } from './components/quiz/quiz-form/quiz-form.component';
import { QuizQuestionsComponent } from './components/quiz/quiz-questions/quiz-questions.component';
import { QuizResultComponent } from './components/quiz/quiz-result/quiz-result.component';
import { QuizComponent } from './components/quiz/quiz.component';
import { ReviewComponent } from './components/quiz/review/review.component';


const routes: Routes = [
  {path:"", component: HomeComponent},
  {path:"quiz/:id", component:QuizComponent,
   children:[
    {path:"",component:QuizQuestionsComponent, children:[
      {path:"question/:id", component:QuizFormComponent}
    ]},
    {path:"results", component:QuizResultComponent, children:[
      {path:"review", component:ReviewComponent}
    ]}
  ]
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
