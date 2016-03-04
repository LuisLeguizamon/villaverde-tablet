package com.example.luis.villaverde_tablet;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by luis on 02/03/16.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{
    TextView txDate;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    int year,month,day;
    String sYear,sMonth,sDay,concat;

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user

        year= view.getYear();
        month=view.getMonth();
        month=month+1;
        day=view.getDayOfMonth();
        sYear=String.valueOf(year);
        sMonth=String.valueOf(month);
        sDay=String.valueOf(day);

        //Log.d("YEAR:",sYear);
        concat=sYear+"-"+sMonth+"-"+sDay;
        txDate=(TextView)getActivity().findViewById(R.id.txDate);
        txDate.setText(concat);

    }

}


