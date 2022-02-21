package com.example;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String tfName,tfUsername, tfEmail, tfAddress, tfPassword;

    Button btnButton;
    EditText name;
    EditText username;
    EditText email;
    EditText address;
    EditText password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnButton = findViewById(R.id.btn_submit);
        name = findViewById(R.id.tf_name);
        username = findViewById(R.id.tf_username);
        email = findViewById(R.id.tf_email);
        address = findViewById(R.id.tf_address);
        password = findViewById(R.id.reg_pass);



        btnButton.setOnClickListener(
                view -> {
                    System.out.println("Name : " + name.getText());
                    System.out.println("Username : " + username.getText());
                    System.out.println("Email : " + email.getText());
                    System.out.println("Address : " + address.getText());
                    System.out.println("Password : " + password.getText());
                }
        );
    }
}