/**
 * Created by hzheng on 09/24/15.
 */
class IntToRoman {
  private val romanNumerals = List(10000 -> "X_", 9000 -> "IX_", 5000 -> "V_", 4000 -> "IV_",1000 -> "M", 900 -> "CM", 500 -> "D", 400 -> "CD", 100 -> "C", 90 -> "XC",
    50 -> "L", 40 -> "XL", 10 -> "X", 9 -> "IX", 5 -> "V", 4 -> "IV", 1 -> "I")

  def toRoman(n: Int): String = {
    if (n < 0) throw new IllegalArgumentException("Number cannot be neagative")
    if (n == 0) ""
    else {
      var remaningNumber = n
      romanNumerals.foldLeft("") { (str, romanNumeral) =>
        // calculate times
        val times = remaningNumber / romanNumeral._1
        // calculate remaining number
        remaningNumber -= romanNumeral._1 * times
        str + romanNumeral._2 * times
      }
    }
  }
}
