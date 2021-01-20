package com.example.spark;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
    public class CustomerAdapter extends ArrayAdapter<Cust> {
        public CustomerAdapter(Context context, List<Cust> objects){
            super(context,0,objects);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            // return super.getView(position, convertView, parent);
            Cust currentCustomer=getItem(position);
            View listitem=convertView;
            if(listitem==null){
                listitem= LayoutInflater.from(getContext()).inflate(R.layout.custom_adapter,parent,false);
            }
            TextView Lname=(TextView)listitem.findViewById(R.id.name);
            Lname.setText(currentCustomer.getmCustomerName());
            TextView bal=(TextView)listitem.findViewById(R.id.balance);
            bal.setText(""+currentCustomer.getmBalance());
            TextView Acno=(TextView)listitem.findViewById(R.id.acno);
            Acno.setText(currentCustomer.getmAccountNumber());
            return listitem;
        }
    }
