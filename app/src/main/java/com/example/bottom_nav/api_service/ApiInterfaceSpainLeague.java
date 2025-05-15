package com.example.bottom_nav.api_service;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterfaceSpainLeague {
    @GET("/api/v1/json/3/search_all_teams.php?l=Spanish%20La%20Liga")
    Call<TimResponse> getAllTeams();
}

