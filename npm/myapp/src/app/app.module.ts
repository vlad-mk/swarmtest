import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { UsersComponent } from './users/users.component';
import { DetailsComponent } from './details/details.component';
import { PostsComponent } from './posts/posts.component';
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MatTreeModule } from '@angular/material/tree';
import { MatIconModule } from "@angular/material/icon";
import { MatButtonModule } from '@angular/material/button' ;
// import { CdkTreeModule } from '@angular/cdk/tree';

import { HttpClientModule } from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    UsersComponent,
    DetailsComponent,
    PostsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatTreeModule,
    MatIconModule,
    MatButtonModule
    // CdkTreeModule
  ],
/*  exports: [
    MatTreeModule
  ],*/
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
