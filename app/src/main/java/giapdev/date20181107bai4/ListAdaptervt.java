package giapdev.date20181107bai4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdaptervt extends ArrayAdapter<sinhvien> {
    public ListAdaptervt(Context context, int textviewresourseid){
        super(context,textviewresourseid);
    }
    public ListAdaptervt(Context context, int resourse,List<sinhvien> items){
        super(context,resourse,items);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parrent){
    View v = convertView;
        if(v==null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.layout,null);
        }
sinhvien p= getItem(position);
    if(p!=null){
        TextView tt1 = (TextView)v.findViewById(R.id.xtx2);
        tt1.setText(p.ten1);
    }
    return v;
}}
