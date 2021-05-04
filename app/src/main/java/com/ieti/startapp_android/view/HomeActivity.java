package com.ieti.startapp_android.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ieti.startapp_android.R;
import com.ieti.startapp_android.view.card.GridAdapter;
import com.ieti.startapp_android.view.card.cardProjectElement;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String email =  intent.getStringExtra(AuthActivity.EXTRA_EMAIL);
        TextView userTextView = findViewById(R.id.userTextView);
        userTextView.setText(email);
        ImageView useImageView = findViewById(R.id.userImageView);
        //Cambiar imagen useImageView.setImageResource();
        setUp();
    }

    private void setUp() {
        List<cardProjectElement> projects = new ArrayList<>();
        projects.add(new cardProjectElement("prueba", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
        projects.add(new cardProjectElement("hola", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
        projects.add(new cardProjectElement("rub", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
        projects.add(new cardProjectElement("paisa", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
        projects.add(new cardProjectElement("claro que no", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
        projects.add(new cardProjectElement("Funcionaaaaaaa", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
        GridAdapter gridAdapter = new GridAdapter(projects, this);
        RecyclerView recyclerView = findViewById(R.id.gridRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(gridAdapter);
    }
}