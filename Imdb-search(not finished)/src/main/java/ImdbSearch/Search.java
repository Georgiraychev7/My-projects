package ImdbSearch;

import Items.Product;
import Items.Season;
import Items.VideoGame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Search {

    private static List<Product> products = new ArrayList<>();

    public Search(List<Product> products){
        this.products = products;
    }

    public Season searchSeasonByTitle(List<Season>seasons, String title){
        for(Season season : seasons){
            if(season != null && season.getTitle().equalsIgnoreCase(title)){
                return season;
            }
        }
        throw new NoSuchElementException();
    }

    public void returnTitlesOfActionVideoGame(List<Product>products){
        for(Product product : products){
            if(product instanceof VideoGame){
                System.out.println(product.getTitle());
            }
        }
    }

    public List<Product> createNewListWithActionProductWithRatingMoreThanFive(List<Product> products){
        List<Product> result = new LinkedList<>();
        for(Product product : products){
            if(product.rating > 5 && product.getGenre().equalsIgnoreCase("Action")){
                result.add(product);
            }
        }
        return result;
    }

    public Product searchProductByTitle(List<Product> products,String title){
        for (Product product : products){
            if (product != null && product.getTitle().equalsIgnoreCase(title)){
                return product;
            }
        }
        throw new NoSuchElementException();
    }

    public Product searchProductByGenre(List<Product> products,String genre){
        for(Product product : products){
            if(product != null && product.getGenre().equalsIgnoreCase(genre)){
                return product;
            }
        }
        throw new NoSuchElementException();
    }

    public Product searchProductByRating(List<Product> products,double rating){
        for(Product product : products){
            if(product.getRating() == rating){
                return product;
            }
        }
        throw new NoSuchElementException();
    }

}
