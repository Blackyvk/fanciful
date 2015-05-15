Fanciful [![Build Status](http://tealcube.com/jenkins/buildStatus/icon?job=fanciful)](http://tealcube.com/jenkins/job/fanciful/)
========
Lightweight library offering pleasant chat message formatting for Bukkit plugins. A way to get at the good stuff offered by Minecraft 1.7's new chat protocol without dropping down to raw JSON.

Installation
--------
Use Maven. Add the Fanciful repository and dependency entries to your `pom.xml`.

```xml
<repository>
  <id>tealcube-mvn-repo</id>
  <url>http://tealcube.com/nexus/content/groups/public/</url>
</repository>

<dependency>
  <groupId>mkremins</groupId>
  <artifactId>fanciful</artifactId>
  <version>0.3.3-SNAPSHOT</version>
</dependency>
```

Usage
--------
See [Example.java](https://github.com/TealCube/fanciful/blob/master/src/example/java/mkremins/fanciful/Example.java) for a simple example.

Status
--------
Relatively stable core featureset, with new features under active development.

License
--------
[MIT License](http://opensource.org/licenses/MIT). Hack away.
