package space;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ARTIST");
        stringList.add("ARTDELIVERY");

        if(stringList.contains(UserRole.ARTIST.name()))
            System.out.println("true");
    }
    enum UserRole{
        ADMIN,
        ARTDELIVERY,
        ARTIST,
        USER,
        SOCIAL
    }
}

