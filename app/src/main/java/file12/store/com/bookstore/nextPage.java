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
import android.widget.TextView;

/**
 * Created by sharad on 1/23/2016.
 */
public class nextPage extends AppCompatActivity {
    public nextPage() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextpage);
        TextView text1=(TextView)findViewById(R.id.textView6);
        TextView text2=(TextView)findViewById(R.id.textView7);
        TextView text3=(TextView)findViewById(R.id.textView8);
        TextView text4=(TextView)findViewById(R.id.textView9);
        Intent intent = getIntent();
        String str= "City:" + intent.getStringExtra("city");
        String str1= "Service:" + intent.getStringExtra("service");
        String str2= "mobile:" + intent.getStringExtra("mobile");
        String str3= "Address:" + intent.getStringExtra("address");
        text1.setText(str);
        text2.setText(str1);
        text3.setText(str2);
        text4.setText(str3);

    }
}
