package javaTesting.collectionsTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SimpleCollectionTest {
    @Test
    public void firstCollectionTest(){
        String[] nombres = {"zero", "un", "dos", "tres"};

        List<String> numerals = new ArrayList<>();

        for(String s : nombres){
            numerals.add(s);
        }

        assertTrue(numerals.size() == 4);

        List<String> llistaNumeros = Arrays.asList(nombres);

        assertTrue(llistaNumeros.size() == 4);
    }
}
