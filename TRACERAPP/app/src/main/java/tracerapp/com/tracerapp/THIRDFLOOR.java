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


public class THIRDFLOOR extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_thirdfloor);

            Button my4 = (Button) findViewById(R.id.button);
            my4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(THIRDFLOOR.this, PHYSICSLAB.class));
                }
            });

            Button my5 = (Button) findViewById(R.id.button2);
            my5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(THIRDFLOOR.this, ROOM314.class));
                }
            });

            Button my6 = (Button) findViewById(R.id.button3);
            my6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(THIRDFLOOR.this, ICSL1.class));
                }
            });

            Button my7 = (Button) findViewById(R.id.button4);
            my7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(THIRDFLOOR.this, ICSL2.class));
                }
            });

            Button my8 = (Button) findViewById(R.id.button5);
            my8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(THIRDFLOOR.this, ICSL3.class));
                }
            });

            Button my9 = (Button) findViewById(R.id.button6);
            my9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(THIRDFLOOR.this, ICSL4.class));
                }
            });

            Button my10 = (Button) findViewById(R.id.button7);
            my10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(THIRDFLOOR.this, TITLE.class));
                }
            });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.thirdfloor, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_thirdfloor, container, false);
            return rootView;
        }
    }
}
