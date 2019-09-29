package com.example.crud.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.crud.R;
import com.example.crud.dto.AuthDTO;
import com.example.crud.dto.UserDTO;
import com.example.crud.services.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logar);
    }

    public void autenticar(View view) {

        String email = ((EditText) findViewById(R.id.txt_autenticar_email)).getText().toString();
        String password = ((EditText) findViewById(R.id.txt_autenticar_password)).getText().toString();
        String nome = "";
        String token = "";

        AuthDTO authDTO = new AuthDTO(nome, token, password, email);
        RetrofitService.getServico(this).autenticar(authDTO).enqueue(new Callback<AuthDTO>() {
            @Override
            public void onResponse(Call<AuthDTO> call, Response<AuthDTO> response) {
                Toast.makeText(LogarActivity.this, "Autenticacao realizada com sucesso: " + response.body().getToken(), Toast.LENGTH_SHORT).show();
                Log.d("LogarActivity","response: " + response.raw().body());
            }

            @Override
            public void onFailure(Call<AuthDTO> call, Throwable t) {
                Toast.makeText(LogarActivity.this, "Erro ao autenticar: " + t.getMessage(), Toast.LENGTH_LONG).show();
                Log.d("LogarActivity","error: " + t.getMessage());


            }
        });
    }
}
