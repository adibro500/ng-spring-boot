import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class LinkService {

  constructor(private http: HttpClient) { }

  getIndexPage() {
    return this.http.get('/api/greet')
      .pipe(
        catchError(err => {
         throw new Error(err);
      })
      );

  }

}
