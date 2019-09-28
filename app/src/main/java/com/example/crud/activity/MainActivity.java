package com.example.crud.activity;

import android.content.Intent;
import android.os.Bundle;

import com.example.crud.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_cadastro:
                startActivity(new Intent(this,CadastroActivity.class));
                return true;
            case R.id.menu_logar:
                startActivity(new Intent(this,LogarActivity.class));

                return true;
            case R.id.menu_todos:
                startActivity(new Intent(this,TodosActivity.class));

                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
