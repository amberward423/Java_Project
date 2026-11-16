(1) Suppose you are compiling statistics on the age structure of students in our group.
You should then draw 1000 age values and these should be distributed
in the same way as the age distribution of the students in the group.
How do you do it? Explain the algorithm in enough details to be able to program it directly.
Take an idea/model from the example on the previous section 'Your own distribution'.



My Answer:
First, we look at the class that we have and gather the information on the ages of people in our class.
Then we figure out how many people are in each age group presented in the previous age range.
Using this, we determine the individual probability by dividing the number of people in the age group by the total number of people in the class.
Using this, we build cumulative age by adding the individual age ranges to determine the probability of selecting someone from an age group on a 0 to 1 scale.
Once this is determined, the code runs, finds the matching interval we calculated, and selects the corresponding age.
We keep this until the condition of 1000 age values is met.