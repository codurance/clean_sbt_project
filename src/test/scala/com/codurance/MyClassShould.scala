package com.codurance

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyClassShould extends UnitSpec{

	"Verify if tests are working - change me to someting useful" in {
		val expected_result = true

		expected_result should be(true)
	}

}
