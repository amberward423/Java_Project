## Question 

Using the names of the simulator classes, explain the simulator

## a) what A-phase coding means? 

A phase coding is the phase that moves the clock in accordance to event times. 
It mostly revolves around the clock class and event list class. 
It uses these two classes together to determine when to advance the clock to keep the simulation 
running smoothly. 

## b) what coding B-events mean?

B phase coding is the phase that executes the scheduled events so it utilizes the event and event list 
classes to push the event to where it needs to go to be executed in the order in which it is scheduled which introduces some utilization of the queue here but mainly in phase c. 

## c) what coding C events means?
Phase C is the conditional class. It looks at whether certain conditions like the agent being free and the next in queue being available 
to help advance the customer to the next place that they need to go. This phase works with the A and B phases very closely as it helps push the customers through when the previous 
customer is finished. It does this until there is nothing else it can do and then it transfers back to the A phase. 


