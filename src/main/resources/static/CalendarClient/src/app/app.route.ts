import  { Routes } from '@angular/router' ;
import  { CalendarComponent } from './Calendar/calendar.component';

export const appRoute: Routes = [
    
    {
        path : '',
        component : CalendarComponent
    },

    {
        path : 'calender',
        component : CalendarComponent
    }


];