package Project.PBM;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void Makanan (View view){
        Intent intent = new Intent(MenuActivity.this,MakananActivity.class);
        startActivity(intent);
    }
    public void Kebudayaan (View view){
        Intent intent = new Intent(MenuActivity.this,KebudayaanActivity.class);
        startActivity(intent);
    }
}
