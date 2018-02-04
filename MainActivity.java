package r.ferdy.gooddy;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity
       implements NavigationView.OnNavigationItemSelectedListener
{
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle Toggle;
    private ImageButton button, button2, button3, button4, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.tabung);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tabungactivity = new Intent(MainActivity.this, activity_tabung.class);
                tabungactivity.putExtra("dataAngka", "123");
                tabungactivity.putExtra("dataSring", "isidata");
                tabungactivity.putExtra("datafloat", "321");
                startActivity(tabungactivity);
            }
        });
        button4 = findViewById(R.id.sama);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent samaActivity = new Intent(MainActivity.this, activity_sama.class);
                samaActivity.putExtra("dataAngka", "123");
                samaActivity.putExtra("dataString", "isidata");
                samaActivity.putExtra("datafloat", "321");
                startActivity(samaActivity);
            }
        });
        button3 = findViewById(R.id.smile);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smileActivity = new Intent(MainActivity.this, activity_smile.class);
                smileActivity.putExtra("dataAngka", "123");
                smileActivity.putExtra("dataString", "isidata");
                smileActivity.putExtra("datafloat", "321");
                startActivity(smileActivity);
            }
        });
        button2 = findViewById(R.id.myself);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent myselfActivity = new Intent(MainActivity.this, activity_myself.class);
                myselfActivity.putExtra("dataAngka", "123");
                myselfActivity.putExtra("dataString", "isidata");
                myselfActivity.putExtra("datafloat", "321");
                startActivity(myselfActivity);
            }
        });

        button = findViewById(R.id.smart2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent smartActivity = new Intent(MainActivity.this, activity_smart.class);
                smartActivity.putExtra("dataAngka", "123");
                smartActivity.putExtra("dataString", "isidata");
                smartActivity.putExtra("datafloat", "321");
                startActivity(smartActivity);
            }
        });


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Replace with your own", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         drawerLayout= findViewById(R.id.drawer);

        Toggle=new ActionBarDrawerToggle(this,drawerLayout, R.string.Open, R.string.Close);
        drawerLayout.addDrawerListener(Toggle);
        Toggle.syncState();

          NavigationView navigationView = findViewById(R.id.nav_menu);
              navigationView.setNavigationItemSelectedListener(this);

          //  FragmentManager fragmentManager = getFragmentManager();
        //  fragmentManager.beginTransaction().replace(R.id.main_frame, new FirstFragment()).commit();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("Anda yakin ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      int id = item.getItemId();
    if (Toggle.onOptionsItemSelected(item)){
      return true;
    } else if (id == R.id.setting){
          return true;
     }
    return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item){
      FragmentManager fragmentManager = getFragmentManager();

    int id = item.getItemId();
    if (id == R.id.home){
      fragmentManager.beginTransaction().replace(R.id.main_frame, new FirstFragment()).commit();
    }  else if (id == R.id.video){
      fragmentManager.beginTransaction().replace(R.id.main_frame,  new SecondFragment()).commit();

    } else if (id == R.id.galery){
      fragmentManager.beginTransaction().replace(R.id.main_frame, new ThirdFragment()).commit();
    }else if (id == R.id.setting){
        fragmentManager.beginTransaction().replace(R.id.main_frame, new FourFragment()).commit();

    } else if (id == R.id.logout){
        new AlertDialog.Builder(this)
                .setMessage("Anda yakin ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
    DrawerLayout drawerLayout = findViewById(R.id.drawer);
    drawerLayout.closeDrawer(GravityCompat.START);
    return true;
    }

}