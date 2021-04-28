package com.ieti.startapp_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    public static final String EXTRA_MESSAGE = "com.ieti.startapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void  onRegister (View view) {
        mAuth = FirebaseAuth.getInstance();
        EditText email = findViewById(R.id.emailEditText);
        EditText password = findViewById(R.id.passwordEditText);
        RadioButton investor = findViewById(R.id.investorRadioButton);
        RadioButton entrepreneur = findViewById(R.id.entrepreneurRadioButton);
        if (email.getText().toString().isEmpty()) {
            email.setError("El Email no puede ser vacio");
        }
        if (email.getText().toString().isEmpty()) {
            password.setError("La contraseña no puede ser vacio");
        }
        if (!(investor.isChecked() || entrepreneur.isChecked())){
            investor.setError("Selecionar uno de los dos roles");
        } else{
            mAuth.signInWithEmailAndPassword(email.toString(), password.toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        if(investor.isChecked()){
                            redirectHomeActivity(email.toString(), "INVESTOR");
                        }else{
                            redirectHomeActivity(email.toString(), "ENTREPRENEUR");
                        }
                    } else {
                        showAlert(view);
                    }
                }
            });
        }
    }
    private void showAlert(View view){
        Snackbar mySnackbar = Snackbar.make(view, "Credeciales incorrectas", Snackbar.LENGTH_LONG);
        mySnackbar.show();
    }
    private void redirectHomeActivity(String email, String role){
        Intent intent =new Intent(this, HomeActivity.class);
        intent.putExtra("Email", email);
        intent.putExtra("Role", role);
        startActivity(intent);
    }
}