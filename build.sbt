name := "eventing"

scalaVersion := "2.10.2"

version := "1.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.2.3"

libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.2.3"

libraryDependencies += "com.typesafe.akka" %% "akka-contrib" % "2.2.3"

libraryDependencies += "org.clapper" %  "classutil_2.10" % "1.0.2"

libraryDependencies += "org.json4s"  %% "json4s-jackson" % "3.2.4"

libraryDependencies += "org.json4s"  %% "json4s-native"  % "3.2.4"