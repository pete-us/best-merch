import { Component, Input } from '@angular/core';
import { Category } from '../categories/category.model';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent {

  @Input()
  category: Category;

}
