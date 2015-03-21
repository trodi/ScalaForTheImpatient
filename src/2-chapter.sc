/** #1 */
def signum(num: Int) : Int = {
  if (num == 0) 0
  else if (num > 0) 1
  else -1
}

/** #4 java for (int i = 10; i >= 0; i--) */
for (i <- 10 to 0 by -1) println(i)

/** #5 */
def countdown(n: Int) : Unit = {
  for (i <- n to 0 by -1) println (i)
}