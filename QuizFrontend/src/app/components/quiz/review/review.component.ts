import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Data } from 'src/app/services/Data.service';
import { Question } from 'src/models/Question';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {

  questions: Question[];

  constructor(private dataService: Data, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.params.subscribe(data =>{
      this.questions = this.dataService.storage;
      console.log(this.questions);
      
    });
  }

  checkOption(question:Question,correctAnswer:String){
    let keys = Object.keys(question.options);
    console.log(correctAnswer);
    console.log(keys[1]);
    switch(correctAnswer){
      case ("answerA"):
        console.log()
        return question.options[keys[1]];
      
      case ("answerB"):
        return question.options[keys[2]];

      case ("answerB"):
        return question.options[keys[3]];

      case ("answerB"):
        return question.options[keys[4]];
      
        default:
          return "";
    }

  }

}
