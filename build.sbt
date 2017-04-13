name := "JPMigrator"

version := "1.0"

lazy val `jpmigrator` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  cache ,
  ws   ,
  // https://mvnrepository.com/artifact/com.typesafe.play/play-slick_2.11
  "com.typesafe.play" % "play-slick_2.11" % "2.0.2",
  // https://mvnrepository.com/artifact/com.typesafe.play/play-slick-evolutions_2.11
  "com.typesafe.play" % "play-slick-evolutions_2.11" % "2.0.2",
  // https://mvnrepository.com/artifact/com.typesafe.slick/slick-codegen_2.11
  "com.typesafe.slick" % "slick-codegen_2.11" % "3.1.1",
  // https://mvnrepository.com/artifact/com.github.tototoshi/slick-joda-mapper_2.11
  "com.github.tototoshi" % "slick-joda-mapper_2.11" % "2.2.0",
  // https://mvnrepository.com/artifact/joda-time/joda-time
  "joda-time" % "joda-time" % "2.9.6",
  // https://mvnrepository.com/artifact/org.joda/joda-convert
  "org.joda" % "joda-convert" % "1.8.1",
  // https://mvnrepository.com/artifact/mysql/mysql-connector-java
  "mysql" % "mysql-connector-java" % "6.0.5",
  "org.scalatest" %% "scalatest" %  "3.0.1" % "test",
  // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
  "org.seleniumhq.selenium" % "selenium-java" % "3.0.1",
  specs2 % Test
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  