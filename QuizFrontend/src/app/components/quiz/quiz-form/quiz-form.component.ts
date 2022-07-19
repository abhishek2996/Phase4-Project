import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Data } from 'src/app/services/Data.service';
import { GetDataService } from 'src/app/services/get-data.service';
import { Question } from 'src/models/Question';

@Component({
  selector: 'app-quiz-form',
  templateUrl: './quiz-form.component.html',
  styleUrls: ['./quiz-form.component.css']
})
export class QuizFormComponent implements OnInit {

  question: Question;


  checkedItems = {
    answerA: false,
    answerB: false,
    answerC: false,
    answerD: false,
    answerE: false,
    answerF: false,
  }

  constructor(private activatedRoute: ActivatedRoute, private service: GetDataService, private data:Data) { }

  ngOnInit(): void {
   
    this.activatedRoute.params.subscribe(data=>{
      this.question = this.data.storage;
   
      for(let item in this.checkedItems){
         this.checkedItems[item] = false;
      }
      
    })
    
  }

 checkNull(option){
   return option === null ? false: true;
 }

 chooseAnswer(event){
  this.checkedItems[event.target.name] = true;
  this.question.correctAnswer = event.target.value;

 }

}
