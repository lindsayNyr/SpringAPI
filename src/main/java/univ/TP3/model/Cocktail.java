package univ.TP3.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import univ.TP3.Singleton;

import java.util.ArrayList;
import java.util.List;

import static univ.TP3.Singleton.*;

@Component
public class Cocktail {


    private int id;

    private List<String> ingredients;
    private String nom;
    private int difficulte;

    public Cocktail(ArrayList<String >ingredients, String nom, int difficulte){

        this.id = Singleton.getInstance().getId();
        this.ingredients = ingredients;
        this.nom = nom;
        this.difficulte = difficulte;

    }

    public Cocktail(){
        this.id = Singleton.getInstance().getId();
    }

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