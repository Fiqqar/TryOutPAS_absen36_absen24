package com.example.bottom_nav;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterfacePremiereLeague {
    @GET("/api/v1/json/3/search_all_teams.php?l=English%20Premier%20League")
    Call<com.example.bottom_nav.TimResponse> getAllTeams();
}