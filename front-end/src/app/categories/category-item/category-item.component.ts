import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Category } from '../category.model';

@Component({
  selector: 'app-category-item',
  templateUrl: './category-item.component.html',
  styleUrls: ['./category-item.component.scss']
})
export class CategoryItemComponent {

  @Input()
  category: Category;

  @Input()
  selectedCategory: Category;

  @Output()
  onItemSelected = new EventEmitter<Category>();

  get isSelected() {
    return this.category?.name === this.selectedCategory?.name;
  }

  onSelect() {
    this.onItemSelected.emit(this.category);
  }

}
