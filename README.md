bankofchange
============
Currently my bank is giving the change for free of cost. Say, if you give me a 100 Rs. Note, then based on the available denominations, I should give you a change with denominations < 100 Rs. Notes.
It’s an automated system.

As a: Banker, in the morning, I should key in the number of denominations & number of available counts.  I may choose to enter all the notes or some of the ntoes. 
As an example: I may enter 
100 Rs. – 10 notes, 50 Rs. - 20 notes, 10 Rs. – 30 notes, 5 Rs. – 50 notes, 1 Rs. – 100 notes. I may choose to enter only certain denominations
As a: Customer, I can enter only 1 note @ a time. Maximum note value is 1000 Rs. (Same is the case for banker who deposits the denominations in the morning).

1.	When I insert a note, it should give me the change starting from next highest note to lowest note.
2.	If exact change isn’t possible, it should return my note indicating the same.
3.	If the note I inserted is the lowest then it should indicate the same.
4.	If banker hasn’t deposited any change in the first place it should not allow user to insert any note, indicating that the machine is down. 
 
Further enhancements:-
1.	As soon as the note’s count is 0, it should inform the banker asking for refill.
2.	It should give user an option to say that `Not all denominations should be same`. As an example: If I insert a 500 Rs. Bill, then I expect 100 X 4 + 50 X 2. 
3.	Monday through Friday it’s for free
4.	Saturday Sunday, user is charged @ 2% of charge (Ceiled to next Rs.). This charge needs to be deducted and only the remaining amounts change can be given.
5.	Banker should have ability to change the % charge or DOW pattern.
