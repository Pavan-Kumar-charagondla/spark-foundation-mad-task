package com.example.spark;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


    public class TransferMoney extends AppCompatActivity {
        EditText from1,to1,amount;
        Button pay;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.transfer_main);
            from1=(EditText)findViewById(R.id.f);
            to1=(EditText)findViewById(R.id.t);
            amount=(EditText)findViewById(R.id.m);
            pay=(Button)findViewById(R.id.pay);
            pay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DataBase t1=new DataBase(TransferMoney.this);
                    String msg=t1.TransferMoney(from1.getText().toString(),to1.getText().toString(),Double.parseDouble(amount.getText().toString()));
                    ClearText();
                    Toast.makeText(TransferMoney.this,msg,Toast.LENGTH_LONG).show();
                }
            });
        }
        public void ClearText(){
            from1.setText("");
            to1.setText("");
            //amount.setText(0);
        }
    }
