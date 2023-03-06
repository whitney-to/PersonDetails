package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";

        // create a `counter`
        int count = 0;

        // while `counter` is less than length of array
        while(count < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            Person person = personArray[count];

            // get `string Representation` of `currentPerson`
            String rep = person.toString();

            // append `stringRepresentation` to `result` variable
            result = result.concat(rep);

            count++;
        }   // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for(int i = 0; i < personArray.length; i++) {
            // use the above clauses to declare for-loop signature
            // begin loop

            // use `counter` to identify the `current Person` in the array
            Person person = personArray[i];

            // get `string Representation` of `currentPerson`
            String rep = person.toString();

            // append `stringRepresentation` to `result` variable
            result = result.concat(rep);
        }   // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for(Person person : personArray) {
            // use the above discoveries to declare for-each-loop signature
            // begin loop

            // get `string Representation` of `currentPerson`
            String rep = person.toString();

            // append `stringRepresentation` to `result` variable
            result = result.concat(rep);
        }    // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
