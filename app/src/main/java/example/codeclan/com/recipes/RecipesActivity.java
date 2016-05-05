package example.codeclan.com.recipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RecipesActivity extends AppCompatActivity {

//    private static final int REQUEST_CODE_FAVOURITES= 0;

    ListView recipes;
    String[] categories = {"Starters","Mains", "Desserts"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        getNotes();

    recipes = (ListView)findViewById(R.id.recipesListView);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,categories);
        recipes.setAdapter(adapter);
        recipes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(RecipesActivity.this, "showing you the " + categories[i], Toast.LENGTH_SHORT).show();

                if (categories[i].equals("Starters")) {
                    Intent intent = new Intent(RecipesActivity.this, StarterActivity.class);
                    startActivity(intent);
                }
                else if (categories[i].equals("Mains")){
                    Intent intent = new Intent(RecipesActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else if (categories[i].equals("Desserts")){
                    Intent intent = new Intent(RecipesActivity.this, DessertActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void getNotes()
    {
        String notePreferences  = NotePreferences.getStoredNotes(this);
    }

}
