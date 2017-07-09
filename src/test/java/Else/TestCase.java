package Else;

import File1.Task01.Task01Test;
import File1.Task03.ITriangleProviderTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCase {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Task01Test.class, ITriangleProviderTest.class);

        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
