#!/bin/bash

read -p "Enter number of lines: " lines

for (( i=1;i<$lines;i++ ))
do
	for(( j=1; j<=i; j++ ))
	do
		echo -n "*"
	done
	echo ""
done
