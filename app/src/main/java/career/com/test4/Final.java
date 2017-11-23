package career.com.test4;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by Ramees on 11/23/2017.
 */

public class Final extends AppCompatActivity {
    private static final String urlday = "http://mausam.co";
    private String keyword;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sam);
    }
}
