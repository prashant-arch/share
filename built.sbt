import AssemblyKeys._

assemblySettings

name:= "My Hello World Program"

version := "1.0"

scalaVersion := "2.10.3"

jarName in assembly := "hello.jar"

mainClass in (Compile, assembly) := Some("com.whiteboardcoder.hello.hw")
