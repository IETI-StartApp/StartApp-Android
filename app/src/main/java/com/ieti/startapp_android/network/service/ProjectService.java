package com.ieti.startapp_android.network.service;

import com.ieti.startapp_android.model.Project;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProjectService {

    @GET("api/v1/projects")
    Call<List<Project>> getAllProjects();
}
