package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView stud_listView;
    private ArrayAdapter stud_arrayApt;
    private String[] student_Names = {
            "Arjay Escabas",
            "Renz Ivan Polancos",
            "Allan Corpuz",
            "Bajig Rosalijos",
            "Stephen Gravino",
            "Alice Johansson",
            "Mateo Garcia",
            "Aisha Kapoor",
            "Ethan Walker",
            "Luna Sanchez",
            "Liam O'Connor",
            "Maya Nguyen",
            "Oliver Schmidt",
            "Ava Tanaka",
            "Lucas Brown",
            "Sofia Miller",
            "Benjamin Lee",
            "Chloe Kim",
            "Noah Davies",
            "Emilia Wright"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stud_listView = (ListView) findViewById(R.id.studentnames);
        stud_arrayApt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, student_Names);
        stud_listView.setAdapter(stud_arrayApt);

    }
}