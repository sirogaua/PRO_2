.PHONY: clean

Lab2.class: Lab2.java Inp/Input.class Out/Output.class Targ/Target.class
	javac Lab2.java
Inp/Input.class: Input.java
	javac -d . Input.java
Out/Output.class: Output.java
	javac -d . Output.java
Targ/Target.class: Target.java
	javac -d . Target.java
Jar:
	jar -cfm Lab2.jar manifest.txt Lab2.class Targ/Target.class Out/Output.class Inp/Input.class  

clean:             
	rm -rf *.class             
	rm -r Inp Out Targ Lab2.jar

