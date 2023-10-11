#!/bin/bash

read -p "Enter your weight in Kgs: " weight

if (( weight>=30 && weight<=250 ))
	then
		echo "Congratulations! you are eligible to become a member of the MBT health club"
	else
		echo "Sorry, your weight is not within the eligible range for the MBT health club"
fi
