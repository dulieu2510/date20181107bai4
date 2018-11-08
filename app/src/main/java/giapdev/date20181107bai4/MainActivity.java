package giapdev.date20181107bai4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv1 = (ListView) findViewById(R.id.xlv1);
        ArrayList<sinhvien> arr = new ArrayList<sinhvien>();
        arr.add(new sinhvien("giap","vo trong giap"));
        arr.add(new sinhvien("giap2","vo trong giap"));
        arr.add(new sinhvien("giap3","vo trong giap"));
        ListAdaptervt art = new ListAdaptervt(MainActivity.this,R.layout.layout,arr);
        lv1.setAdapter(art);
    }
}
