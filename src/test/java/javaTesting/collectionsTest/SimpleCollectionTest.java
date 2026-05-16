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

        numerals.add("quatre");

        assertTrue(numerals.size() == 5);

        List<String> llistaNumeros = Arrays.asList(nombres);

        assertTrue(llistaNumeros.size() == 4);
    }

    @Test
    public void diesSetmana(){
        List<String> diesSetmana;
        List<String> diesFeiners = new ArrayList<>();
        List<String> diesCapDeSetmana;

        initDiesFeiners(diesFeiners);

        assertTrue(diesFeiners.size() == 5);
    }

    public void initDiesFeiners(List<String> dies){
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add("dimecres");
        dies.add("dijous");
        dies.add("divendres");
    }
}
