import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { CategoriesService } from '../categories/categories.service';
import { Category } from '../categories/category.model';
import { Product } from './product.model';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent implements OnChanges {

  @Input()
  category: Category;

  products: Product[] = [];

  constructor(protected categoriesService: CategoriesService) {}

  ngOnChanges(changes: SimpleChanges): void {
    if (changes['category'].currentValue != changes['category'].previousValue) {
      this.categoriesService.listProductsForCategory(this.category).subscribe((products: Product[]) => {
        this.products = products;
      });
    }
  }

}
