package com.ieti.startapp_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class AuthActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    public static final String EXTRA_MESSAGE = "com.ieti.startapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }

    public void  onLogin (View view) {
        mAuth = FirebaseAuth.getInstance();
        EditText email = findViewById(R.id.emailEditText);
        EditText password = findViewById(R.id.passwordEditText);
        if (email.getText().toString().isEmpty()) {
            email.setError("Email cannot be empty");
        }
        if (email.getText().toString().isEmpty()) {
            password.setError("Password cannot be empty");
        }else{
            mAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (task.isSuccessful()) {
                        redirectHomeActivity(email.toString());
                    } else {
                        showAlert(view);
                    }
                }
            });
        }

    }
    public  void goToRegister(View view){
        Intent intent =new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
    private void showAlert(View view){
        Snackbar mySnackbar = Snackbar.make(view, "Credeciales incorrectas", Snackbar.LENGTH_LONG);
        mySnackbar.show();
    }

    private void redirectHomeActivity(String email){
        Intent intent =new Intent(this, HomeActivity.class);
        intent.putExtra("Email", email);
        startActivity(intent);
    }
}