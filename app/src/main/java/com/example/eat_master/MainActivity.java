package com.example.eat_master;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.favorite:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.kind_of_food:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.wallet:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.recentapp:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutop, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem itemtop) {
        int id = itemtop.getItemId();
        switch (id) {
            case R.id.setting_menu:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                //getSupportFragmentManager().beginTransaction().add(R.id.frameLayout,new qrcode()).commit();
                return true;
            case R.id.logout_menu:
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();

            case R.id.profile_menu:
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(itemtop);
        }
    }

}
