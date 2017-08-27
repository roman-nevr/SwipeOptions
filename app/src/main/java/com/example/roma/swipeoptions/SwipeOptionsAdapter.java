package com.example.roma.swipeoptions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by roma on 27.08.17.
 */

public class SwipeOptionsAdapter extends RecyclerView.Adapter<SwipeOptionsAdapter.SwipeOptionsHolder> {
    private Context context;
    private List<OptionsItem> items;

    public SwipeOptionsAdapter(Context context, List<OptionsItem> items) {
        this.context = context;
        this.items = items;
        setHasStableIds(true);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).hashCode();
    }

    @Override
    public SwipeOptionsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item, parent, false);
        return new SwipeOptionsHolder(view);
    }

    @Override
    public void onBindViewHolder(SwipeOptionsHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class SwipeOptionsHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView imageView;

        public SwipeOptionsHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }

        void bind(OptionsItem item){
            text.setText(item.text);

            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.pic);
            Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.ic_assignment_ind_black_24dp);

            Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_assignment_ind_black_24dp);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);

//            imageView.setImageDrawable(drawable2);
            imageView.setImageDrawable(bitmapDrawable);
//            imageView.setImageBitmap(bitmap);
        }
    }
}
