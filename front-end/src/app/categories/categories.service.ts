import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Product } from '../products/product.model';
import { Category } from './category.model';

@Injectable()
export class CategoriesService {

  constructor(public httpClient: HttpClient) { }

  public listCategories(): Observable<Category[]> {
    return this.httpClient.get<Category[]>(`${environment.apiUrl}/categories`);
  }

  public listProductsForCategory(category: Category): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`${environment.apiUrl}/categories/${category.name}`);
  }
}
