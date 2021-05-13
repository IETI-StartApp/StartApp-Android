package com.ieti.startapp_android.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.ViewSwitcher;

import com.ieti.startapp_android.R;
import com.ieti.startapp_android.model.Project;
import com.ieti.startapp_android.network.RetrofitNetwork;
import com.ieti.startapp_android.view.card.ViewHolder;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProjectActivity extends AppCompatActivity {
    private Project project;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2);
        Intent intent = getIntent();
        String id = intent.getStringExtra(ViewHolder.EXTRA_ID);
        loadProject(id);
    }
    public void loadProject(String id){
        Call<Project> call = new RetrofitNetwork().getProjectService().getProjectById(id);
        call.enqueue(new Callback<Project>() {
            @Override
            public void onResponse(Call<Project> call, Response<Project> response) {
                if(!response.isSuccessful()) {
                    System.out.println("fallo "+ response.code() );
                    return;
                }
                project = response.body();
                drawProject();
            }

            @Override
            public void onFailure(Call<Project> call, Throwable t) {
                System.out.println("no la hizo");
            }
        });
    }
    private void drawProject(){
        TextView nameProject, nameUser, countryProject, goalProject, numberInvestor, valuation, minInvestment, missingDays, startDate, endDate;
        VideoView videoProject = findViewById(R.id.projectVideoView);
        ImageView projectImageView;
        nameProject = findViewById(R.id.projectTextView);
        nameUser = findViewById(R.id.userTextView);
        countryProject = findViewById(R.id.linkTextView);
        goalProject = findViewById(R.id.goalTextView);
        numberInvestor = findViewById(R.id.investorTextView);
        valuation = findViewById(R.id.valuationTextView);
        minInvestment = findViewById(R.id.investorMInTextView);
        missingDays = findViewById(R.id.missingDaysTextView);
        startDate = findViewById(R.id.dateStartTextView);
        endDate = findViewById(R.id.dateEndTextView);
        projectImageView = findViewById(R.id.projectImageView);
        nameProject.setText(" "+project.getName());
        nameUser.setText(" "+project.getUser().getFirstName()+" "+project.getUser().getLastName());
        countryProject.setText(project.getCountry());
        goalProject.setText("$ "+Long.toString(project.getFinance().getValue()));
        numberInvestor.setText(Integer.toString(project.getFinance().getInvestorNumber()));
        valuation.setText("$ "+ Long.toString(project.getFinance().getValuation()));
        minInvestment.setText("$ "+Long.toString(project.getFinance().getMinimumInvestment()));
        long diff = project.getFinance().getEndDate().getTime() - project.getFinance().getStartDate().getTime();
        TimeUnit time = TimeUnit.DAYS;
        long daysDiffrence = time.convert(diff, TimeUnit.MICROSECONDS);
        missingDays.setText(Long.toString(daysDiffrence));
        startDate.setText(new SimpleDateFormat("dd-MM-yyyy").format(project.getFinance().getStartDate()));
        endDate.setText(new SimpleDateFormat("dd-MM-yyyy").format(project.getFinance().getEndDate()));
        Picasso.get().load(project.getImage()).into(projectImageView);

    }
}