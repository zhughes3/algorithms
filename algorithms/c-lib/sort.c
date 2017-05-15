#include <stdint.h>
#include <stdlib.h>
#include <stdio.h>
#include <errno.h>
#include <math.h>
#include <time.h>

void insertionSort(int arr[], int n)
{
	int i, j;
	for(i = 1; i < n; i++)
	{
		for(j = i; j >= 1; j--)
		{
			if(arr[j] < arr[j-1])
			{
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}

			else
				break;
		}
	}
}

void printArr(int arr[], int n)
{
	printf("[ ");
	int i;
	for(i = 0; i < n-1; i++)
		printf("%d, ", arr[i]);

	printf("%d]\n", arr[n-1]);
}

void main()
{
	int n = 15;
	time_t t;
	srand((unsigned) time(&t));

	int pre[n];

	int i;
	for(i = 0; i < n; i++)
		pre[i] = rand() % 50;

	printArr(pre, n);

	insertionSort(pre, n);

	printArr(pre, n);
}