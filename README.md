# api-rate-limiter
An implementation of Token bucket algorithm for API Rate Limiting

# What is API rate limiting ?
Lets say you provide REST APIs to be consumed by your API Users. Its important that you protect your resources from 
abuse and also from a billing perspective. Say for example you want to allow only 60 API calls to be made in a 1 minute window.
To be able to do this, the famous Token Bucket alogorithm comes in to play. We will see a very simple in-memory implemnatation
of the algorithm in this project. 

# Token Bucket Algorithm
https://en.wikipedia.org/wiki/Token_bucket

## Algrothm Details
