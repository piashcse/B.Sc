package com.example.mehedihassanpiash.diuresult2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;

public class Result extends AppCompatActivity {


    EditText editTextShift;
    EditText editTextRoll;
    EditText editTextBatch;
    EditText editTextSemester;
    Button buttonSearch;

    String rollStudent;
    String semesterStudent;
    String batchStudent;
    String shiftStudent;
    String url;

     String name;
     String roll;
     String shift;
     String batch;
    String semester;
     String gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        editTextRoll = (EditText)findViewById(R.id.editTextRoll);
        editTextBatch = (EditText)findViewById(R.id.editTextBatch);
        editTextSemester = (EditText)findViewById(R.id.editTextSemester);
        editTextShift = (EditText)findViewById(R.id.editTextShift);
        buttonSearch = (Button)findViewById(R.id.buttonSearch);

        buttonSearch.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        rollStudent = editTextRoll.getText().toString();
                        semesterStudent = editTextSemester.getText().toString();
                        shiftStudent = editTextShift.getText().toString();
                        batchStudent = editTextBatch.getText().toString();
                        Log.e("TaGGG::", ""+rollStudent +semesterStudent+shiftStudent+batchStudent );

                        getdata(rollStudent, semesterStudent, shiftStudent, batchStudent);

                    }
                }
        );

    }


    public void getdata( String rollStudent, String semesterStudent, String shiftStudent, String batchStudent){

      //  url = "http://192.168.0.26/Result/SearchResult?roll=120&semester=1st&shift=day&batch=27th";
        // 169.254.253.1

        url = "http://192.168.0.26/Result/SearchResult?roll="+rollStudent+"&semester="+semesterStudent+"&shift="+shiftStudent+"&batch="+batchStudent+"";


        Log.e("Tracl URL ", "" + url);


        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {

                //Log.d(TAG, "Success "+ s.toString());


                try{

                    JSONArray array = new JSONArray(s);
                    //JSONObject data = new JSONObject(s);


                    for( int i = 0; i < array.length(); i++){

                        name = array.getJSONObject(i).getString("name");
                        roll = array.getJSONObject(i).getString("roll");
                        shift = array.getJSONObject(i).getString("shift");
                        batch = array.getJSONObject(i).getString("batch");
                        semester = array.getJSONObject(i).getString("semester");
                        gpa = array.getJSONObject(i).getString("gpa");


                    }

                    Intent i = new Intent(getApplicationContext(), Show.class);
                    Log.e( "onResponse:>>>>>> ", ""+name+roll+shift+batch+semester+gpa );
                    i.putExtra("name", name);
                    i.putExtra("roll", roll);
                    i.putExtra("shift",shift);
                    i.putExtra("batch", batch);
                    i.putExtra("semester", semester);
                    i.putExtra("gpa", gpa);
                    startActivity(i);


                }catch (JSONException e){

                    Toast.makeText(getApplication(),"Please Enter again give the data", Toast.LENGTH_SHORT).show();

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.e("onErrorResponse: ", "" + error);
                Log.e("Track", "On Failure");
                if(error == null) {
                    Log.e("Track", "Error Null");
                    return;
                }
                // Log.e("Track", "" + error.networkResponse.statusCode);
                if(error.networkResponse == null) {
                    Log.e("Track", "Network Responce Null");
                    return;
                }
                if(error.networkResponse.statusCode == 400) {
                    Toast.makeText(getApplicationContext(), "Input Error", Toast.LENGTH_LONG).show();
                }
            }
        });

        MyVolley.getInstance(getApplicationContext()).addToRequestQueue(request);
    }

}
