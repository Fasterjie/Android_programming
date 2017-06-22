package com.bignerdranch.android.criminalintent;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Faster on 6/22/2017.
 */

public class TimeFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_time,null);
        return new TimePickerDialog.Builder(getActivity())
                .setView(v)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
