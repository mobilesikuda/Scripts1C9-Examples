import time
 
n = 50000000;
array = []
array.insert(0, 0)
array.insert(1, 0)
i = 2
while i <= n:
    array.insert(i, 1)
    i += 1
 
print("Begin-");
timeBegin = time.time();
i = 2;
while i <= n:
    if array[i] == 1: 
        sq = i * i;
        if sq <= n: 
            m = sq
            while m <= n:
                array[m] = 0
                m += i
    i += 1
 
diff = (time.time() - timeBegin);
print("End-")
print(diff) 