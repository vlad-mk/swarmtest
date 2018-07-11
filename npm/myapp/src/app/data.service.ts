import { Injectable } from '@angular/core';
import { HttpClient} from "@angular/common/http";
import { environment } from '../environments/environment';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getUsers() {
    return this.http.get( API_URL  + '/users')
  }

  getUser(userId) {
    return this.http.get(API_URL  + '/users/'+userId)
  }

  getPosts() {
    return this.http.get(API_URL  + '/posts')
  }
}
