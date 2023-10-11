#!/bin/bash

echo "--------CALCULATOR--------"
echo "CAUTION: USE SPACE IN BETWEEN OPERAND AND OPERATOR "
echo ""
echo "OPERAND"
echo "Press + for Addition"
echo "Press - for Subtraction"
echo "Press * for Multiplication"
echo "Press / for Division"
echo "Press ^ for Power"
echo ""

read -p "" num1 op num2
#echo -n $num1 $operator $num2
operator=$op
result=1
if [ "$operator" == "+" ]
then
	result=$(( $num1+$num2 ))
elif [ "$operator" == "-" ]
then
	result=$(( $num1-$num2 ))
elif [ "$operator" == "*" ]
then
	result=$(( $num1*$num2 ))
elif [ "$operator" == "/" ]
then
	result=$(( $num1/$num2 ))
elif [ "$operator" == "^" ]
then
	for (( i=1; i<=num2; i++ ))
	do
		result=$(( $result*$num1 ))
	done
else
	echo "Invalid operator"
fi

echo -n " = $result"
echo ""
