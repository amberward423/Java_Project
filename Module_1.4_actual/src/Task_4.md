## Question 
Write an algorithm in Java or pseudocode for the main loop of the simulator:

The main loop does all the things required for a three-phase simulation (presented in a section).

Think in general terms (don't think in detail) and present a general solution. No need for target system concepts.

## Answer 

I needed to build understanding of A-C phases because it was confusing to me, so I did execute some detail in the algorithm to help in my understanding. 
However, this is my algorithm that checks the event list and corresponding state and goes through the queue to determine how the customer 
moves through the simulation in accordance with time. 

## Initialization 
 
1.) Set simulation time to 0. 
2.) Prepare event list 
3.) Schedule initial events to prepare the system


## A phase

1.) Simulation checks the event list 
2.) Simulation notices customer arrival at time 5 
3.) Simulation advances clock to time 5
4.) Simulation advances clock to time 13
5.) Simulation advances clock to time 14


## B phase
1.) Clock is still at time 5 
2.) Customer is now moved into the queue 
4.) Customer 1 ends service at time 13
5.) Customer 1 exits at time 14


## C phase 
1.) looks at queue and advances next customer if the service agent is free
3.) Customer 1 begins service at time 5 




