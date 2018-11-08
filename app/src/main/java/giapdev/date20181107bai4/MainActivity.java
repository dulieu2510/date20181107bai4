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
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("list1");
        arr.add("list2");
        arr.add("list3");
        ArrayAdapter art = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arr);
        lv1.setAdapter(art);
    }
}
