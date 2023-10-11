#!/bin/bash

#Assignment 01
echo "---------------------------------------------------------------------------------------------"
echo "1. List all the files and sub directories of the directory /bin."
echo " "
ls /bin/

#Assignment 02
echo "---------------------------------------------------------------------------------------------"
echo "2. List all the files including hidden files in your current directory."
echo " "
ls -a /bin/

#Assignment 03
echo "---------------------------------------------------------------------------------------------"
echo "3. List all the files starting with letter ‘r’ in your current directory."
echo " "
ls -a /bin/r*

#Assignment 04
echo "---------------------------------------------------------------------------------------------"
echo "4. List all the files having three characters in their names, from your current directory."
echo " "
ls -a /bin/???
echo "---------------------------------------------------------------------------------------------"

#Assignment 05
echo "---------------------------------------------------------------------------------------------"
echo "5. List all the files with extension .doc in your current directory."
echo " "
ls -a /bin/*.*
echo "---------------------------------------------------------------------------------------------"

#Assignment 06
echo "---------------------------------------------------------------------------------------------"
echo "6. List all the files having the first letter of their name within the range ‘l’ to‘s’, from your current directory"
echo " "
ls -a /bin/[l-s]*
echo "---------------------------------------------------------------------------------------------"

#Assignment 07
echo "---------------------------------------------------------------------------------------------"
echo "Count the number of files in the current directory"
echo " "
ls -la /bin/ | wc -l #wc is counter, -l will count the new lines
echo "---------------------------------------------------------------------------------------------"
