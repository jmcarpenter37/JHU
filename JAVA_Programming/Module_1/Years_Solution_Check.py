import numpy as np
import time

for i in np.arange(1, 6):
    year_sec = 31536000
    birth = 0
    death = 0
    immigrant = 0
    time_count = 1
    start_pop = 312032543
    print("The year second are at: ", i * year_sec)
    time.sleep(5)
    while time_count != i * year_sec:
        if time_count % 7 == 0:
            # print("A birth has occured!")
            birth += 1
        if time_count % 13 == 0:
            # print("A death has occured!")
            death += 1
        if time_count % 45 == 0:
            # print("An immigrant has arrived!")
            immigrant += 1
        time_count += 1
        print("The time counter is: ", time_count)
        if time_count == i * year_sec:
            print("Current time is equal to max year sec")
            print(time_count)
            print(i * year_sec)
            pop_update = start_pop + birth + immigrant - death
            print(" After {} year(s), the population is {}".format(i, pop_update))
            # print(" After {} year(s), the population is {}".format(i, pop_update))
            time.sleep(20)
