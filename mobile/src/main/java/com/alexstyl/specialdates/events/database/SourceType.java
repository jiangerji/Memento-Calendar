package com.alexstyl.specialdates.events.database;

import android.support.annotation.IntDef;

import com.alexstyl.specialdates.events.database.EventsDBContract.AnnualEventsContract;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@IntDef({AnnualEventsContract.SOURCE_DEVICE, AnnualEventsContract.SOURCE_MEMENTO})
public @interface SourceType {
}
