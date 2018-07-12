import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { UsersComponent } from './users/users.component';
import { DetailsComponent } from './details/details.component';
import { PostsComponent } from './posts/posts.component';
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MatIconModule, MatButtonModule, MatMenuModule, MatSidenavModule, MatCheckboxModule, MatToolbarModule, MatListModule } from "@angular/material";

import { HttpClientModule } from "@angular/common/http";
import { SideNavComponent } from './side-nav/side-nav.component';
import { LayoutModule } from '@angular/cdk/layout';

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    UsersComponent,
    DetailsComponent,
    PostsComponent,
    SideNavComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatButtonModule,
    MatMenuModule,
    MatSidenavModule,
    MatCheckboxModule,
    LayoutModule,
    MatToolbarModule,
    MatListModule

    // CdkTreeModule
  ],
/*  exports: [
    MatTreeModule
  ],*/
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
