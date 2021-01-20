package space;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class JavaTest {
    class Property{
        String a;

        String getA(){
            return this.a;
        }
    }
    public static void main(String[] args){
        Property property = new JavaTest().new Property();
        String out= Optional.ofNullable(property.getA()).orElse(null);
        if(out.equals(null)) System.out.println("nulled");

    }
}
