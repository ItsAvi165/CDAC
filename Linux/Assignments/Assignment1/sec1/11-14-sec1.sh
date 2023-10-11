#!/bin/bash

#11. Display the output of command ls –l to a file and on the output screen.
echo ""
echo "Displaying lists and appending to file"
echo ""
ls -l > file1 
cat file1

#12. From file text1 print all lines starting from 10th line.
echo "Storing 10 lines in file 12.dat"
for i in {1..50..1}
do
	echo 'line' >> 12.dat
done 
echo "Using cat to dispay and pipe sed to print particular sets of lines: "
cat 12.dat | sed -n 10,20p

#13. Find the number of users currently logged on to the system.
echo ""
users

#14. Delete all the files with their names starting with “tmp”.
echo ""
for i in {1..20..1}
do
	touch 'tmp'$i'.dat'
done

echo ""
echo "list of tmp files created"
ls
echo ""

echo "using rm *tpm* remove temperory files"
rm tmp*.*
echo ""

echo "Removed files with tmp"
ls
echo ""
