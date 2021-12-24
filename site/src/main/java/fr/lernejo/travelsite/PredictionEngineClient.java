package fr.lernejo.travelsite;

import retrofit2.http.Path;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface PredictionEngineClient {
    @GET("/api/temperature?country={country}")
    Call<List<Travels>> getlistRepos(@Path("Country") String country);
}
