import { Component, OnInit } from '@angular/core';
import { Model } from '../model';
import Swal from 'sweetalert2'


@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})

export class TodoComponent {

displayAll : boolean = false;

  constructor() { }
model = new Model();

addItem(value:string){
if(value !=""){

  this.model.items.push({description:value,action:false})

}else{
  Swal.fire('Please enter a task')

}

}

getName(){
  return this.model.name;
}

getItems(){
  if(this.displayAll){
    return this.model.items;
  }
  return this.model.items.filter(item=>!item.action);
}

displayCount(){
  return this.model.items.filter(i=> i.action).length;
}

}
