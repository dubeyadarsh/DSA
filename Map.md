Let's talk about internal working of Hashmap.

How to create hashmap?
Map<String,Integer> map=new HashMap<>();

What happen when we put element in hashmap?
map.put("Adarsh",1);

-->
  When we insert any key pair in hashmap, then a bucket of fixed length is formed. Now It calculate the hash of given key,( why hash?  
  Hash is needed because every bucket in map has index, so to access the bucket we will need index and to find the index we will need hash. index= {hash(k)%n};)
  
  Now after evaluating index , Now its time to insert key value pair in the bucket . But wait ....
  Bucket store the node data type not key value pair.
  So, we will create node and the {hash,key,value and next pointer} will be properites of node.
  Now this node will be inserted on that index which we have caluclated by hash function.
  
  Sometimes, there is collision happens, means hashmap encounter a index for new key value pair where bucket is already contains some node. So, in order to avid these situation
  Node has   the next pointer, SO now this new node will be inserted in the same bucket but it will be connected to previous node like a linkedlist.
  ![image](https://user-images.githubusercontent.com/75479397/204129837-8b461df8-6895-4333-be22-3322f78422a0.png)

  
  
