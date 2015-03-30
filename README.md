This is a small demo of using jacoco for code coverage in netbeans. It 
appears that running the tests in the IDE requires opening and closing
the coverage window.

Also, branching info is NOT available in the IDE, but rather in the reports
available in the target section

mvn -DskipTests=false clean verify

http://www.eclemma.org/jacoco/