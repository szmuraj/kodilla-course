package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestForumStatistics {

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Nested
    @DisplayName("testPosts")
    class testPosts {
        @Test
        void testPostsCount0() {
            //Given
            ForumStatisticks forumStatisticks = new ForumStatisticks(statisticsMock);

            when(statisticsMock.postsCount()).thenReturn(0);

            //When


            //Then
            Assertions.assertEquals(0, forumStatisticks.postsCount());

        }

        @Test
        void testPostsCount1000() {
            //Given
            ForumStatisticks forumStatisticks = new ForumStatisticks(statisticsMock);

            when(statisticsMock.postsCount()).thenReturn(1000);

            //When


            //Then
            Assertions.assertEquals(1000, forumStatisticks.postsCount());

        }

        @Test
        void testCommentsCount0() {
            //Given
            ForumStatisticks forumStatisticks = new ForumStatisticks(statisticsMock);

            when(statisticsMock.commentsCount()).thenReturn(0);

            //When


            //Then
            Assertions.assertEquals(0, forumStatisticks.commentsCount());

        }

        @Test
        void testMorePostsThanComments() {
            //Given
            ForumStatisticks forumStatisticks = new ForumStatisticks(statisticsMock);

            when(statisticsMock.postsCount()).thenReturn(2);
            when(statisticsMock.commentsCount()).thenReturn(1);

            //When

            //Then
            Assertions.assertEquals(2, forumStatisticks.postsCount());
            Assertions.assertEquals(1,forumStatisticks.commentsCount());
        }

        @Test
        void testMoreCommentsThanPosts() {
            //Given
            ForumStatisticks forumStatisticks = new ForumStatisticks(statisticsMock);

            when(statisticsMock.postsCount()).thenReturn(1);
            when(statisticsMock.commentsCount()).thenReturn(2);

            //When

            //Then
            Assertions.assertEquals(1, forumStatisticks.postsCount());
            Assertions.assertEquals(2,forumStatisticks.commentsCount());
        }

        @Test
        void test0Users() {
            //Given
            ForumStatisticks forumStatisticks = new ForumStatisticks(statisticsMock);

            //When


            //Then
            Assertions.assertEquals(0, forumStatisticks.usersNames().size());

        }


        @Test
        void test100Users() {
            //Given
            ForumStatisticks forumStatisticks = new ForumStatisticks(statisticsMock);

                List<String> resultList = new ArrayList<>();
                for (int n = 1; n <= 100; n++) {
                    resultList.add("User" + n);
                }

            //When


            //Then
            Assertions.assertEquals(100,resultList.size());

        }

    }
}
