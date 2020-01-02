# Faker Generator
[![Build Status](https://travis-ci.org/mauriciojovel/Faker-Generator.svg?branch=master)](https://travis-ci.org/mauriciojovel/Faker-Generator)
[![Coverage Status](https://coveralls.io/repos/github/mauriciojovel/Faker-Generator/badge.svg?branch=master)](https://coveralls.io/github/mauriciojovel/Faker-Generator?branch=master)

Is a library to wrap [Faker Project](https://github.com/DiUS/java-faker) if you include the library in your project
you can use the `FakeAnnotation` to create mock data.

## How help to include more methods.
1. First create a new implementation of annotation with the name that you want (package faker.generator)
![Example demo](documentation/resources/annotation_example.png)
1. Create a new class that implement `FakeService<T>` on the package `faker.generator.services` and write to code to 
implement the method
![Fake implementation example](documentation/resources/fake_service_implementation.png)
1. Write on the annotation create in the point 1 `@FakeServiceName` with the service name create on the step 2.
1. Write your test in a separated file.

