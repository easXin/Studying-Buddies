package demo.app.a442projects_team_buddies;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CourseViewActivity extends AppCompatActivity {
    private DrawerLayout drawLayout;
    private ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawLayout = findViewById(R.id.drawerLayout);

        toggle = new ActionBarDrawerToggle(this,drawLayout,R.string.open,R.string.close);
        drawLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }



    public void myProfile(MenuItem menuItem) {
        //Intent intent = new Intent(CourseViewActivity.this, ProfileActivity.class);
        //startActivity(intent);
        setContentView(R.layout.profile_page);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
