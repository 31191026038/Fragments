package khiemhg1202.com.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void updateContent(int position){
        ContentFrag content = (ContentFrag) getSupportFragmentManager().findFragmentById(R.id.ContentFrag);
        content.updateContent(position);
    }
}