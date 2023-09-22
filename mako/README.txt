This problem will require you to write an application that will take in 
an input file 'input.csv' and identify some key pieces of information.

_______________________________________________________________________________

Input:
The input file represents a very simplified stream of prices on an exchange.  
Each row represents a trade.  If you don't know what that means don't worry,
the data can through of as points of data across time, each point represents 
an updated price for a named stock.

The input file has the following CSV format:

<Timestamp>,<Symbol>,<Volume>,<Price>

Definitions
- Timestamp is the value indicating the microseconds since midnight.
- Symbol is the 3 character unique identifier for a financial 
  instrument (Stock, future etc.)
- Volume is the amount traded for that symbol
- Price is the price of the trade for that symbol

Safe Assumptions:
- Timestamp is always for the same day and won't roll over at midnight.
- Timestamp is increasing or same as previous tick (e.g the time gap will never be < 0).
- Price - Price is always > 0.

Example: here is a row for a trade of 10 shares of aaa stock at a price of 12 
1234567,aaa,10,12

Problem:
Find the following information for each symbol in the input file -

Maximum price - the highest price seen for that symbol
Minimum price - the lowest price seen for that symbol
Average price - the average price across the day
Total volume traded - how much of that symbol was traded over the day

Example: the following trades
	20 shares of aaa @ 18
	5 shares of aaa @ 7
	
Our output for the symbol aaa is 
Maximum price - 18
Minimum price - 7
Average price - (18 + 7)/ 2 = 12.5
Total volume - 20 + 5 = 25

Output:
Your output should be a single line with the four pieces of requested information.

Sample Input:
57124702,aaa,13,1136
57124702,aac,20,477
57125641,aab,31,907
57127350,aab,29,724
57127783,aac,21,638
57130489,aaa,18,1222
57131654,aaa,9,1077
57133453,aab,9,756

Sample Output:
Symbol: aaa Max Price: 1222 Min Price: 1077 Average Price: 1145.0 Total Volume: 40
Symbol: aab Max Price: 907 Min Price: 724 Average Price: 795.6666666666666 Total Volume: 69
Symbol: aac Max Price: 638 Min Price: 477 Average Price: 557.5 Total Volume: 41

A skeleton solution has been provided, in this solution we are using an instrument class
to contain all of our information for a specific symbol, these objects are stored in a symbols
dictionary with the symbol name as a key.

Your task is to complete the empty functions.


Coding environment:
- Use an online python tool like https://trinket.io/embed/python3 
- Alternatively you can set up an IDE of your choice, e.g. PyCharm, VsCode, Sublime or Atom https://www.guru99.com/how-to-install-python.html

Python Crash Course:
- There are plenty of free python crash courses out there, either in the form of articles or videos. I recommend this one for example:
  https://www.freecodecamp.org/news/python-crash-course/ 
- Official Python tutorial https://docs.python.org/3/tutorial/ 

_______________________________________________________________________________   
EXTRA TASKS (optional): 
If you have time left you can implement logging and appropriate unit testing as well.

