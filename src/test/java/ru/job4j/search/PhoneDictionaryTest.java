package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> fin = phones.find("Petr");
        assertThat(fin.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    void whenFindIsEmpty() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> fin = phones.find("Boris");
        assertThat(fin).isEmpty();
    }
}