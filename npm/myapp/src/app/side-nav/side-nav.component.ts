import { Component } from '@angular/core';
import { BreakpointObserver, Breakpoints, BreakpointState } from '@angular/cdk/layout';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import {NavigationEnd, Router} from "@angular/router";

@Component({
  selector: 'side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.css']
})
export class SideNavComponent {

  isHandset$: Observable<boolean> = this.breakpointObserver.observe(Breakpoints.Handset)
    .pipe(
      map(result => result.matches)
    );

  currentUrl: string;

    constructor(private breakpointObserver: BreakpointObserver, private router: Router) {
      router.events.subscribe((_: NavigationEnd) => this.currentUrl = _.url)
    }

/*
    constructor(private router: Router) {
      router.events.subscribe((_: NavigationEnd) => this.currentUrl = _.url)
    }
*/

    ngOnInit() {
    }
  }
