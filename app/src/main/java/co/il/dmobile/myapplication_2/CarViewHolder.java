package co.il.dmobile.myapplication_2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    public CardView card;
    public ImageView image;
    public TextView brand;
    public TextView model;
    public TextView year;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        card = itemView.findViewById(R.id.card);
        image = itemView.findViewById(R.id.image);
        brand = itemView.findViewById(R.id.brand);
        model = itemView.findViewById(R.id.model);
        year = itemView.findViewById(R.id.year);

    }


    }
