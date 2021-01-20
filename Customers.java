package com.example.spark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Customers extends AppCompatActivity {
    ListView customerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_main);
        customerList = (ListView) findViewById(R.id.list);

        DataBase dab = new DataBase(this);

        dab.addOne(new Cust("Lekha", "UNO12345566", 1000000.00));
        dab.addOne(new Cust("Pavan", "UNO12345567", 2000000.00));
        dab.addOne(new Cust("sunitha", "UNO12345565", 3050000.00));
        dab.addOne(new Cust("prasad", "UNO12345560", 9002000.00));
        dab.addOne(new Cust("jhanavi", "UNO12345564", 4000000.00));
        dab.addOne(new Cust("vivek sai", "UNO12345561", 4050000.00));
        dab.addOne(new Cust("rohith sai", "UNO12345599", 1056700.00));
        dab.addOne(new Cust("harsha", "UNO12345598", 1043200.00));
        dab.addOne(new Cust("lilly", "UNO12345597", 1023400.00));
        dab.addOne(new Cust("nikil", "UNO12345544", 5056700.00));
        dab.addOne(new Cust("yaswath", "UNO12345500", 20777004.00));


        List<Cust> customers = dab.selectAll();
        CustomerAdapter cadpt = new CustomerAdapter(this, customers);
        customerList.setAdapter(cadpt);
        customerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}