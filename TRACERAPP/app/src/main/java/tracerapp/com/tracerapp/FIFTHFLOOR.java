package tracerapp.com.tracerapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;


public class FIFTHFLOOR extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fifthfloor);

        Button a1 = (Button) findViewById(R.id.button8);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM52.class));
            }
        });

        Button a2 = (Button) findViewById(R.id.button9);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM53.class));
            }
        });

        Button a3 = (Button) findViewById(R.id.button10);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM54.class));
            }
        });

        Button a4 = (Button) findViewById(R.id.button11);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM55.class));
            }
        });

        Button a5 = (Button) findViewById(R.id.button12);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM56.class));
            }
        });

        Button a6 = (Button) findViewById(R.id.button);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM57.class));
            }
        });

        Button a7 = (Button) findViewById(R.id.button2);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM58.class));
            }
        });

        Button a8 = (Button) findViewById(R.id.button13);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, TITLE.class));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fifthfloor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_fifthfloor, container, false);
            return rootView;
        }
    }
}
