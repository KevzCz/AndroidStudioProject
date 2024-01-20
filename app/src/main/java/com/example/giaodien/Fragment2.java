package com.example.giaodien;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        Button homeButton = view.findViewById(R.id.button1);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToHomePage();
            }
        });
        Toolbar toolbar = view.findViewById(R.id.musicPageListToolBar);
        ((AppCompatActivity) requireActivity()).setSupportActionBar(toolbar);

        ImageButton musicOptionMenu = view.findViewById(R.id.musicOptionMenu);
        musicOptionMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMusicOptionsBottomSheet();
            }
        });

        setHasOptionsMenu(true);

        return view;
    }

    private void returnToHomePage() {
        Intent intent = new Intent(requireContext(), MainActivity.class);
        startActivity(intent);
    }

    private void showMusicOptionsBottomSheet() {
        musicoptionmenu bottomDialog = new musicoptionmenu();
        bottomDialog.show(requireActivity().getSupportFragmentManager(), "bottom_dialog");
    }
}
