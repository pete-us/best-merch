import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchbarComponent } from './headerbar/searchbar/searchbar.component';
import { CategoriesComponent } from './categories/categories.component';
import { ProductsComponent } from './products/products.component';
import { CategoriesService } from './categories/categories.service';
import { CategoryItemComponent } from './categories/category-item/category-item.component';
import { ProductItemComponent } from './products/product-item/product-item.component';
import { HeaderbarComponent } from './headerbar/headerbar.component';
import { ProductsService } from './products/products.service';

@NgModule({
  declarations: [
    AppComponent,
    SearchbarComponent,
    CategoriesComponent,
    ProductsComponent,
    CategoryItemComponent,
    ProductItemComponent,
    HeaderbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    CategoriesService,
    ProductsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
