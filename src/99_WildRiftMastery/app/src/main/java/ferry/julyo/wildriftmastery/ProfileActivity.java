package ferry.julyo.wildriftmastery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class ProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
    }

    public void onClickBack(View view) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
        finish();
    }
}