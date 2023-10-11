#!/bin/bash

#Count the total number of words in file text1.
read -p "Enter file name or location (using pwd): " f

echo "w = words"
echo "b = bytes"
echo "c = characters"
read -p "Enter what you want to count " ch

if [ $ch = "w" ]
then
	echo "Number of words in $f file are "
	cat $f | wc -w
elif [ $ch = "c" ]
then
	echo "Number of characters (hidden characters included) in $f files are "
	cat $f | wc -m
elif [ $ch = "b" ]
then
	echo "Number of characters (hidden characters included) in $f files are "
	cat $f | wc -c
else
	echo "Invalid choice"
fi



	

