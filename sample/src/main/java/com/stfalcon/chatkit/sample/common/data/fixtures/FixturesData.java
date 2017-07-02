package com.stfalcon.chatkit.sample.common.data.fixtures;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.UUID;

/*
 * Created by Anton Bevza on 1/13/17.
 */
abstract class FixturesData {

    static SecureRandom rnd = new SecureRandom();

    static ArrayList<String> avatars = new ArrayList<String>() {
        {
            add("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/10395830_10206049410093377_8919309732158454060_n.jpg?oh=60c8279684dae369590a97935a141e01&oe=59CCDCE2");
            add("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/227396_1061357447942_4373_n.jpg?oh=5811a05f575c8da8096aecc44a452cfc&oe=5A0730EA");
            add("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/421753_10151070119464565_1356386639_n.jpg?oh=ffcc5a33335596b9c36bc27b760cc362&oe=5A077A47");
            add("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/1175484_10151828024255559_428045364_n.jpg?oh=ea49ae41a55fa56ef4c4200191136c81&oe=59C33BC6");
        }
    };

    static final ArrayList<String> groupChatImages = new ArrayList<String>() {
        {
            add("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/10395830_10206049410093377_8919309732158454060_n.jpg?oh=60c8279684dae369590a97935a141e01&oe=59CCDCE2");
            add("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/227396_1061357447942_4373_n.jpg?oh=5811a05f575c8da8096aecc44a452cfc&oe=5A0730EA");
            add("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/421753_10151070119464565_1356386639_n.jpg?oh=ffcc5a33335596b9c36bc27b760cc362&oe=5A077A47");
            add("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/1175484_10151828024255559_428045364_n.jpg?oh=ea49ae41a55fa56ef4c4200191136c81&oe=59C33BC6");
        }
    };

    static final ArrayList<String> groupChatTitles = new ArrayList<String>() {
        {
            add("Drake's ex");
            add("Maple");
            add("Celina's cousin");
        }
    };

    static final ArrayList<String> names = new ArrayList<String>() {
        {
            add("Big Poppa");
            add("Tity Boi");
            add("Adrianna Htoo");
            add("groovy");
            add("The Fifth Hokage");
            add("Spicy Kimchi");
            add("Jenice Chau");
            add("Rachel Song");
            add("Worlds of Asians");
            add("Tiff Li");
            add("Clorox Taste Tester");
        }
    };

    static final ArrayList<String> messages = new ArrayList<String>() {
        {
            add("Hello!");
            add("Can I pet your titties?");
            add("Hey there delilah, what's it like in ya booty");
            add("Believe it!");
            add("Dattebayo");
            add("that's my ninja way");
            add("I love booty");
            add("What yo booty taste");
            add("Encore do you want more");
            add("Trevor how could u");
        }
    };

    static final ArrayList<String> images = new ArrayList<String>() {
        {
            add("https://scontent-sea1-1.cdninstagram.com/t51.2885-15/e35/18949475_146149052621828_8336427282679726080_n.jpg");
            add("https://scontent-sea1-1.cdninstagram.com/t51.2885-15/e35/15034580_223564044732962_6472223768965021696_n.jpg");
        }
    };

    static String getRandomId() {
        return Long.toString(UUID.randomUUID().getLeastSignificantBits());
    }

    static String getRandomAvatar() {
        return avatars.get(rnd.nextInt(avatars.size()));
    }

    static String getRandomGroupChatImage() {
        return groupChatImages.get(rnd.nextInt(groupChatImages.size()));
    }

    static String getRandomGroupChatTitle() {
        return groupChatTitles.get(rnd.nextInt(groupChatTitles.size()));
    }

    static String getRandomName() {
        return names.get(rnd.nextInt(names.size()));
    }

    static String getRandomMessage() {
        return messages.get(rnd.nextInt(messages.size()));
    }

    static String getRandomImage() {
        return images.get(rnd.nextInt(images.size()));
    }

    static boolean getRandomBoolean() {
        return rnd.nextBoolean();
    }
}
