package com.ieti.startapp_android.network;

import com.ieti.startapp_android.network.service.ProjectService;

import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitNetwork {
    private ProjectService projectService;
    public RetrofitNetwork( ) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl( "http:/10.0.2.2:8080/" ) //localhost for emulator
                .addConverterFactory( GsonConverterFactory.create()).build();
        projectService = retrofit.create(ProjectService.class);
    }

    public ProjectService getProjectService() {
        return projectService;
    }
}
