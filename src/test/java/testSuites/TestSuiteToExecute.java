/**
 * @Author Gladson Antony
 * @Date 11-Feb-2018 
 * @Time 11:32:29 AM
 */
package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.GoogleLoginTest;
import tests.GoogleSearchFailTest;
import tests.GoogleSearchPassTest;

@RunWith(Suite.class)
@Suite.SuiteClasses
({ GoogleSearchPassTest.class, GoogleSearchFailTest.class, GoogleLoginTest.class})

public class TestSuiteToExecute 
{ }
