#!/bin/bash


# 7. Create a file text1 and read its input from keyboard.
vi text1
echo "File created named test1 via vi"

# 8. Copy the contents of file text1 to another file text2.
echo "Copy of text1 to text2 via cp"
echo ""
cp text1 text2
echo ""
echo "Copy of text1 to text2 is completed"
echo ""
echo "Text1 contents: "
echo ""
cat text1
echo ""
echo "Text2 contents: "
echo ""
cat text2

# 9. Append the contents of file text2 to file text1.
echo ""
echo "Appending data of text2 to text1"
cat text2 >> text1
echo ""
echo "Displaying the contents of text1 after appending data from text1"
echo ""
echo "Text1 contents: "
echo ""
cat text1
echo ""
echo "Text2 contents: "
echo ""
cat text2


# 10. Count the number of files in the current directory
echo ""
echo "using ls to display the list and piping with wc to count directory with flag -l "
ls -a | wc -l
