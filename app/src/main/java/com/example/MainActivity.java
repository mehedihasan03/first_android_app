package com.example;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String tfName,tfUsername, tfEmail, tfAddress, tfPassword;

    Button btnButton;
    EditText name;
    EditText username;
    EditText email;
    EditText address;
    EditText password;
    RadioButton selectedGen;
    RadioGroup gender;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnButton = findViewById(R.id.btn_submit);
        name = findViewById(R.id.tf_name);
        username = findViewById(R.id.tf_username);
        email = findViewById(R.id.tf_email);
        gender = findViewById(R.id.radioGroup);
        address = findViewById(R.id.tf_address);
        password = findViewById(R.id.reg_pass);
        spinner = findViewById(R.id.spinner);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        btnButton.setOnClickListener(
                view -> {
                    System.out.println("Name : " + name.getText());
                    System.out.println("Username : " + username.getText());
                    System.out.println("Email : " + email.getText());
                    System.out.println("Address : " + address.getText());
                    System.out.println("Password : " + password.getText());
                    int genId = gender.getCheckedRadioButtonId();
                    selectedGen = findViewById(genId);
                    System.out.println("Gender : " + selectedGen.getText());
                }
        );
    }
}