package com.sidd;

import com.sidd.ratelimiter.RateLimiter;

import java.util.concurrent.TimeUnit;

/**
 * Created by Siddharth on 2/19/18.
 */

public class RateLimiterTest {

    public static void main(String[] args) throws Exception
    {
        int consumedTokenCount = test(1);
        System.out.println("consumedTokenCount: " + consumedTokenCount);//Should print 60

        consumedTokenCount = test(2);
        System.out.println("consumedTokenCount: " + consumedTokenCount);//Should print 120

        consumedTokenCount = test(3);
        System.out.println("consumedTokenCount: " + consumedTokenCount);//Should print 180


    }

    private static int test(int testDurationInMinutes)
    {
        //60 requests/Minute
        RateLimiter rateLimiter = new RateLimiter(60,60);
        //For 1 mins we will try to consume tokens
        long startTime = System.currentTimeMillis();
        int consumedTokenCount = 0;
        while((System.currentTimeMillis() - startTime) < (testDurationInMinutes * 60 * 1000))
        {
            if(rateLimiter.tryConsume())
            {
                System.out.print(".");
                consumedTokenCount++;
            }

        }
        return consumedTokenCount;

    }
}
