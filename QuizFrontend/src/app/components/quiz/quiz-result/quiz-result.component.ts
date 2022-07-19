import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Data } from 'src/app/services/Data.service';
import { Question } from 'src/models/Question';

@Component({
  selector: 'app-quiz-result',
  templateUrl: './quiz-result.component.html',
  styleUrls: ['./quiz-result.component.css']
})
export class QuizResultComponent implements OnInit {

  questions: Question[];
  score:number;
  totalQuestions:number;
  correctAnswers = 0;
  grade: String;
  final:string;

  constructor(private route: Router, private activatedRoute: ActivatedRoute, private dataService: Data) { }

  ngOnInit(): void {
    this.activatedRoute.params.subscribe((data:Question[])=>{
      this.questions = this.dataService.storage;
      this.totalQuestions = this.questions.length;
      this.calculateResult(this.questions)
    })
  }

  handleReviewClick(){
    this.dataService.storage = this.questions;
    this.route.navigate(['review'],{relativeTo: this.activatedRoute});
    
  }


  calculateResult(questions:Question[]){
    let correctAnswer = "";
    for(let question of questions){
      for(let answer in question.correctAnswerId){
        if(question.correctAnswerId[answer] == true){
          correctAnswer = answer;
        }
      }
      if(question.correctAnswer == correctAnswer){
        this.correctAnswers++;
      }
    }

     this.score = (this.correctAnswers/this.totalQuestions)*100;

     if(this.score <= 30){
      this.grade = "F";
     }else if(this.score <= 50){
      this.grade = "D";
     }else if(this.score <= 70){
      this.grade = "B";
     }else{
      this.grade = "A";
     }

     if(this.grade === "F"){
      this.final = "FAIL";
     }else{
      this.final = "PASS";
     }
     
  }

}
