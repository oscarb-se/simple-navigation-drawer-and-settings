package se.oscarb.simplenavigationdrawerandsettings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Alternativen för vår Navigation Drawer
        String[] navigationItems = {"Home", "Settings"};

        // Adapter för att kunna skicka strängar till en ListView
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navigationItems);

        // Hämta ListView och säg att den ska använda adaptern ovan
        ListView navigationListView = (ListView) findViewById(R.id.navigation_drawer_list);
        navigationListView.setAdapter(stringArrayAdapter);

        // TODO: Lägg till så att det händer något när man klickar på ett val
        // TODO: Öppna upp en PreferencesActivity
        // TODO: Skapa en PreferencesActivity

    }
}
