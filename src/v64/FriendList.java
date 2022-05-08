package v64;

import java.util.Arrays;

public class FriendList {

    private String[] friends;
    private int lastIndex = 0;

    public FriendList() {
        this.friends = new String[5];
    }

    public String[] getFriends() {
        return Arrays.copyOf(friends, lastIndex);
    }

    public void addFriend(String name) {
//        if (name == null || name.isBlank()) {
//            throw new InvalidFriendNameException(ErrorCode.NAME_IS_BLANK,
//                    "Name should have more than 0 characters long");
//        }

        try {
            if (!Character.isUpperCase(name.charAt(0))) {
                throw new InvalidFriendNameException(ErrorCode.NAME_NOT_STARTING_WITH_UPPER_CASE,
                        "Name '" + name + "' must start with upper case character");
            }
            friends[lastIndex++] = name;
        } catch (StringIndexOutOfBoundsException e) {
            throw new InvalidFriendNameException(ErrorCode.NAME_IS_BLANK, "Name should have more than 0 characters long", e);
        }
    }
}
