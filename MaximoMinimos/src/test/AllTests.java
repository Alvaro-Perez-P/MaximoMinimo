package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestMaximo.class, TestMinimo.class })
public class AllTests {

}
