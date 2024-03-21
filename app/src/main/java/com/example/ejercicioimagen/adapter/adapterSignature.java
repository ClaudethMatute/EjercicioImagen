package com.example.ejercicioimagen.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejercicioimagen.R;
import com.example.ejercicioimagen.models.Fotografia;

import java.util.ArrayList;

public class adapterSignature extends RecyclerView.Adapter<adapterSignature.adapterSignatureViewHolder>
{
    private ArrayList<Fotografia> oSignatureList;

    public adapterSignature(ArrayList<Fotografia> oSignatureList) {
        this.oSignatureList = oSignatureList;
    }

    @NonNull
    @Override
    public adapterSignatureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_photograh,parent,false);
        return new adapterSignatureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterSignatureViewHolder holder, int position)
    {
        holder.oTextView.setText(oSignatureList.get(position).getDescripcion());
        Log.e("FIRMA",oSignatureList.get(position).getFoto().toString());
        holder.oSignatureView.setImageBitmap(oSignatureList.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return oSignatureList.size();
    }

    public class adapterSignatureViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView oSignatureView;
        private TextView oTextView;
        public adapterSignatureViewHolder(@NonNull View itemView)
        {
            super(itemView);
            oSignatureView = itemView.findViewById(R.id.signature_view_list);
            oTextView = itemView.findViewById(R.id.txtDetalleSignatureList);
        }
    }
}
