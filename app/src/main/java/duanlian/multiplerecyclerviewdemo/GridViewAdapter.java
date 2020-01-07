package duanlian.multiplerecyclerviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by guokun on 2017/1/7.
 * Description:
 *
 * @param
 * @return
 */
public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private List<Integer> list;

    public GridViewAdapter(Context context, List<Integer> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.item_girl_gridview, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_cover);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        Glide.with(context).load(list.get(position)).into(imageView);
        textView.setText("美女" + position);
        return view;
    }
}
