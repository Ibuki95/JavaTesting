package javaTesting.collectionsTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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
        List<String> diesSetmana = new ArrayList<>();
        List<String> diesFeiners = new ArrayList<>();
        List<String> diesCapDeSetmana = new ArrayList<>();
        List<String> diesSenars = new ArrayList<>();
        List<String> diesFeinersSenars = new ArrayList<>();
        List<String> calculDies = new ArrayList<>();

        initDiesFeiners(diesFeiners);

        assertTrue(diesFeiners.size() == 5);

        assertEquals(0, diesSetmana.size());
        assertFalse(diesSetmana.containsAll(diesFeiners));

        diesSetmana.addAll(diesFeiners);

        assertEquals(5, diesSetmana.size());
        assertFalse(diesSetmana.containsAll(diesFeiners));

        diesCapDeSetmana.add("dissabte");
        diesCapDeSetmana.add("diumenge");

        diesSetmana.addAll(diesCapDeSetmana);

        assertEquals(7, diesSetmana.size());
        assertFalse(diesSetmana.containsAll(diesCapDeSetmana));

        diesSenars.addAll(diesSetmana);

        assertTrue(diesSenars.contains("dimarts"));

        diesSenars.remove(1);

        assertFalse(diesSenars.contains("dimarts"));

        diesSenars.remove("dijous");

        assertFalse(diesSenars.contains("dijous"));

        diesFeinersSenars.addAll(diesSenars);

        diesFeinersSenars.removeAll(diesCapDeSetmana);

        assertEquals(3, diesFeinersSenars.size());

        assertFalse(diesFeinersSenars.contains("dissabte"));
    }

    public void initDiesFeiners(List<String> dies){
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add("dimecres");
        dies.add("dijous");
        dies.add("divendres");
    }
}
