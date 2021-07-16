#TimeDrift

This program fetches the time from one of Google's NPT servers (time4.google.com), and prints the localhost time along with the returned time from the NPT server. 

###Sample output:
```shell
npt time:	1626470569869	Fri Jul 16 17:22:49 EDT 2021 
Roundtrip delay(ms)=39, clock offset(ms)=54
```
The clock offset is the difference between local machine's clock and NTPD host.

###Build the program 
```java
git clone https://github.com/rcprcp/TimeDrift.git
cd TimeDrift
mvn clean package
```
###Run the program
```java
java -jar target/TimeDrift-1.0-SNAPSHOT-jar-with-dependencies.jar
```


