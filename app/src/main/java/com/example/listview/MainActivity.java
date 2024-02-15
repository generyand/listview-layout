package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] nameList = {
            "Chloe Kim",
            "Granville C. Jones",
            "Magan D. Oliver",
            "Joan M. Logan",
            "Carol T. Watson",
            "Gregory J. Walls",
            "Alice Johansson",
            "Aisha Kapoor",
            "Mateo Garcia",
            "Ethan Walker",
            "Luna Sanchez",
            "Liam O'Connor",
            "Maya Nguyen",
            "Oliver Schmidt",
            "Ava Tanaka",
            "Emilia Wright",
            "Sofia Miller",
            "Benjamin Lee",
            "Noah Davies",
            "Lucas Brown"
    };

    int[] pics_contact = {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a10,
            R.drawable.a11,
            R.drawable.a12,
            R.drawable.a13,
            R.drawable.a14,
            R.drawable.a15,
            R.drawable.a16,
            R.drawable.a17,
            R.drawable.a18,
            R.drawable.a19,
            R.drawable.a20,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView data_list = (ListView) findViewById(R.id.Datalist);
        CustomAdapter base = new CustomAdapter(nameList, pics_contact, this);
        data_list.setAdapter(base);

    }
}