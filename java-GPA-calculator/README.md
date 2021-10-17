
# GPA Calculator Java Testsuite

This directory contains the GPA calculator library within the jarfile
`GPAcalculator.jar` as well as a copy of the JUnit 4 implementation
`junit-4.10.jar`.

Also provided within the `jarcode` directory is the source for the
`GPAcalculator` class - however note that you are *NOT* intended to
edit the source code within the jar file.  It intentionally has flaws,
so that you have something to fine.

Javadoc for the code in the jarfile is provided within the
`GPAcalculator-classdocs1.1` directory.  Use a web browser to explore
this HTML documentation.
 

## An example 

Also in this directory is a Java class `Convert75toLetterExample.java`
that demonstrates calling for a grade to be converted in this library.

Build and run this example by running the `buildAndRunExample` script.

# How to build and run the test suite

## Building the test suite
To build the Java test suite, run

	buildJavaTests.sh

This script runs the command line

	javac -cp GPAcalculator.jar:junit-4.10.jar:. RunTests.java TestConversions.java

This command line adds both the `GPAcalculator.jar` and `junit-4.10.jar` jarfile to the `CLASSPATH` and then compiles the Java code

## Running the test suite1

Similarly

	runJavaTests.sh

will run the test suite, using the command

	java -cp GPAcalculator.jar:junit-4.10.jar:. RunTests

As above, this command loads the appropriate jar files for you.

# Test Status

This section lists each test in the suite, and its current status (PASS or FAIL)

test100percent (PASS)
test95percent (PASS)
test90percent (FAIL)
test89percent (PASS)
test87percent (PASS)
test85percent (FAIL)
test84percent (PASS)
test82percent (PASS)
test80percent (FAIL)
test79percent (PASS)
test78percent (PASS)
test77percent (FAIL)
test76percent (PASS)
test74_5percent (PASS)
test73percent (FAIL)
test72percent (PASS)
test71percent (PASS)
test70percent (FAIL)
test69percent (PASS)
test68percent (PASS)
test67percent (FAIL)
test66percent (PASS)
test64_5percent (PASS)
test63percent (FAIL)
test62percent (PASS)
test61percent (PASS)
test60percent (FAIL)
test59percent (PASS)
test58percent (PASS)
test57percent (FAIL)
test56percent (PASS)
test54_5percent (PASS)
test53percent (FAIL)
test52percent (PASS)
test51percent (PASS)
test50percent (FAIL)
test49percent (PASS)
test24_5percent (PASS)
test0percent (FAIL)