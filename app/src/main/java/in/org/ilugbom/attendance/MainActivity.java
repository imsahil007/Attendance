package in.org.ilugbom.attendance;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.widget.AdapterView.*;
import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    // GridView gridView;

    String selectedItem;
    TextView GridViewItems, BackSelectedItem;
    int backposition = -1;
    TextAdapter TA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TA= new TextAdapter(this);
        final GridView gridView = (GridView) findViewById(R.id.gridview);

        gridView.setAdapter(TA);

        for(int i=0;i<120;i++)
        {
            TA.numbers[i] = String.format("%d",5000+i+1);

        }

        //TA.numbers[0]="Test";
        gridView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                selectedItem = parent.getItemAtPosition(position).toString();

                GridViewItems = (TextView) view;

                GridViewItems.setBackgroundColor(Color.parseColor("#814f00"));

                GridViewItems.setTextColor(Color.parseColor("#fdfcfa"));

                BackSelectedItem = (TextView) gridView.getChildAt(backposition);

                if (backposition != -1) {

                    BackSelectedItem.setSelected(false);

                    BackSelectedItem.setBackgroundColor(Color.parseColor("#fbdcbb"));

                    BackSelectedItem.setTextColor(Color.parseColor("#040404"));
                }

                backposition = position;


            }
        });

    }
}




