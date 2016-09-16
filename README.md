
# RMATH-JNI


A Java wrapper (pure JNI) of Rmath statistical distribution functions


## Getting Started

This project provides a pure Java Wrapper over the Rmath statistical distribution <b>without any 3rd Party library like JNA/BirdJ</b>

## Prebuilt Binaries :

Windows: X86 , X86_64
Linux: X86_64



## Steps to Use


### To use this peoject as maven repo you can just use ,

```
    <repositories>
		<repository>
			<id>rmath-jni</id>
			<url>https://raw.github.com/git-rbanerjee/rmath-jni/mvn-repo/</url>
			<snapshots>
				<enabled>true</enabled>
				<updatePolicy>always</updatePolicy>
			</snapshots>
		</repository>
	</repositories>
```

And

```
    <dependency>
		<groupId>org.rmath</groupId>
		<artifactId>rmath-jni</artifactId>
		<version>1.0.2</version>
	</dependency>
```


## Example:

### JAVA

```

import org.junit.Assert;
import org.junit.Test;
import org.rmath.RMath;
import static org.hamcrest.CoreMatchers.*;

public class TestRmath {
	
	@Test
	public void testPPOIS()
	{
		double actual = RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,false,false);
		double expected = 7.454657589191258E-112;
		Assert.assertThat(actual, is(expected));
	}

}

```

### Scala 

```
import org.rmath.RMath

RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,false,false)
```

### License

Rmath-Java includes code from the R project which is licensed under
[GPL (>= 2)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html).
Rmath-Java itself is also licensed under GPL (>= 2).

### To copy this Jar as external dependency of your build :

```
			<plugin>
				<artifactId>maven-dependency-plugin</artifactId>
				<executions>
					<execution>
						<phase>install</phase>
						<goals>
							<goal>copy-dependencies</goal>
						</goals>
						<configuration>
							<outputDirectory>${project.build.directory}/lib</outputDirectory>
							<includeGroupIds>org.rmath</includeGroupIds>
						</configuration>
					</execution>
				</executions>
			</plugin>
```
