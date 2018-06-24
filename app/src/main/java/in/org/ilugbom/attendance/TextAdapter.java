package in.org.ilugbom.attendance;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by milind on 24/6/18.
 */

public class TextAdapter extends BaseAdapter
{
    static final String[] numbers = new String[120];
     List<String> list = new ArrayList<String>();

    void TextAdapter()
    {

        list = new ArrayList<String>(Arrays.asList(numbers));

    }

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

        text.setTextSize(25);
     //   text.setLayoutParams(new GridView.LayoutParams(144, 144));


        return text;

    }


}





