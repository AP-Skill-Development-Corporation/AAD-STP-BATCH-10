package com.muneiah.roomdbwithemployeelog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {
    Context ctx;
    List<EmployeeEntity> list;

    public EmployeeAdapter(Context ctx, List<EmployeeEntity> list) {
        this.ctx = ctx;
        this.list = list;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(ctx).inflate(R.layout.every_row_design,parent,false);
        return new EmployeeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
    holder.n.setText(list.get(position).getName());
    holder.i.setText(list.get(position).getId());
    holder.d.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MainActivity.database.employeeDAO().delete(list.get(position));
        }
    });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder {
        TextView e,d,n,i;
        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            e=itemView.findViewById(R.id.tv_edit);
            d=itemView.findViewById(R.id.tv_delete);
            n=itemView.findViewById(R.id.tv_name);
            i=itemView.findViewById(R.id.tv_id);
        }
    }
}
