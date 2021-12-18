package fr.lernejo.travelsite;

import retrofit2.http.Path;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PredictionEngineClient {

    @GET("/api/temperature?country={country}")
    Call<Object> getPrediction(@Path("country") String country);
}