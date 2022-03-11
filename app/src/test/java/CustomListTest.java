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
}
