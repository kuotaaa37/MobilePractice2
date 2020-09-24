package com.example.mobilepractice2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //initialize from design
    ListView listViewBook;
    Button addBookButton;
    EditText inputBookText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewBook = (ListView) findViewById(R.id.listViewBook);
        final ArrayList<String> books = new ArrayList<>();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Input Book");

        inputBookText = new EditText(this);
        builder.setView(inputBookText);

        //Set possitive buttion
        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String bookText = inputBookText.getText().toString();
                books.add(bookText);
                Toast.makeText(getApplicationContext(), bookText, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_SHORT).show();
            }
        });

        //Set negative buttion
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        //CREATE the dialog
        final AlertDialog alertDialog = builder.create();

        //BUTTON
        addBookButton = (Button) findViewById(R.id.addBookButton);
        addBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInputActivity();
                //alertDialog.show();
            }
        });


        books.add("Dora The Destroyer");

        ArrayAdapter booksAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,books);

        listViewBook.setAdapter(booksAdapter);

        //CONTEXT MENU
        registerForContextMenu(listViewBook);
    }

    public void openInputActivity(){
        Intent intent = new Intent(this, InputActivity.class);
        startActivity(intent);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.viewAction){
            Toast.makeText(this, "View selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.editAction){
            Toast.makeText(this, "Edit selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.deleteAction) {
            Toast.makeText(this, "Delete selected", Toast.LENGTH_SHORT).show();
            return true;
        }else {
            return false;
        }
    }
}
