import { Component, Output, EventEmitter, OnInit, Input } from '@angular/core';
import { Subject } from 'rxjs';
import { CategoriesService } from './categories.service';
import { Category } from './category.model';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.scss']
})
export class CategoriesComponent implements OnInit {

  categories: Category[] = [];

  /**
   * Observer triggered when categories change.
   */
  categoryObserver = new Subject<Category[]>();

  @Input()
  selectedCategory: Category;

  @Output()
  onCategoryChanged = new EventEmitter<Category>();

  constructor(public categoriesService: CategoriesService) { }

  ngOnInit(): void {
    this.categoryObserver.subscribe((categories: Category[]) => {
      if (categories.length > 0) {
        // The categories have changed, the default selected category is the first in the list
        this.onCategoryChanged.emit(categories[0]);
      }
    });
    // Initialize the default selected category based on the current list
    this.categoryObserver.next(this.categories);
    // Prepare for future changes regarding the categories
    this.categoriesService.listCategories().subscribe((categories: Category[]) => {
      this.categories = categories;
      this.categoryObserver.next(this.categories);
    });
  }

  /**
   * Change the selected category.
   * 
   * @param category The new selected category.
   */
  changeCategory(category: Category) {
    this.onCategoryChanged.emit(category);
  }
}
