#include <bits/stdc++.h>
using namespace std;

int main(void)
{
	int arr[26] = {0,};
	ios::sync_with_stdio(0);
	cin.tie(0);
	string s;
	cin >> s;
	for (auto c : s)
		arr[c - 'a']++;
	for (int i = 0; i < 26; i++)
		cout << arr[i] << ' ';
}