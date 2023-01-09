package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShouldUse = steven.sharePost();
        System.out.println("Steven should use: " + stevenShouldUse);
        String johnShouldUse = john.sharePost();
        System.out.println("John should use: " + johnShouldUse);
        String kodillaShouldUse = kodilla.sharePost();
        System.out.println("Kodilla should use: " + kodillaShouldUse);

        //Then
        assertEquals("FacebookPublisher", stevenShouldUse);
        assertEquals("TwitterPublisher", johnShouldUse);
        assertEquals("SnapchatPublisher", kodillaShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShouldUse = steven.sharePost();
        System.out.println("Steven should use: " + stevenShouldUse);
        steven.setUserSocialPublisher(new TwitterPublisher());
        stevenShouldUse = steven.sharePost();
        System.out.println("Steven should now use " + stevenShouldUse);

        //Then
        assertEquals("TwitterPublisher", stevenShouldUse);
    }
}
