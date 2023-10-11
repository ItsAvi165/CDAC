#!/bin/bash 

echo "--------CALCULATOR--------"
echo "Press + for Addition"
echo "Press - for Subtraction"
echo "Press * for Multiplication"
echo "Press / for Division"
echo "Press e for EXIT"

read -p "n1=> " a
read -p "Op=> " o
read -p "n2=> " b

if [[ $o == + ]]
then
	result=$(( $a+$b ))
elif [[ $o == - ]]
then
	result=$(( $a-$b ))
elif [[ $o == \* ]]
then
	result=$(( $a*$b ))
elif [[ $o == / ]]
then
	result=$(( $a/$b ))
else
	echo "Invalid Input"

fi
echo "________"
echo "Ans= $result"

