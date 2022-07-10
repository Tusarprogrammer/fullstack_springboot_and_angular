import { Injectable } from '@angular/core';
 
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { map, catchError} from 'rxjs/operators';
@Injectable()
export class EmployeeService {
baseURL: string = "http://localhost:8080/api/";
constructor(private http: HttpClient) {
}

getEmployees(): Observable<any> {
    return this.http.get(this.baseURL + 'data')
  }

  getRepos(userName: string): Observable<any> {
    return this.http.get(this.baseURL + 'users/' + userName + '/repos')
  }

  getUsers(): Observable<any> {
    return this.http.get(this.baseURL + 'users')
  }
  
}