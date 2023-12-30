package com.dogan.retrofitjava.service;

import com.dogan.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    // GET POST UPDATE DELETE
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();



    //Call<List<CryptoModel>> getData();

}
