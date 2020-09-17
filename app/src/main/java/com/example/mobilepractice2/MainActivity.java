package com.example.mobilepractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listViewBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewBook = (ListView) findViewById(R.id.listViewBook);

        ArrayList<String> books = new ArrayList<>();

        books.add("Harry Potter");
        books.add("Your Name");
        books.add("Peter Fantasista");
        books.add("Brave Dragon");
        books.add("Lion Senki");
        books.add("Tales of Worst One");
        books.add("I Want to Eat Your Pancreas");
        books.add("My Duck is Gone");
        books.add("Battleship");
        books.add("Maze Runner");
        books.add("Dora The Destroyer");
        books.add("Avatar");

        ArrayAdapter booksAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,books);

        listViewBook.setAdapter(booksAdapter);
    }
}