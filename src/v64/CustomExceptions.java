package v64;

import java.util.Arrays;

public class CustomExceptions {

    public static void main(String[] args) {

        try {
            FriendList list = new FriendList();

            list.addFriend("Anna");
            list.addFriend("Máté");
            //list.addFriend("asztal");
            //list.addFriend("1992");
            list.addFriend("");

            System.out.println(Arrays.toString(list.getFriends()));
        } catch (InvalidFriendNameException e) {
            switch (e.getErrorCode()) {
                case NAME_NOT_STARTING_WITH_UPPER_CASE -> System.out.println("A névnek nagy betűvel kell kezdődnie!");
                case NAME_IS_BLANK -> System.out.println("A név nem lehet üres!");
            }
            e.printStackTrace();
        }

    }
}
