package github.hemathajay.com.android_contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        press=(TextView) findViewById(R.id.press);
        registerForContextMenu(press);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }

    public boolean onContextItemSelected(MenuItem item) {
        //find out which menu item was pressed
        switch (item.getItemId()) {
            case R.id.option1:
                doOptionOne();
                return true;
            case R.id.option2:
                doOptionTwo();
                return true;
            default:
                return false;
        }
    }
    private void doOptionOne() {
        Toast.makeText(this, "Option One Chosen...", Toast.LENGTH_LONG).show();
    }

    private void doOptionTwo() {
        Toast.makeText(this, "Option Two Chosen...", Toast.LENGTH_LONG).show();
    }
}
