package univ.TP3;

import univ.TP3.model.Cocktail;

import java.util.List;

public interface ICocktailDAO {





    List<Cocktail> findAll();

    Cocktail findById(int id);

    Cocktail save(Cocktail cocktail);

    String delete(int id);

    Cocktail update(Cocktail cocktail);

    List<Cocktail> findByName(String nom);
}