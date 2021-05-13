package com.ieti.startapp_android.network.service;

import com.ieti.startapp_android.model.Project;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface ProjectService {

    @GET("api/v1/projects")
    Call<List<Project>> getAllProjects();

    @GET("api/v1/projects/{id}")
    Call<Project> getProjectById(@Path("id") String id);
}
