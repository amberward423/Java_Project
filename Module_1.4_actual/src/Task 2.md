## Question 
Consider the categories in which performance measures are maintained/updated/computed.
(Think in general terms: service point/customer; not in target system terms.)


## Answer 
I am going to list the things belonging to the Service Point and the Customer individually. 

## Service Point
- B - active time in service 
- X - service point throughput
- C - Actual list of customers
- T - total simulation time 
- U - service time utilization 
- R - response time 
- N - average queue length
- W - waiting time for all clients 
- S - average service time 
- R(i) - individual response time from the beginning to the exit

## Customer
- R(i) - individual response time from the beginning to the exit 
- A - Arrival time
- B - active time in service 

Looking at this I sorted the responsibilities of each section into the two classes that I would make if I were to program this. 
The Service Point class would contain the arrival time that it pulls from the customer class and it would add these things to a queue based on a FIFO system. 
There would also be a time based calculation to determine the FIFO order in the queue and move the customers through the simulation based on the order in which they arrived. 
This would work in tandem with the response time to help calculate the average service time of each customer. 
This then can be used to determine the average queue length per unit of time, the workers efficiency,the average service time, and total time spent for all clients.
The customer class would contain all the information relevant to the customer such as their arrival time, active time spent in the service, and the
individual response time. This would then be sent to the Service Point class to be used in calculation. 
