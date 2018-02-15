package co.gamespay.www.androidrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by firoz on 15-02-2018.
 */


public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder>
{


    //Created constructor class and getting context
    private  Context context;
    private  User[] data; //Storing User Data
    public ProgrammingAdapter(Context context, User[] data)
    {
        //Assign data
        this.context = context;
        this.data = data;
    }
    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Returning view holder using LayoutInflater class
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {

        User user = data[position]; //Here we get user data which we have to bind in view
        //Binding text title
        holder.txtTitle.setText(user.getLogin());
        //Binding Image view using GLIDE library
        Glide.with(holder.imgIcon.getContext()).load(user.getAvatarUrl()).into(holder.imgIcon);
    }

    @Override
    public int getItemCount() {
        //Giving data count
        return data.length;
    }

    //Adding view holder class
    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        //Adding reference of image view and text view
        ImageView imgIcon;
        TextView txtTitle;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            //Finding views and assign tem
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
        }
    }
}
