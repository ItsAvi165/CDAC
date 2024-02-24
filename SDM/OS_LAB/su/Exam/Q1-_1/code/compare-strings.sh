#!/bin/bash

# Accept two strings from the user
echo "Enter the first string:"
read string1

echo "Enter the second string:"
read string2

# Compare the two strings
if [ "$string1" = "$string2" ]; then
    echo "The two strings match."
else
    echo "The two strings do not match."
fi
