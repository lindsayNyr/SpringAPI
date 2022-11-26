package univ.TP3.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Cocktail {

    @Id
    private int id;

    private List<String> ingredients;
    private String nom;
    private int difficulte;


    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}