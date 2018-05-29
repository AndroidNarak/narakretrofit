package com.retrofit.retrofit.api;

import android.text.GetChars;

import com.retrofit.retrofit.entity.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubClent {
    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> repoForUser(@Path("user") String user);
}
