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
   static final String[] numbers = new String[120];
    String selectedItem;
    TextView GridViewItems,BackSelectedItem;
    int backposition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<120;i++)
        {
            numbers[i] = String.format("%d",5000+i+1);
        }


        final List<String> list = new ArrayList<String>(Arrays.asList(numbers));
        final GridView gridView = (GridView) findViewById(R.id.gridview);

        gridView.setAdapter(new TextAdapter(this));

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

                if (backposition != -1)
                {

                    BackSelectedItem.setSelected(false);

                    BackSelectedItem.setBackgroundColor(Color.parseColor("#fbdcbb"));

                    BackSelectedItem.setTextColor(Color.parseColor("#040404"));
                }

                backposition = position;


            }
        });

    }

         class TextAdapter extends BaseAdapter
        {

            Context context;

            public TextAdapter(Context context)
            {
                this.context = context;
            }

            @Override
            public int getCount() {

                return numbers.length;
            }

            @Override
            public Object getItem(int position) {
                // TODO Auto-generated method stub

                return numbers[position];
            }

            @Override
            public long getItemId(int position) {

                // TODO Auto-generated method stub

                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                // TODO Auto-generated method stub

                TextView text = new TextView(this.context);

                text.setText(numbers[position]);

                text.setGravity(Gravity.CENTER);

                text.setBackgroundColor(Color.parseColor("#fbdcbb"));

                text.setTextColor(Color.parseColor("#040404"));

              //  text.setLayoutParams(new GridView.LayoutParams(144, 144));


                return text;

            }


        }



    }


