# Dagger2WithRetrolambdaDemo
A demo of Dagger2 With Retrolambda to prove that Dagger 2 **2.10-rc1** breaks retrolambda


The _master_ branch is using retrolambda with Dagger 2 version 2.9. Everything is cool.

The _dagger2_rc_ branch is using retrolambda with Dagger 2 version **2.10-rc1**. It generates the following error when you run the Android App:



update Dagger 2 version to 2.10-rc1 to generate the following error


`Error:Error converting bytecode to dex:
Cause: Dex cannot parse version 52 byte code.
This is caused by library dependencies that have been compiled using Java 8 or above.
If you are using the 'java' gradle plugin in a library submodule add
targetCompatibility = '1.7'
sourceCompatibility = '1.7'
to that submodule's build.gradle file.`

