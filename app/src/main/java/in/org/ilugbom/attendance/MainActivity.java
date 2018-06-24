package in.org.ilugbom.attendance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.widget.AdapterView.*;
import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

   // GridView gridView;
   static final String[] numbers = new String[120];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<120;i++)
        {
            numbers[i] = String.format("%d",i+1);
        }


        List<String> list = new ArrayList<String>(Arrays.asList(numbers));
        GridView grid = (GridView) findViewById(R.id.gridview);
        grid.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, list));

       grid.onitem


    }

}
