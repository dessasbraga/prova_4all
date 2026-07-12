package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import reports.Report;
import testcases.Challenge1;
import testcases.Challenge2;

@RunWith(Suite.class)
@SuiteClasses(
        {
                Challenge1.class,
                Challenge2.class,

        })

public class Runner {
    @BeforeClass
    public static void initTests() {
        Report.create("Challenge", "Suíte de Testes");

    }

    @AfterClass
    public static void stopTests() {
        Report.close();
    }
}

