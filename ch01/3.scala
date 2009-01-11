/*
Exercise 1.3.  Define a procedure that takes three numbers as arguments and returns the sum of the squares of the two larger numbers. 
*/

val l = List(2, 8, 3)
l.sort(_ > _).take(2).map(x => x*x).foldLeft(0)(_ + _)
