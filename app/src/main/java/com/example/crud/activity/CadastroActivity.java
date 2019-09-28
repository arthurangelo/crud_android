package com.example.crud.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.crud.R;
import com.example.crud.dto.UserDTO;
import com.example.crud.services.RetrofitService;

import java.util.logging.LogManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void salvar(View view) {

        String email = ((EditText) findViewById(R.id.et_cadastro_email)).getText().toString();
        String password = ((EditText) findViewById(R.id.et_cadastro_password)).getText().toString();
        String phone = ((EditText) findViewById(R.id.et_cadastro_phone)).getText().toString();
        String name = ((EditText) findViewById(R.id.et_cadastro_nome)).getText().toString();

        UserDTO userDTO = new UserDTO(email, name, password, phone);
        RetrofitService.getServico(this).cadastrarUsuario(userDTO).enqueue(new Callback<UserDTO>() {
            @Override
            public void onResponse(Call<UserDTO> call, Response<UserDTO> response) {
                Toast.makeText(CadastroActivity.this, "Usuario cadastrado com sucesso com ID: " + response.body().getId(), Toast.LENGTH_SHORT).show();
                Log.d("CadastroActivity","response: " + response.raw().body());
            }

            @Override
            public void onFailure(Call<UserDTO> call, Throwable t) {
                Toast.makeText(CadastroActivity.this, "Erro ao cadastrar usuario: " + t.getMessage(), Toast.LENGTH_LONG).show();
                Log.d("CadastroActivity","error: " + t.getMessage());


            }
        });
    }
}
