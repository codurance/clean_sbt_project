import sbt._

object Dependencies {

	val scalatest      = "org.scalatest"  % "scalatest_2.11"  % "2.2.4"
	val mockito        = "org.mockito"    % "mockito-core"    % "1.10.19"

	val scala_reflect  = "org.scala-lang"         % "scala-reflect"   % "2.11.7"
	val scala_xml      = "org.scala-lang.modules" % "scala-xml_2.11"  % "1.0.4"

	val prodDependencies = Seq(
		scala_reflect, scala_xml
	)

	val testDependencies = Seq(
		scalatest, mockito
	)

	val allDependencies: Seq[ModuleID] = prodDependencies ++ testDependencies

}