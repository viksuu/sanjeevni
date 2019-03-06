import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { CalendarModule } from 'angular-calendar';
import { NgbModalModule,  
        NgbDatepickerModule,
        NgbTimepickerModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';
import { appRoute } from './app.route';


import { AppComponent } from './app.component';
import { CalendarComponent } from './Calendar/calendar.component';
import { DateTimePickerComponent } from './roster-utils/date-time-picker/date-time-picker.component';
import { CalendarHeaderComponent } from './roster-utils/calendar-header/calendar-header.component';
import { MdSidenavModule, MdButtonModule, MdIconModule, MdListModule } from '@angular/material';
import {FlexLayoutModule} from '@angular/flex-layout';


@NgModule({
  declarations: [
    AppComponent,
    CalendarComponent,
    DateTimePickerComponent,
    CalendarHeaderComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    BrowserAnimationsModule,
    FormsModule,
    NgbDatepickerModule.forRoot(),
    NgbTimepickerModule.forRoot(),
    NgbModalModule.forRoot(),
    RouterModule.forRoot(appRoute),
    CalendarModule.forRoot(),
    MdSidenavModule,
    BrowserAnimationsModule,
    MdButtonModule,
    MdIconModule,
    FlexLayoutModule,
    MdListModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
