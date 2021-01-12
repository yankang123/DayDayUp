package com.example.daydayup.Ui.register;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daydayup.DayDayApplication;
import com.example.daydayup.R;
import com.example.daydayup.logic.model.reg_frag_item;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Reg_Adapter extends RecyclerView.Adapter<Reg_Adapter.ViewHolder> {
private List<reg_frag_item> cardList;


public Reg_Adapter(List list){
    cardList=list;
}
  public static class ViewHolder extends RecyclerView.ViewHolder{
    TextView textView;
    ImageView imageView;
    TextView textView2;
    DrawhookView drawhookView;
    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      textView=itemView.findViewById(R.id.reg_frag_text1);
      imageView=itemView.findViewById(R.id.reg_frag_image);
      textView2=itemView.findViewById(R.id.reg_frag_text2);
      drawhookView=itemView.findViewById(R.id.hook);
    }
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.regfrag_item,parent,false);
ViewHolder viewHolder=new ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
    reg_frag_item  regitem=cardList.get(position);
holder.textView.setText(regitem.getText1());
holder.textView2.setText(regitem.getText2());
holder.imageView.setImageResource(regitem.getImageId());
holder.itemView.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
holder.drawhookView.setVisibility(View.VISIBLE);
  }
});
  }

  @Override
  public int getItemCount() {
    return cardList.size();
  }
}
