# junit5-native-image-annotation-test

- For https://github.com/apache/shardingsphere/pull/30031 and https://github.com/graalvm/native-build-tools/issues/602 .

- Execute the following command on the Ubuntu 22.04.3 instance with `SDKMAN!` installed.

```shell
sdk install java 22.0.1-graalce
sdk use java 22.0.1-graalce
sudo apt-get install build-essential libz-dev zlib1g-dev -y

git clone git@github.com:linghengqian/junit-v5110-test.git
cd ./junit-v5110-test/
./mvnw -PnativeTestInJunit -T1C -e clean test
```

- Log.
```shell
$ ./mvnw -PnativeTestInJunit -T1C -e clean test
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] Using the MultiThreadedBuilder implementation with a thread count of 16
[INFO] 
[INFO] -----------< com.lingh:junit5-native-image-annotation-test >------------
[INFO] Building junit5-native-image-annotation-test 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ junit5-native-image-annotation-test ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/junit-v5110-test/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ junit5-native-image-annotation-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/junit-v5110-test/src/main/resources
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ junit5-native-image-annotation-test ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ junit5-native-image-annotation-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/junit-v5110-test/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ junit5-native-image-annotation-test ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 1 source file with javac [debug target 22] to target/test-classes
[INFO] 
[INFO] --- surefire:3.2.2:test (default-test) @ junit5-native-image-annotation-test ---
[WARNING]  Parameter 'systemProperties' is deprecated: Use systemPropertyVariables instead.
[INFO] Surefire report directory: /home/linghengqian/TwinklingLiftWorks/git/public/junit-v5110-test/target/surefire-reports
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.ClassLevelTest
[WARNING] Tests run: 1, Failures: 0, Errors: 0, Skipped: 1, Time elapsed: 0.009 s -- in com.lingh.ClassLevelTest
[INFO] 
[INFO] Results:
[INFO] 
[WARNING] Tests run: 1, Failures: 0, Errors: 0, Skipped: 1
[INFO] 
[INFO] 
[INFO] --- native:0.10.2:test (test-native) @ junit5-native-image-annotation-test ---
[INFO] ====================
[INFO] Initializing project: junit5-native-image-annotation-test
[INFO] ====================
[INFO] Found GraalVM installation from JAVA_HOME variable.
[INFO] Downloaded GraalVM reachability metadata repository from file:/home/linghengqian/.m2/repository/org/graalvm/buildtools/graalvm-reachability-metadata/0.10.2/graalvm-reachability-metadata-0.10.2-repository.zip
[INFO] Executing: /home/linghengqian/.sdkman/candidates/java/22.0.1-graalce/bin/native-image -cp /home/linghengqian/TwinklingLiftWorks/git/public/junit-v5110-test/target/test-classes:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter/5.11.0-M2/junit-jupiter-5.11.0-M2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.11.0-M2/junit-jupiter-api-5.11.0-M2.jar:/home/linghengqian/.m2/repository/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-commons/1.11.0-M2/junit-platform-commons-1.11.0-M2.jar:/home/linghengqian/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.11.0-M2/junit-jupiter-params-5.11.0-M2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.11.0-M2/junit-jupiter-engine-5.11.0-M2.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-engine/1.11.0-M2/junit-platform-engine-1.11.0-M2.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/native-maven-plugin/0.10.2/native-maven-plugin-0.10.2.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/utils/0.10.2/utils-0.10.2.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/graalvm-reachability-metadata/0.10.2/graalvm-reachability-metadata-0.10.2.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/junit-platform-native/0.10.2/junit-platform-native-0.10.2.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-console/1.10.0/junit-platform-console-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-reporting/1.10.0/junit-platform-reporting-1.10.0.jar:/home/linghengqian/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-launcher/1.10.0/junit-platform-launcher-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-engine/1.10.0/junit-platform-engine-1.10.0.jar:/home/linghengqian/.m2/repository/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-commons/1.10.0/junit-platform-commons-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter/5.10.0/junit-jupiter-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.10.0/junit-jupiter-api-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.10.0/junit-jupiter-params-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.10.0/junit-jupiter-engine-5.10.0.jar --no-fallback -Ob -o /home/linghengqian/TwinklingLiftWorks/git/public/junit-v5110-test/target/native-tests -Djunit.platform.listeners.uid.tracking.output.dir=/home/linghengqian/TwinklingLiftWorks/git/public/junit-v5110-test/target/test-ids --features=org.graalvm.junit.platform.JUnitPlatformFeature org.graalvm.junit.platform.NativeImageJUnitLauncher
========================================================================================================================
GraalVM Native Image: Generating 'native-tests' (executable)...
========================================================================================================================
[1/8] Initializing...                                                                                    (4.3s @ 0.11GB)
 Java version: 22.0.1+8, vendor version: GraalVM CE 22.0.1+8.1
 Graal compiler: optimization level: b, target machine: x86-64-v3
 C compiler: gcc (linux, x86_64, 11.4.0)
 Garbage collector: Serial GC (max heap size: 80% of RAM)
 2 user-specific feature(s):
 - com.oracle.svm.thirdparty.gson.GsonFeature
 - org.graalvm.junit.platform.JUnitPlatformFeature
------------------------------------------------------------------------------------------------------------------------
Build resources:
 - 9.04GB of memory (46.3% of 19.54GB system memory, determined at start)
 - 16 thread(s) (100.0% of 16 available processor(s), determined at start)
[junit-platform-native] Running in 'test listener' mode using files matching pattern [junit-platform-unique-ids*] found in folder [/home/linghengqian/TwinklingLiftWorks/git/public/junit-v5110-test/target/test-ids] and its subfolders.
[2/8] Performing analysis...  [****]                                                                    (11.8s @ 0.69GB)
    6,818 reachable types   (81.3% of    8,388 total)
    9,294 reachable fields  (51.0% of   18,209 total)
   30,315 reachable methods (52.4% of   57,859 total)
    2,358 types,    72 fields, and   883 methods registered for reflection
       58 types,    58 fields, and    52 methods registered for JNI access
        4 native libraries: dl, pthread, rt, z

Error: An object of type 'org.junit.platform.commons.util.LruCache' was found in the image heap. This type, however, is marked for initialization at image run time for the following reason: classes are initialized at run time by default.
This is not allowed for correctness reasons: All objects that are stored in the image heap must be initialized at build time.

You now have two options to resolve this:

1) If it is intended that objects of type 'org.junit.platform.commons.util.LruCache' are persisted in the image heap, add 

    '--initialize-at-build-time=org.junit.platform.commons.util.LruCache'

to the native-image arguments. Note that initializing new types can store additional objects to the heap. It is advised to check the static fields of 'org.junit.platform.commons.util.LruCache' to see if they are safe for build-time initialization,  and that they do not contain any sensitive data that should not become part of the image.

2) If these objects should not be stored in the image heap, you can use 

    '--trace-object-instantiation=org.junit.platform.commons.util.LruCache'

to find classes that instantiate these objects. Once you found such a class, you can mark it explicitly for run time initialization with 

    '--initialize-at-run-time=<culprit>'

to prevent the instantiation of the object.

If you are seeing this message after upgrading to a new GraalVM release, this means that some objects ended up in the image heap without their type being marked with --initialize-at-build-time.
To fix this, include '--initialize-at-build-time=org.junit.platform.commons.util.LruCache' in your configuration. If the classes do not originate from your code, it is advised to update all library or framework dependencies to the latest version before addressing this error.

The following detailed trace displays from which field in the code the object was reached.
Detailed message:
Trace: Object was reached by
  reading field java.util.Collections$SynchronizedMap.m of constant 
    java.util.Collections$SynchronizedMap@2633a885: {}
  reading static field org.junit.platform.commons.util.ReflectionUtils.interfaceMethodCache
    at <unknown-location>
  registered as read because: null

------------------------------------------------------------------------------------------------------------------------
                        1.7s (9.8% of total time) in 101 GCs | Peak RSS: 1.28GB | CPU load: 9.54
========================================================================================================================
Failed generating 'native-tests' after 16.6s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  19.459 s (Wall Clock)
[INFO] Finished at: 2024-06-13T00:08:37+08:00
[INFO] ------------------------------------------------------------------------
```