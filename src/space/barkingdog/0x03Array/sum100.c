#include <stdio.h>

int solution(int *arr, int size)
{
	int check[100] = {0, };

	for (int i = 0; i < size; i++)
	{
		if (check[100 - arr[i]])
			return (1);
		check[arr[i]] = 1;
	}
	return (0);
}

int main(void)
{
	int arr1[3] = {1, 52, 48};
	int arr2[2] = {50, 42};
	int arr3[4] = {4, 13, 63, 87};
	int arr4[5] = {1, 23, 53, 77, 60};

	printf("1 == %d\n", solution(arr1, 3));
	printf("0 == %d\n", solution(arr2, 2));
	printf("1 == %d\n", solution(arr3, 4));
	printf("1 == %d\n", solution(arr4, 5));
}