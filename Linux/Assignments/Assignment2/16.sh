#!/bin/bash

read -p "Enter number 1 " no1
read -p "Enter number 2 " no2
read -p "Enter number 3 " no3

if [ $no1 -gt $no2 ] && [ $no1 -gt $no2 ]
then
	echo "$no1 is the largest"
elif [ $no2 -gt $no1 ] && [ $no2 -gt $no3 ]
then
	echo "$no2 is the largest"
elif [ $no3 -gt $no1 ] && [ $no3 -gt $no2 ]
then
	echo "$no3 is the largest"
else
	echo "Numbers equal"
fi

#what happens when two numbers are equal but larger than 3rd word
#what happens when two numbers are equal but smaller than 3rd word
#what happens when all three numbers are equal

