# selenium-take-screenshot

Description
------------
Simple implementation of taking screenshot of given page by using Selenium with Java.

About
------------
This example project helps you understand Selenium with Java, TestNG, ChromeDriver and Apache Maven.

You can find more information in this webpage: http://www.seleniumhq.org

Usage
------------
For compile this example you need to Java Complier (such as IntelliJ IDEA, NetBeans, Eclipse)

After you download the project you need to run this file with in TestNG Suite:

```
selenium-take-screenshot\src\test\java\TakeScreenshot.java
```

After total tests run, you will find screenshot in this directory:

```
selenium-take-screenshot\tmp\screenshot.png
```

You can change the given page with change:
```java
 driver.get("http://www.google.com/");
```


Maven Dependencies
------------

##### What is Maven?

Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

This project use selenium and testng dependencies in pom.xml:

```xml
    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>LATEST</version>
        </dependency>

        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>LATEST</version>
        </dependency>
    </dependencies>
```

##### Selenium
Selenium is a set of different software tools each with a different approach to supporting browser automation. These tools are highly flexible, allowing many options for locating and manipulating elements within a browser, and one of its key features is the support for automating multiple browser platforms.

##### TestNG
TestNG is a testing framework designed to simplify a broad range of testing needs, from unit testing (testing a class in isolation of the others) to integration testing (testing entire systems made of several classes, several packages and even several external frameworks, such as application servers).

Help
------------
If you got any questions don't hesitate to contact with me: [celikgumusdag@gmail.com](mailto:celikgumusdag@gmail.com)

License
------------
This repository is open source software provided under the Apache License 2.0. 

This documentation and other similar content use the Creative Commons Attribution 3.0 Unported license. 

Most libraries and tools in the ecosystem are also open source, but they may use different licenses.
