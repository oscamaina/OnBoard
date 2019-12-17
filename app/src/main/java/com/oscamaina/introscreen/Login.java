package com.oscamaina.introscreen;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity implements View.OnClickListener{
    Button btnBack, btnRegister, btnLogin;
    TextView txt_username, txt_password;
    private RequestQueue requestQueue;
    private static final String URL = "http://192.168.31.213:80/itax/user_control.php";
    private StringRequest request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //hide action bar
        getSupportActionBar().hide();

        btnBack = findViewById(R.id.btn_loginback);
        btnRegister = findViewById(R.id.btn_register);
        btnLogin = findViewById(R.id.btn_ingia);
        txt_username = findViewById(R.id.txt_username);
        txt_password = findViewById(R.id.txt_password);

        requestQueue = Volley.newRequestQueue(this);


        btnBack.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }
    public boolean fieldsverified(){
        boolean verified = false;
        if (TextUtils.isEmpty(txt_username.getText().toString()) || TextUtils.isEmpty(txt_password.getText().toString())){
            if (TextUtils.isEmpty(txt_username.getText().toString()))
                txt_username.setError("Username is required!");
            if (TextUtils.isEmpty(txt_password.getText().toString()))
                txt_password.setError(("Password is required!"));
        }else
            verified = true;

        return verified;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_loginback:
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
                break;
            case R.id.btn_register:
                Intent registerActivity = new Intent(getApplicationContext(), Register.class);
                startActivity(registerActivity);
                break;
            case R.id.btn_ingia:
                request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            if (jsonObject.names().get(0).equals("success")){
                                Toast.makeText(getApplicationContext(), "SUCCESS"+ jsonObject.getString("success"),Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(),TaxServices.class));
                            }else {
                                Toast.makeText(getApplicationContext(),"Error " +
                                        jsonObject.getString("error"), Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap hashMap = new HashMap();
                        hashMap.put("email", txt_username.getText().toString());
                        hashMap.put("password", txt_password.getText().toString());

                        return hashMap;
                    }
                };
                requestQueue.add(request);
                break;
    }
}}
