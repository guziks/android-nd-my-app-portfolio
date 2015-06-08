package ua.com.elius.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyButtonAction(View view) {
        doToast("This button will launch spotify streamer app!");
    }

    public void scoresButtonAction(View view) {
        doToast("This button will launch scores app!");
    }

    public void libraryButtonAction(View view) {
        doToast("This button will launch library app!");
    }

    public void bibButtonAction(View view) {
        doToast("This button will launch build it bigger app!");
    }

    public void xyzButtonAction(View view) {
        doToast("This button will launch xyz reader app!");
    }

    public void capstoneButtonAction(View view) {
        doToast("This button will launch capstone app!");
    }

    public void doToast(String message) {
        Toast.makeText(
                getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        ).show();
    }
}
