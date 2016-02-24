CLEAN SBT PROJECT
=================

Skeleton project that can be cloned for quick katas in Scala. 

Make sure [sbt](http://www.scala-sbt.org/) is [installed](http://www.scala-sbt.org/0.13/docs/Installing-sbt-on-Mac.html) in our machine.

To verify you are all set, run:

	$ sbt test
	
or

	$ sbt
	> test
 
if you want to run the tests multiple times without re-starting sbt.

For a unit test class example, check [MyClassShould](https://github.com/codurance/clean_sbt_project/blob/master/src/test/scala/com/codurance/EmptyTestShould.scala)

All unit test classes can extend [UnitSpec](https://github.com/codurance/clean_sbt_project/blob/master/src/test/scala/com/codurance/UnitSpec.scala) for convenience.  

For more details about different styles of testing and mocking, check [ScalaTest](http://www.scalatest.org/).
 