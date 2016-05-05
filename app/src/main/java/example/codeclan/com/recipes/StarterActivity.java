package example.codeclan.com.recipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class StarterActivity extends AppCompatActivity {

    ListView starters;
    String[] titles = {"Cheese Souffle","Smoked Salmon Toast","Fines de Claire"};
    String[] ingredients = {"", "second recipe ingredients","third recipe ingredients"};
    String[] method = {
            "At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est.", "\n" +
            "At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est.", "\n" +
            "At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est."};
    int[] images = {R.drawable.souffle,R.drawable.smokedsalmon,R.drawable.oysters};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);


        starters = (ListView)findViewById(R.id.starterListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,titles);
        starters.setAdapter(adapter);
        starters.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(StarterActivity.this, "showing recipe for:  " + titles[i], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(StarterActivity.this, RecipeDetails.class);
                intent.putExtra("Titles",titles[i]);
                intent.putExtra("Ingredients",ingredients[i]);
                intent.putExtra("Method",method[i]);

                intent.putExtra("Photo", images[i]);



                startActivity(intent);
            }


        });
    }
}

