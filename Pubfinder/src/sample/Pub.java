package sample;

/**
 * Created by Marco on 15-09-27.
 */
public class Pub {
    int id;
    int age;
    int open;
    int close;
    String name;
    String picture;
    String location;
    String type;
    String street;
    String city;
    int zip;

    public Pub(int id, int age, int open, int close, String name, String picture, String location, String type, String street, String city, int zip) {
        this.id = id;
        this.age = age;
        this.open = open;
        this.close = close;
        this.name = name;
        this.picture = picture;
        this.location = location;
        this.type = type;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }
    public static int getIndexById(int id)
    {
        int index = 0;
        for(Pub pub : PubDataAccessor.pubs)
        {
            if (id == pub.id){
                index = PubDataAccessor.pubs.indexOf(pub);
            }
        }
        return index;
    }
    public static String getName(int index){
            return PubDataAccessor.pubs.get(index).name;
    }
    public static int getAge(int index){
        return PubDataAccessor.pubs.get(index).age;
    }
    public static String getOpening(int index){
        return PubDataAccessor.pubs.get(index).open + " " + "-" + " " + PubDataAccessor.pubs.get(index).close;
    }
    public static String getAdress(int index){
        return PubDataAccessor.pubs.get(index).street + " " + PubDataAccessor.pubs.get(index).city + " " + PubDataAccessor.pubs.get(index).zip ;
    }
    public static String getImage(int index){
        return PubDataAccessor.pubs.get(index).picture;
    }
}
