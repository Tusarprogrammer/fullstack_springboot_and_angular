import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './app.service'
import { FormGroup, FormControl, Validators } from '@angular/forms';

export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H'},
  {position: 2, name: 'Helium', weight: 4.0026, symbol: 'He'},
  {position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li'},
  {position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be'},
  {position: 5, name: 'Boron', weight: 10.811, symbol: 'B'},
  {position: 6, name: 'Carbon', weight: 12.0107, symbol: 'C'},
  {position: 7, name: 'Nitrogen', weight: 14.0067, symbol: 'N'},
  {position: 8, name: 'Oxygen', weight: 15.9994, symbol: 'O'},
  {position: 9, name: 'Fluorine', weight: 18.9984, symbol: 'F'},
  {position: 10, name: 'Neon', weight: 20.1797, symbol: 'Ne'},
];


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  displayedColumns: string[] = ['position', 'name', 'weight', 'symbol'];
  dataSource = ELEMENT_DATA;

  /*
  "id": 1,
"name": "Tusar",
"email": "tuysar@gmail.com",
"phone": "6757868678",
"query": "Need a project"
  */
  displayedColumnsForUsers: string[] = ['id', 'name', 'email', 'phone','query'];
  dataSourceForUsers:any = {};

  constructor(
    private employeeService: EmployeeService
    
  ) { }
  title = 'angular-emps';

  mydata:any = {};

  ngOnInit() {
    console.log("I am here");
    this.employeeService.getEmployees().subscribe(data =>{
this.mydata = data;
console.log("my data"+this.mydata);
    },
    (error: Error) => {
    }
    );
    console.log("Second service call");

    this.employeeService.getUsers().subscribe(data =>{
      this.dataSourceForUsers = data;
      console.log("my data"+this.dataSourceForUsers);
          },
          (error: Error) => {
          }
          );

  }

// form related code


form = new FormGroup({
  firstName: new FormControl('', Validators.required),
  lastName: new FormControl('', Validators.required),
  email: new FormControl('', [
    Validators.required,
    Validators.email
  ]),
  password: new FormControl('', [
    Validators.required,
    Validators.minLength(6)
  ])
  
 });
  

  get firstname(){
    return this.form.get('firstName')
  }
  

onSubmit(){
  alert(JSON.stringify(this.form.value));
}





}
