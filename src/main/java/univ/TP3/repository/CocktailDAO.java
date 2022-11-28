package univ.TP3.repository;

import org.springframework.stereotype.Repository;
import univ.TP3.ICocktailDAO;
import univ.TP3.model.Cocktail;
import java.util.ArrayList;
import java.util.List;



@Repository
public class CocktailDAO implements ICocktailDAO {


    private List<Cocktail> cocktails = new ArrayList<>();


    public List<Cocktail> findAll(){
        return cocktails;
    }

    public Cocktail findById(int id){
        for (int i = 0; i < cocktails.size(); i++) {
            if (cocktails.get(i).getId() == (id)) {
                return cocktails.get(i);
            }
        }
        return null;
    }


    public List<Cocktail> save(Cocktail cocktail){

        Cocktail cocktailtmp = new Cocktail();
        cocktailtmp.setDifficulte(cocktail.getDifficulte());
        cocktailtmp.setIngredients(cocktail.getIngredients());
        cocktailtmp.setNom(cocktail.getNom());
        cocktails.add(cocktailtmp);
        return cocktails;

    }

    public List<Cocktail> delete(int id) {
        cocktails.removeIf(cocktail -> cocktail.getId() == id);
        return cocktails;

    }

    public Cocktail update(int id, Cocktail cocktail){
        Cocktail tmp = null;

        for(int i = 0; i < cocktails.size(); i++) {
            Cocktail c = cocktails.get(i);
            if (c.getId() == id) {

                cocktails.get(i).setDifficulte(cocktail.getDifficulte());
                cocktails.get(i).setIngredients(cocktail.getIngredients());
                cocktails.get(i).setNom(cocktail.getNom());
                tmp = cocktails.get(i);

            }
        }

        return tmp;
    }

    @Override
    public List<Cocktail> findByName(String nom) {

        if(!cocktails.isEmpty()) {
            ArrayList<Cocktail> tmp = new ArrayList<>();
            for(Cocktail c : cocktails){
                if(c.getNom().equals(nom))
                    tmp.add(c);
            }
            return tmp;

        }
        return null;
    }

    @Override
    public List<Cocktail> create(){

        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("rhum blanc");
        ingredients.add("rhum ambré");
        ingredients.add("jus d'ananas");
        ingredients.add("lait de coco");

        cocktails.add(new Cocktail(ingredients, "pina colada", 2));

       ingredients.clear();
       ingredients.add("cointreau");
       ingredients.add("champagne");
       ingredients.add( "citron vert");
       ingredients.add("sucre de cane");

       cocktails.add(new Cocktail(ingredients, "soupe de champagne", 2));



       return cocktails;

    }



}