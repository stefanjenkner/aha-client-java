# aha-client-java
Java API wrapper for roadmapping tool Aha! (aha.io)

Aha! Java Client
===================

The Aha! Java Client library is an open source wrapper library to talk to Aha!s roadmap service from your Java app/website. The library interacts with Aha!s [REST API](http://aha.io/api).


Usage
-----

Please refer to the JUnit integration test cases in the com.mambu.aha.service package under the src/test folder


Installation
------------

# Add the latest jar under https://github.com/mambu-gmbh/aha-client-java/blob/master/build/aha-0.0.1-SNAPSHOT.jar to your classpath
# Add libs from https://github.com/mambu-gmbh/aha-client-java/blob/master/target/lib to your classpath
# Copy src/test/resources/aha.properties to your classpath
# Poplulate aha.properties with your Aha! settings


Dependencies
------------

This wrapper relies on the excellent [Jersey REST client API](https://jersey.dev.java.net/) including MOXy for handling JSON.

Developed By
-------------

This library was developed by Thomas Bachmann, Mambu GmbH.
