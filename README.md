Hello SpringBoot
==================




Build
------------------

```
./mvnw package
```


Run
------------------

### Simple

```
java -jar hellospringboot-0.0.1-SNAPSHOT.jar
```

### Enable Application Insights

Apply `INSTRUMENTATION_KEY` environment. eg:


```
INSTRUMENTATION_KEY=XXXXXXX java -jar hellospringboot-0.0.1-SNAPSHOT.jar
```



API
------------------

### `/memory?size=100`


|Param|Type| Description |
|----|-----|-----------------------------------|
|`size`| `int` | Allocate memory. Unit:MiB. default: `1`|
   

