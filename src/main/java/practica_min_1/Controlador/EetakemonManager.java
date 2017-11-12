package practica_min_1.Controlador;

import practica_min_1.Modelo.Item;
import practica_min_1.Modelo.User;

import java.util.List;

/**
 * Created by Josean on 12/11/2017.
 */
public interface EetakemonManager {

        List<User> getAll();
        boolean set(User u);
        boolean edit(User u);
        User get(int id);
        List<Item> getItems(int userId);
        boolean setItem(int userId; Item i);

}
