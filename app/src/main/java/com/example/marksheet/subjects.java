package com.example.marksheet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class subjects extends AppCompatActivity {

    private TextView sub1;
    private TextView sub2;
    private TextView sub3;
    private TextView sub4;
    private TextView sub5;
    private TextView sub6;
    private TextView sub7;
    private TextView sub8;

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private EditText et6;
    private EditText et7;
    private EditText et8;

    private Button btninsert;
    private Button btnview;


    DatabaseReference reff1,reff2,reff3,reff4,reff5,reff6,reff7,reff8,reff;
    Member member;

    String id1,id2,id3,id4,id5,id6,id7,id8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        Intent intent = getIntent();

        int x = intent.getIntExtra("semCount", 124);
        x++;

        sub1=findViewById(R.id.sub1);
        sub1.setText("18xx"+x+"1");

        sub2=findViewById(R.id.sub2);
        sub2.setText("18xx"+x+"2");

        sub3=findViewById(R.id.sub3);
        sub3.setText("18xx"+x+"3");

        sub4=findViewById(R.id.sub4);
        sub4.setText("18xx"+x+"4");

        sub5=findViewById(R.id.sub5);
        sub5.setText("18xx"+x+"5");

        sub6=findViewById(R.id.sub6);
        sub6.setText("18xx"+x+"6");

        sub7=findViewById(R.id.sub7);
        sub7.setText("18xx"+x+"7");

        sub8=findViewById(R.id.sub8);
        sub8.setText("18xx"+x+"8");

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);
        et8 = findViewById(R.id.et8);


        btninsert = findViewById(R.id.insertbtn);
        btnview = findViewById(R.id.view);


        String subcode1 = sub1.getText().toString();
        String subcode2 = sub2.getText().toString();
        String subcode3 = sub3.getText().toString();
        String subcode4 = sub4.getText().toString();
        String subcode5 = sub5.getText().toString();
        String subcode6 = sub6.getText().toString();
        String subcode7 = sub7.getText().toString();
        String subcode8 = sub8.getText().toString();


        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");


        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String subcode1 = sub1.getText().toString().trim();
                String submarks1 = et1.getText().toString().trim();
                try {
                    Integer.parseInt(submarks1);
                }
                catch (NumberFormatException e){
                    Toast.makeText(getBaseContext(),"Invalid text",Toast.LENGTH_SHORT).show();
                }

                int submarks11 = Integer.parseInt(et1.getText().toString().trim());
                id1 = reff.getKey();

                member.setSubcode(subcode1);
                member.setSubmarks(submarks11);
                reff.push().setValue(member);


                String subcode2 = sub2.getText().toString().trim();
                int submarks2 = Integer.parseInt(et2.getText().toString().trim());
                id2 = reff.getKey();

                member.setSubcode(subcode2);
                member.setSubmarks(submarks2);
                reff.push().setValue(member);


                String subcode3 = sub3.getText().toString().trim();
                int submarks3 = Integer.parseInt(et3.getText().toString().trim());
                id3 = reff.getKey();

                member.setSubcode(subcode3);
                member.setSubmarks(submarks3);
                reff.push().setValue(member);

                String subcode4 = sub4.getText().toString().trim();
                int submarks4 = Integer.parseInt(et4.getText().toString().trim());
                id4 = reff.getKey();

                member.setSubcode(subcode4);
                member.setSubmarks(submarks4);
                reff.push().setValue(member);

                String subcode5 = sub5.getText().toString().trim();
                int submarks5 = Integer.parseInt(et5.getText().toString().trim());
                id5 = reff.getKey();

                member.setSubcode(subcode5);
                member.setSubmarks(submarks5);
                reff.push().setValue(member);

                String subcode6 = sub6.getText().toString().trim();
                int submarks6 = Integer.parseInt(et6.getText().toString().trim());
                id6 = reff.getKey();

                member.setSubcode(subcode6);
                member.setSubmarks(submarks6);
                reff.push().setValue(member);

                String subcode7 = sub7.getText().toString().trim();
                int submarks7 = Integer.parseInt(et7.getText().toString().trim());
                id7 = reff.getKey();

                member.setSubcode(subcode7);
                member.setSubmarks(submarks7);
                reff.push().setValue(member);

                String subcode8 = sub8.getText().toString().trim();
                int submarks8 = Integer.parseInt(et8.getText().toString().trim());
                id8 = reff.getKey();

                member.setSubcode(subcode8);
                member.setSubmarks(submarks8);
                reff.push().setValue(member);
                Toast.makeText(subjects.this,"Data inserted",Toast.LENGTH_SHORT).show();


            }
        });

        btnview.setOnClickListener(new View.OnClickListener() {


            TextView a1,b1,c1,d1,e1,f1,g1,h1;


            public void onClick(View view) {

                a1 = (TextView)findViewById(R.id.et1);
                reff1 = FirebaseDatabase.getInstance().getReference().child("Member").child("-N7IC4PeTNHSnJo5_oON");
                reff1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String submarks1 = snapshot.child("submarks").getValue().toString();

                        a1.setText(submarks1);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                b1 = (TextView)findViewById(R.id.et2);
                reff2 = FirebaseDatabase.getInstance().getReference().child("Member").child("-N7IC4PwiQbepnm-QMu0");
                reff2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String submarks1 = snapshot.child("submarks").getValue().toString();

                        b1.setText(submarks1);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                c1 = (TextView)findViewById(R.id.et3);
                reff3 = FirebaseDatabase.getInstance().getReference().child("Member").child("-N7IC4Pyl1S1vwi2gA5P");
                reff3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String submarks1 = snapshot.child("submarks").getValue().toString();

                        c1.setText(submarks1);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                d1 = (TextView)findViewById(R.id.et4);
                reff4 = FirebaseDatabase.getInstance().getReference().child("Member").child("-N7IC4Q-PzqZ4BmuGIAy");
                reff4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String submarks1 = snapshot.child("submarks").getValue().toString();

                        d1.setText(submarks1);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                e1 = (TextView)findViewById(R.id.et5);
                reff5 = FirebaseDatabase.getInstance().getReference().child("Member").child("-N7IC4Q0fJrNlSHhTcRB");
                reff5.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String submarks1 = snapshot.child("submarks").getValue().toString();

                        e1.setText(submarks1);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                f1 = (TextView)findViewById(R.id.et6);
                reff6 = FirebaseDatabase.getInstance().getReference().child("Member").child("-N7IC4Q105yWfV1Xg5-W");
                reff6.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String submarks1 = snapshot.child("submarks").getValue().toString();

                        f1.setText(submarks1);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                g1 = (TextView)findViewById(R.id.et7);
                reff7 = FirebaseDatabase.getInstance().getReference().child("Member").child("-N7IC4Q2W2NmpXaKBpUK");
                reff7.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String submarks1 = snapshot.child("submarks").getValue().toString();

                        g1.setText(submarks1);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });



                h1 = (TextView)findViewById(R.id.et8);

                reff8 = FirebaseDatabase.getInstance().getReference().child("Member").child("-N7IC4Q3qcFJKHf__rfx");
                reff8.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String submarks1 = snapshot.child("submarks").getValue().toString();

                        h1.setText(submarks1);

                    }


                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


            }
        });

    }


}