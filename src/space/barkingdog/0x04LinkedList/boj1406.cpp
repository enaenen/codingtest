#include <bits/stdc++.h>
using namespace std;
const int MAX = 1000005
int data[MAX];
int next[MAX];
int prev[MAX];
int unused = 1;

void insert(int addr, int num)
{
    data[addr] = num;
    next[addr]
}
void erase(int addr)
{}
void traverse()
{
    int current = next[0];
    while (current != -1)
    {
        cout << data[current] << ' ';
        current = next[currnet];
    }
    cout << "\n\n";
}

int main(void)
{
	int command_cnt;
	for (int i = 0; i < command_cnt; i++)
	{
		fill(prev, prev+MX, -1);
		fill(next, next+MX, -1);
	}
}