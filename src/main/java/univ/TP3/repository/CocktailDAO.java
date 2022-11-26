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



    public Cocktail save(Cocktail cocktail){

        Cocktail cocktailtmp = new Cocktail();
        cocktailtmp.setId(cocktail.getId());
        cocktailtmp.setDifficulte(cocktail.getDifficulte());
        cocktailtmp.setIngredients(cocktail.getIngredients());
        cocktailtmp.setNom(cocktail.getNom());
        cocktails.add(cocktailtmp);
        return cocktailtmp;

    }

    public String delete(int id) {
        cocktails.removeIf(cocktail -> cocktail.getId() == id);
        return null;

    }

    public Cocktail update(Cocktail cocktail){
        Cocktail tmp = null;
        for(int i = 0; i < cocktails.size(); i++) {

            Cocktail c = cocktails.get(i);

            if (c.getId() == cocktail.getId()) {
                cocktails.set(i, cocktail);
                 tmp= cocktails.get(i);
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

}