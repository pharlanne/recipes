package example.codeclan.com.recipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DessertActivity extends AppCompatActivity {

    ListView desserts;
    String[] titles = {"Gateau Opera","Baba au Rhum", "Tarte Fine"};
    String[] ingredients = {"recipe ingredients","recipe ingredients","recipe ingredients"};

    String[] method = {"At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est.","\n"+
            "At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est.","\n"+
            "At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est.","\n"};
    int[] images = {R.drawable.opera,R.drawable.baba,R.drawable.tarte};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        desserts = (ListView)findViewById(R.id.dessertListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,titles);
        desserts.setAdapter(adapter);
        desserts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(DessertActivity.this, "showing recipe for:  " + titles[i], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DessertActivity.this, RecipeDetails.class);
                intent.putExtra("Titles",titles[i]);
                intent.putExtra("Ingredients",ingredients[i]);
                intent.putExtra("Method",method[i]);
                intent.putExtra("Photo", images[i]);
                startActivity(intent);
            }

        });
    }
}

