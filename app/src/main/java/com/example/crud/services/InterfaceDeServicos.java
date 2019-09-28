package com.example.crud.services;



import com.example.crud.dto.UserDTO;

import retrofit2.Call;
import retrofit2.http.Body;

import retrofit2.http.POST;

public interface InterfaceDeServicos {


    @POST("/users")
    Call<UserDTO> cadastrarUsuario(@Body UserDTO dtoUser);

}


