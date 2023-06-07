package com.example.mycuculator;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogLevel extends DialogFragment {
    int Level = 0;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] LevelArray = {"Легко", "Умерено", "Сложно","Hardcore"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Выберите уровень сложности:")
                // добавляем переключатели
                .setSingleChoiceItems(LevelArray, -1,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int item) {
                                Toast.makeText(
                                        getActivity(),
                                        "Уровень сложности выбран: "
                                                + LevelArray[item],
                                        Toast.LENGTH_SHORT).show();
                                FirstActivity.Level = item;
                            }
                        })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        dialog.cancel();

                    }
                })
                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        return builder.create();
    }
}