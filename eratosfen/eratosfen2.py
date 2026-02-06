import time

def find_primes(limit):
    if limit < 2:
        return []
    sieve = [True] * (limit + 1)
    sieve[0] = sieve[1] = False
    for num in range(2, int(limit**0.5) + 1):
        if sieve[num]:
            sieve[num * num : limit + 1 : num] = [False] * len(sieve[num * num : limit + 1 : num])
    return [num for num, is_prime in enumerate(sieve) if is_prime]


start_time = time.perf_counter()
find_primes(20_000_000)
#find_primes(20_000_000)
#find_primes(20_000_000)
res_time = time.perf_counter() - start_time
print("Finished for: %.7f ms." % res_time)