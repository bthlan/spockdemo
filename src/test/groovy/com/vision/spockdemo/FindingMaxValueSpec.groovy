package com.vision.spockdemo

import spock.lang.Specification
import spock.lang.Unroll

class FindingMaxValueSpec extends Specification{
	def "should return max value"() {
		expect:
			maxValue == Math.max(a, b)
		where:
			a	|b	|maxValue
			1	|1	|1
			1	|2	|2
			3	|1	|1
			5	|7	|7
			8	|9	|8
			
	}
	
	@Unroll
	def "should return max value using Unroll"() {
		expect:
			maxValue == Math.max(a, b)
		where:
			a	|b	|maxValue
			1	|1	|1
			1	|2	|2
			3	|1	|1
			5	|7	|7
			8	|9	|8
			
	}
	
	@Unroll("Max number between #a and #b is #maxValue")
	def "should return max value using Unroll with param"() {
		expect:
			maxValue == Math.max(a, b)
		where:
			a	|b	|maxValue
			1	|1	|1
			1	|2	|2
			3	|1	|1
			5	|7	|7
			8	|9	|8
			
	}
}
