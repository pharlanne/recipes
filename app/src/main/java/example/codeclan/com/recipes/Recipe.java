package example.codeclan.com.recipes;

import java.io.Serializable;

/**
 * Created by user on 29/04/2016.
 */

    public class Recipe implements Serializable {

        private String mTitle;
        private String mIngredients;
        private String mMethod;
        private String mPhoto;


        public Recipe()
        {

        }
        public Recipe(String title)
        {
            this();
            mTitle = title;
        }

        public Recipe(String title,String ingredients,  String method, String photo)
        {
            this();
            mTitle = title;
            mIngredients = ingredients;
            mMethod = method;
            mPhoto = photo;

        }

        public String getTitle() {
            return mTitle;
        }

        public void setTitle(String nTitle) {
            mTitle = nTitle;
        }

        public String getIngredients() {return mIngredients;}

        public void setIngredients(String ingredients) {mIngredients = ingredients;}

        public String getMethod() { return mMethod; }

        public void setMethod(String method) { mMethod = method;}

        public String getPhoto(String photo) {return mPhoto;}

        public void setPhoto(String photo) {mPhoto = photo;}
    }