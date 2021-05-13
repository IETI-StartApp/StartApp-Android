package com.ieti.startapp_android.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ieti.startapp_android.R;
import com.ieti.startapp_android.view.card.cardProjectElement;
import com.ieti.startapp_android.model.Finance;
import com.ieti.startapp_android.model.Project;
import com.ieti.startapp_android.model.User;
import com.ieti.startapp_android.network.RetrofitNetwork;
import com.ieti.startapp_android.view.card.GridAdapter;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {
    private final ExecutorService executorService = Executors.newFixedThreadPool( 1 );
    private  List<cardProjectElement> cardProjectElements;
    private  List<Project> projects;
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
        loadProjects();

    }
    public void loadProjects(){
        Call<List<Project>> call = new RetrofitNetwork().getProjectService().getAllProjects();
        call.enqueue(new Callback<List<Project>>() {
            @Override
            public void onResponse(Call<List<Project>> call, Response<List<Project>> response) {
                if(!response.isSuccessful()) {
                    System.out.println("fallo "+ response.code() );
                    return;
                }
                projects = response.body();
                drawProjects();

            }

            @Override
            public void onFailure(Call<List<Project>> call, Throwable t) {
                System.out.println("no la hizo");
            }
        });

    }

    private void drawProjects() {

        cardProjectElements = new ArrayList<>();
        for (int i =0; i < projects.size(); i++){
            Project project =  projects.get(i);
            Finance finance = project.getFinance();
            User user = project.getUser();
            String progress = Long.toString(finance.getValue()*100/finance.getValuation());
            String name;
            if(project.getUser() != null){
                name = user.getFirstName()+ " "+ project.getUser().getLastName();
            }else{
                name = "no Disponible";
            }

            cardProjectElements.add(new cardProjectElement(project.getId()," "+name, " "+new SimpleDateFormat("dd-MM-yyyy").format(finance.getStartDate()), project.getName(), Long.toString(finance.getValuation()), Long.toString(finance.getValue()), progress, Integer.toString(finance.getInvestorNumber()), project.getImage(), ""));
        }
//        cardProjectElements.add(new cardProjectElement("prueba", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
//        cardProjectElements.add(new cardProjectElement("hola", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
//        cardProjectElements.add(new cardProjectElement("rub", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
//        cardProjectElements.add(new cardProjectElement("paisa", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
//        cardProjectElements.add(new cardProjectElement("claro que no", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
//        cardProjectElements.add(new cardProjectElement("Funcionaaaaaaa", "10/8/2020", "Pruebita mela", "1000000", "2000", "50%", "2"));
        GridAdapter gridAdapter = new GridAdapter(cardProjectElements, this);
        RecyclerView recyclerView = findViewById(R.id.gridRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(gridAdapter);
    }
}