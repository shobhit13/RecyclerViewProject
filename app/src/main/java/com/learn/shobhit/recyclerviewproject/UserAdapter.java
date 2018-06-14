package com.learn.shobhit.recyclerviewproject;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{
    private List<User> itemsList;

    Intent i;
    public UserAdapter(List<User> itemsList){
        this.itemsList = itemsList;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, quality, phone;
        ImageView image;
        public MyViewHolder(View view) {
            super(view);
            final Context context = view.getContext();
            title = (TextView) view.findViewById(R.id.titleText);
            quality = (TextView) view.findViewById(R.id.descpText);
            image = (ImageView) view.findViewById(R.id.hi);
            phone = (TextView) view.findViewById(R.id.phone);
            view.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    String recyclerViewTitle = title.getText().toString();
                    String email = quality.getText().toString();
                    Toast.makeText(context, email, Toast.LENGTH_SHORT).show();
 /*                   if(recyclerViewTitle.equals("Apollo 11")){

                        i = new Intent(context, ApolloActivity.class);
                        context.startActivity(i);

                    }else if(recyclerViewTitle.equals("Apollo 13")){
                        i = new Intent(context, Apollo_13.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Apollo 12")){
                        i = new Intent(context, Apollo_12.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Dark Energy")){
                        i = new Intent(context, DarkEnergyActvity.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Black Hole Video")){
                        i = new Intent(context, BlackHolevid.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Black Holes")){
                        i = new Intent(context, BlackHoleActivity.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Dark Energy Quiz")){
                        i = new Intent(context, DarkEnergyActvityforQuiz.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("The Theory of Relativity")){
                        System.out.println("The theory of relativity");
                    }else if(recyclerViewTitle.equals("Dark Matter") || recyclerViewTitle.equals("The discovery of Dark Matter")){
                        i = new Intent(context, DarkMatterInfo.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Dark Energy") || recyclerViewTitle.equals("The discovery of Dark Energy")){
                        i = new Intent(context, DarkEnergyActvity.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Juno")){
                        i = new Intent(context, Juno.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Mars")){
                        i = new Intent(context, MarsActivity.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Earth")){
                        i = new Intent(context, EarthActivity.class);
                        context.startActivity(i);
                    }else if(recyclerViewTitle.equals("Titan")){
                        i = new Intent(context, TitanActivity.class);
                        context.startActivity(i);
                    }
                }
                */
                }
            });
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_list_row, parent, false);

        WindowManager windowManager = (WindowManager)parent.getContext().getSystemService(Context.WINDOW_SERVICE);
        itemView.setLayoutParams(new RecyclerView.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT));


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        User user = itemsList.get(position);
        holder.title.setText(user.getName());
        holder.quality.setText(user.getEmail());
        holder.phone.setText(user.getPhone());
        Picasso.get().load(user.getPhotoUrl()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public void setFilter(List<User> itemList) {
        itemsList = new ArrayList<>();
        itemsList.addAll(itemList);
        notifyDataSetChanged();
    }
}