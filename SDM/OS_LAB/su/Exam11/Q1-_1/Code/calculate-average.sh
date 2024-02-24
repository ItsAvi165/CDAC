#!/bin/bash

# Accept three numbers from the user
echo "Enter the first number:"
read num1

echo "Enter the second number:"
read num2

echo "Enter the third number:"
read num3

# Calculate the average
sum=$((num1 + num2 + num3))
average=$(echo "scale=2; $sum / 3" | bc)  # Using bc for floating-point arithmetic

# Display the average
echo "The average of $num1, $num2, and $num3 is: $average"
