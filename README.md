# archetype-closed
A maven archetype for "CLO"jure "S"pring-based W"E"b "D"evelopment. Features include:

1. Integration with clojure-maven-plugin, the *de facto* maven plugin to compile clojure source files.
2. A project structure of web app, meant to be deployed in a servlet container.
3. Spring-framework-enabled. Particularly MVC and bean factory. The bean factory is exposed to the clojure world as well (ctx.clj).
4. A simple example for Spring MVC.

## How to use?
This archetype is meant to be deployed to Maven Central. Before that is done, one may:

```
git clone 'git@github.com:cenzhe/archetype-closed.git'
cd archetype-closed
mvn install
# navigate to your workspace
cd ~/workspace
mvn archetype:generate -DarchetypeGroupId=com.github.cenzhe -DarchetypeArtifactId=archetype-closed -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=your.groupId -DartifactId=your.artifactId -Dversion=your.version -Dpackage=your.package.namespace
```

Substitute `1.0-SNAPSHOT` with the last release version of this repo, and substitute `your.groupId`, `your.artifactId`, `your.version`, `your.package.namespace` with your choice.

Once the upload is done, simply executing the last line would be enough to create a working webapp project.
