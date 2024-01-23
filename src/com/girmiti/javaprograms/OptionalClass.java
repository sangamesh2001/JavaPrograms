package com.girmiti.javaprograms;

import java.util.Optional;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class OptionalClass {

	public static void main(String[] args) {
		Optional<String> nameOptional = Optional.of("John");
        Optional<String> mappedResult = nameOptional.map(name -> "Mapped " + name);
        mappedResult.ifPresent(System.out::println);

        // Example with flatMap
        Optional<Person> personOptional = Optional.of(new Person("Alice"));
        Optional<String> flatMappedResult = personOptional.flatMap(person -> Optional.of("FlatMapped " + person.getName()));
        flatMappedResult.ifPresent(System.out::println);

        // Example with filter
        Optional<String> filteredResult = nameOptional.filter(name -> name.length() > 3);
        filteredResult.ifPresent(System.out::println);
        }
	}
	