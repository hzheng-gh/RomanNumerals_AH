import collection.mutable.Stack
import org.scalatest._

/**
 * Created by hzheng on 09/24/15.
 */

class IntToRomanSpec extends FlatSpec with Matchers {

  it should "be V when convert 5 to Roman" in {
    val test = new IntToRoman
    test.toRoman(5) should be("V")
  }

  it should "be MCMIII when convert 1903 to Roman" in {
    val test = new IntToRoman
    test.toRoman(1903) should be("MCMIII")
  }

  it should "be MMM when convert 3000 to Roman" in {
    val test = new IntToRoman
    test.toRoman(3000) should be("MMM")
    }

  it should "be MMMCDXCIX when convert 3499 to Roman" in {
    val test = new IntToRoman
    test.toRoman(3499) should be("MMMCDXCIX")
    }

  it should "be MMMDCCLX when convert 3760 to Roman" in {
    val test = new IntToRoman
    test.toRoman(3760) should be("MMMDCCLX")
  }

  it should "be IV_CCXCIX when convert 4299 to Roman" in {
    val test = new IntToRoman
    test.toRoman(4299) should be("IV_CCXCIX")
  }

  it should "be V_ when convert 5000 to Roman" in {
    val test = new IntToRoman
    test.toRoman(5000) should be("V_")
  }

  it should "be something like V_I when convert 5001 to Roman" in {
    val test = new IntToRoman
    println ("5001: " + test.toRoman(5001))
  }

  it should "be something like V_MMMX when convert 8010 to Roman" in {
    val test = new IntToRoman
    println ("8010: " + test.toRoman(8010))
  }

  ignore should "be something like IX_X when convert 9010 to Roman" in {
    val test = new IntToRoman
    println ("9010: " + test.toRoman(9010))
    assert(test.toRoman(9010) == "IX_X")
    assert(test.toRoman(9011) == "IX_X", "9011 is converted to Roman " + test.toRoman(9011) + " not IX_X")
  }

  ignore should "be something like IX_CMXCIX when convert 9999 to Roman" in {
    val test = new IntToRoman
    println ("9999: " + test.toRoman(9999))
  }

  it should "be empty string if the Integer is 0" in {
    val test = new IntToRoman
    test.toRoman(0) should be ("")
  }

  it should "throw IllegalArgumentExcpetion if the number is negative" in {
    val test = new IntToRoman
    a[IllegalArgumentException] should be thrownBy {
      test.toRoman(-1)
    }
  }
}
