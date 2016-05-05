package example.codeclan.com.recipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView mains;
    String[] titles = {"Salmon en Croute","Posh Baked Beans", "Moules Marinieres"};
    String[] ingredients = {"recipe ingredients","recipe ingredients","recipe ingredients"};
    String[] method = {"At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est.","\n" +
            "At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est.","\n" +
            "At postea facilisis vel. Ex augue reprimique cum, vis duis graece electram ei. Voluptatum dissentiunt an ius, ridens omnium eloquentiam nec at. Malorum tractatos cu est."};
    int[] images = {R.drawable.salmoncroute,R.drawable.beans,R.drawable.moules};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);

        mains = (ListView)findViewById(R.id.mainListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,titles);
        mains.setAdapter(adapter);
        mains.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(MainActivity.this, "showing recipe for:  " + titles[i], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, RecipeDetails.class);
                intent.putExtra("Titles",titles[i]);
                intent.putExtra("Ingredients",ingredients[i]);
                intent.putExtra("Method",method[i]);
                intent.putExtra("Photo", images[i]);
                startActivity(intent);
            }

        });
    }
}


