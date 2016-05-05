package example.codeclan.com.recipes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 30/04/2016.
 */
public class RecipeDetails extends AppCompatActivity {
    TextView TitleText;
    TextView IngredientsText;
    TextView MethodText;
    ImageView FoodImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_details);
        Log.d("Recipe:", "RecipeDetails.onCreate called");

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String title = extras.getString("Titles");
        String ingredients = extras.getString("Ingredients");
        String method = extras.getString("Method");
        int photo = extras.getInt("Photo");


//        Picasso picasso = Picasso.with(this);
//        RequestCreator image = picasso.load(photo);
//        image.into(FoodImageView);

        TitleText = (TextView) findViewById(R.id.text_title);
        IngredientsText = (TextView)findViewById(R.id.text_ingredients);
        MethodText = (TextView) findViewById(R.id.text_method);
        FoodImageView = (ImageView) findViewById(R.id.item_image);



            TitleText.setText(title);
            IngredientsText.setText(ingredients);
            MethodText.setText(method);

            FoodImageView.setImageResource(photo);
            FoodImageView.bringToFront();
//            FoodImageView.setText(photo);

    }

    private void storeNotes(Context context)
    {

        NotePreferences.setStoredNotes(context,"notes");
    }
}
