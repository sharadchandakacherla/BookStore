package file12.store.com.bookstore;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Button btn =(Button)findViewById(R.id.button);
        final Spinner sp1=(Spinner)findViewById(R.id.spinner);
        final Spinner sp2=(Spinner)findViewById(R.id.spinner2);
        final EditText txt=(EditText)findViewById(R.id.editText);
        final EditText txt2=(EditText)findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener() {
            String str=sp1.getSelectedItem().toString();
            String str1=sp2.getSelectedItem().toString();


            @Override

            public void onClick(View v) {
                String str2=txt.getText().toString();
                String str3=txt2.getText().toString();
                Intent intent = new Intent(MainActivity.this,nextPage.class);
                intent.putExtra("city",str);
                intent.putExtra("service",str1);
                intent.putExtra("mobile",str2);
                intent.putExtra("address",str3);
                startActivity(intent);
            }
        });






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
}
