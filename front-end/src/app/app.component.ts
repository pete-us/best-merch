import { Component } from '@angular/core';
import { Category } from './categories/category.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  currentCategory: Category;

  selectCategory(category: Category) {
    this.currentCategory = category;
  }
}
