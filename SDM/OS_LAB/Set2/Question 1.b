# Create the file and write the content
echo -e "Java is great\nScripting is easy\nI love Java\nPython is good, too\nHello, Java World!" > cdac.txt

# Count the number of lines without the word "Java"
grep -v "Java" cdac.txt | wc -l

