#!/bin/bash

vi FILE2

loc=$( pwd )

ln $loc"/FILE2" $loc"/hardlink1.txt"
ln $loc"/FILE2" $loc"/hardlink2.txt"

#echo "Inode number"

ls -i 
