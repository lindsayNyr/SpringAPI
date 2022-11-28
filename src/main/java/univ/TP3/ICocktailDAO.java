package univ.TP3;

import univ.TP3.model.Cocktail;

import java.util.List;

public interface ICocktailDAO {


    List<Cocktail> findAll();

    Cocktail findById(int id);

    List<Cocktail> save(Cocktail cocktail);

    List<Cocktail> delete(int id);

    Cocktail update(int id, Cocktail cocktail);

    List<Cocktail> findByName(String nom);

    List<Cocktail> create();


}