package co.gamespay.www.androidrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by firoz on 15-02-2018.
 */

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder>
{


    private  String[] data;

    public ProgrammingAdapter(String[] data)
    {
            this.data = data;
    }
    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ProgrammingViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title = data[position];
        holder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtTitle;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
        }
    }
}
