package univ.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import univ.TP3.ICocktailDAO;
import univ.TP3.model.Cocktail;

import java.util.List;

@RestController
@RequestMapping("cocktails")
public class CocktailController {

    @Autowired
    private ICocktailDAO dao;

    @ResponseBody
    @GetMapping("/{id}")
    public Cocktail findById(@PathVariable int id) {
        return dao.findById(id);
    }


    @ResponseBody
    @GetMapping("/name/{nom}")
    public List<Cocktail> findByName(@PathVariable String nom) {
        return dao.findByName(nom);
    }


    @ResponseBody
    @GetMapping
    public List<Cocktail> findAll() {
        return dao.findAll();
    }


    @PostMapping
    public List<Cocktail> save(@RequestBody Cocktail cocktail ){
        return dao.save(cocktail);
    }

    @PostMapping("/create")
    public List<Cocktail> create(){return dao.create();}

    @DeleteMapping("{id}")
    public List<Cocktail> delete(@PathVariable int id ){
        return dao.delete(id);
    }

    @PutMapping("{id}")
    public Cocktail updateProduct(@PathVariable int id,@RequestBody Cocktail cocktail) {
        return dao.update(id, cocktail);
    }


}