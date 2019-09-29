package com.example.crud.services;



import com.example.crud.dto.AuthDTO;
import com.example.crud.dto.UserDTO;

import retrofit2.Call;
import retrofit2.http.Body;

import retrofit2.http.Header;
import retrofit2.http.POST;

public interface InterfaceDeServicos {


    @POST("/auth/login")
    Call<AuthDTO> autenticar(@Body AuthDTO dtoAuthLogin);

    @POST("/users")
    Call<UserDTO> cadastrarUsuario(@Body UserDTO dtoUser);


}


