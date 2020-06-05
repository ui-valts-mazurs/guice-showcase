# guice-showcase
Guice showcase with YGuard obfuscation.
Head to 

## How to run
### Unobfiscated
`./gradlew run`

### Obfuscated
```
./gradlew obfuscatedFatJar
java -jar build/libs/guice-showcase-fat-obfuscated-1.0-SNAPSHOT.jar
```

### IDE
If you want to run this in IDE then switch on annotation processor support because
this project uses [Immutables](https://immutables.github.io/) for POJO generation.

Intellij IDEA:
- Open File | Settings | Build, Execution, Deployment | Compiler | Annotation Processors
- Check _Enable annotation processing_
