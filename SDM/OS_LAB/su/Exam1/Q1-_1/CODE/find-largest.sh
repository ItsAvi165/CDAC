#!/bin/bash

# Accept three numbers from the user
echo "Enter the first number:"
read num1

echo "Enter the second number:"
read num2

echo "Enter the third number:"
read num3

# Find the largest number
largest=$num1

if [ $num2 -gt $largest ]; then
    largest=$num2
fi

if [ $num3 -gt $largest ]; then
    largest=$num3
fi

# Print the largest number
echo "The largest number is: $largest"
