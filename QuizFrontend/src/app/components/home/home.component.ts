import { Component, ElementRef, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { GetDataService } from 'src/app/services/get-data.service';
import { Category } from 'src/models/Category';
import { Question } from 'src/models/Question';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

 
  categories: Category[];


  constructor(private service: GetDataService, private route:Router) { }

  ngOnInit(): void {
    this.service.getCategories().subscribe(data=> {
      this.categories = data;
      console.log(this.categories);
    });
  }

  handleCardClick(event, id:number){

    console.log(event.target);
    this.route.navigate(['/quiz',id]);
  }

}
