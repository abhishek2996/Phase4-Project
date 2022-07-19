import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Category } from 'src/models/Category';
import { Question } from 'src/models/Question';

@Injectable({
  providedIn: 'root'
})
export class GetDataService {

  data:Question;

  baseUrl = 'http://localhost:8080/api/';

  constructor(private http: HttpClient) { }

  getQuestions(id:number): Observable<Question[]> {
    let url = this.baseUrl+'questions/'+id;
    return this.http.get(url).pipe(
      map( (response:Question[])=>  {
        // console.log(response);
        return response;
      })
    );
  }

  getCategories(): Observable<Category[]>{
    let url = this.baseUrl+'categories';
    return this.http.get(url).pipe(
      map((response:Category[])=> response)
    );
  }
}
