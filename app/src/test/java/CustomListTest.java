import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount(); //listSize is the size of the list object
        list.addCity(new City("Halifax","NS")); //add city Halifax and province NS to list
        assertEquals(listSize+1, list.getCount()); // check if addCity added a city expect to see getCount return 1 if successful
    }

    @Test
    public void hasCityTest(){
        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertEquals(true, list.hasCity(city)); // check if addCity added a city expect to see getCount return 1 if successful
    }

    @Test
    public void deleteCityTest(){
        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertEquals(true,list.hasCity(city));
        list.deleteCity(city);
        assertEquals(false,list.hasCity(city)); // check if addCity added a city expect to see getCount return 1 if successful
    }

    @Test
    public void countCitiesTest(){
        City city = new City("Edmonton","AB");
        City city1 = new City("Calgary","AB");
        City city2 = new City("Vancouver","BC");
        list.addCity(city);
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(3,list.countCities()); // check if addCity added a city expect to see getCount return 1 if successful
    }
}
