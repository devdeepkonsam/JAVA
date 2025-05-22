#include <stdio.h>

int main() {
    int n, quantum, i, time = 0, remain, flag = 0;
    int arrival[10], burst[10], remaining[10], wait[10], turnaround[10];

    printf("Enter number of processes: ");
    scanf("%d", &n);
    remain = n;

    for(i = 0; i < n; i++) {
        printf("Enter Arrival Time and Burst Time for Process %d: ", i+1);
        scanf("%d %d", &arrival[i], &burst[i]);
        remaining[i] = burst[i];
    }

    printf("Enter Time Quantum: ");
    scanf("%d", &quantum);

    int t = 0, count = 0;
    while(remain != 0) {
        flag = 0;
        for(i = 0; i < n; i++) {
            if(remaining[i] > 0 && arrival[i] <= t) {
                if(remaining[i] <= quantum) {
                    t += remaining[i];
                    wait[i] = t - arrival[i] - burst[i];
                    turnaround[i] = t - arrival[i];
                    remaining[i] = 0;
                    remain--;
                } else {
                    t += quantum;
                    remaining[i] -= quantum;
                }
                flag = 1;
            }
        }
        if(flag == 0) t++;
    }

    printf("\nProcess\tArrival\tBurst\tWaiting\tTurnaround\n");
    for(i = 0; i < n; i++)
        printf("P%d\t%d\t%d\t%d\t%d\n", i+1, arrival[i], burst[i], wait[i], turnaround[i]);

    return 0;
}
