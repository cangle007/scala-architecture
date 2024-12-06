## basic scala folder setup

1. Build.sbt and setting a new project
2. Adding a main application
3. Installing and using libraries
4. Setting up and running tests

## Run test

1. auto compile your code changes, `sbt > compile > ~compile`
2. to run your Test, `test:testOnly com.rockthejvm.SimpleTest`
   1. com.rockthejvm is your directory to SimpleTest.scala fil
   2. or just run `test`, and it will run all of your tests
   3. `sbt test`, to run test outside of sbt mode

## Folder Architecture

```text
project-root/
├── build.sbt
├── project/
│   └── build.properties
├── src/
│   ├── main/
│   │   └── scala/
│   │       └── Main.scala
│   ├── test/
│   │   └── scala/
│   │       └── MainTest.scala
└── target/
```
