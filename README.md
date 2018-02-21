# api-rate-limiter
An implementation of Token bucket algorithm for API Rate Limiting

# What is API rate limiting ?
Lets say you are exposing a bunch of public RESTFul APIs. You normally want to rate-limit it somehow. That is, to limit the number of requests performed over a period of time, in order to save resources and protect it from abuse.Say for example you want to allow only 60 calls to be made in a 1 minute window.
To be able to do this, the famous Token Bucket alogorithm comes in to play. We will see a very simple in-memory implementation
of the algorithm here. 

# Token Bucket Algorithm
https://en.wikipedia.org/wiki/Token_bucket

## Logic For Rate Limiting
The token bucket algorithm is based on an analogy of a fixed capacity bucket into which tokens are added at a fixed rate. Before allowing an API to proceed, the bucket is inspected to see if it contains atleast 1 token at that time. If so, one token is removed from the bucket, the API is allowed to proceed. Incase there are no tokens available, the API is returned saying that the quota has exceeded during that window !

# Scaling Rate limiting Logic
In a real life application, the rate limiting needs to be done at a user level or an Application level. Also the rate limiting logic needs to work for a cluster of servers. One of the most popular solution is to implement such a logic over Redis.  
