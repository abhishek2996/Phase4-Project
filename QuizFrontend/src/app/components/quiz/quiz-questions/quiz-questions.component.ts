import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { GetDataService } from 'src/app/services/get-data.service';
import { Question } from 'src/models/Question';
import { Data } from 'src/app/services/Data.service';

@Component({
  selector: 'app-quiz-questions',
  templateUrl: './quiz-questions.component.html',
  styleUrls: ['./quiz-questions.component.css']
})
export class QuizQuestionsComponent implements OnInit {

  questions: Question[];
  id:number;
  i=0;


  constructor(private service:GetDataService, private activatedRoute: ActivatedRoute, private route: Router, private data: Data
    ) { }

  ngOnInit(): void {
    console.log(this.i);

    this.activatedRoute.params.subscribe(data=>{
      this.id = data['id'];
    })

    this.service.getQuestions(this.id).subscribe(data=>{
      this.questions = data;
      console.log(this.questions);
    })
  }

  handleQuestionClick(event, question:Question){
    this.data.storage = question;
    this.route.navigate(['question',question.id], {relativeTo: this.activatedRoute});

  }

  submitQuiz(){
    this.data.storage = this.questions;
    this.route.navigate(['results'],{relativeTo: this.activatedRoute});
  }

}
