package practica_min_1.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josean on 12/11/2017.
 */
public class User {

    private int id;
    private String username;
    private String password;
    private int atk, def, vit;
    private List<Item> items;

    //Constructors

    public User() {
        this.items = new ArrayList<>();
    }

    public User(int id, String username, String password, int atk, int def, int vit){
        this.id=id;
        this.username=username;
        this.password=password;
        this.atk=atk;
        this.def=def;
        this.vit=vit;
        this.items= new ArrayList<>();
    }

    public User(int id, String username){
        this.id=id;
        this.username=username;
        this.items = new ArrayList<>();
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    //Getters and Setters, ahora de los items (lista)

    public void setItem (Item item){
        this.items.add(item);
    }

    public Item getItem (int id){
        for(Item i; this.items) {
            if (i.getId() == id) return i;
        }
        return null;
    }


}
