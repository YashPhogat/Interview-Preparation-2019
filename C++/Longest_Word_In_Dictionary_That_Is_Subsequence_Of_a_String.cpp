#include<iostream>
#include<algorithm>
#include<vector>
#include<list>
#include<map>
#include<cstdio>

using namespace std;


void dp_lcs(string str, vector <string> words){
	map <string, int> word_map;
	map <char, list<int> > str_chrs;
	map <char, list<int> > :: iterator j;
	int pos_reached;

	for (int k=0; k<str.size(); k++){
		str_chrs[str[k]].push_back(k);
	}
	for (j=str_chrs.begin(); j!=str_chrs.end();j++)
	{
//		cout<<j->first<<" = > ";
		list<int> :: iterator o;
		for (o = j->second.begin(); o !=j->second.end(); o++)
		{
//			cout<<*o;
		}
	}
	int max_len = 0;
	string max_str;

	vector <string> :: iterator word;

	string :: iterator ja;
	for (word = words.begin(); word!= words.end(); word++)
	{

		ja  = word->begin();

		map <char, list<int> > str_temp(str_chrs);

//		int current_pos = *std::min_element(str_temp[*ja].begin(), str_temp[*ja].end());
		int current_pos = 0;
		for (; ja != word->end();ja++){
//			cout<<endl<<*ja;
//			cout<<endl<<"Current Pos: "<<current_pos<<"\t First Occurence Pos: "<<*std::min_element(str_temp[*ja].begin(), str_temp[*ja].end());
			if(str_chrs.find(*ja) == str_chrs.end() || (current_pos > *std::min_element(str_temp[*ja].begin(), str_temp[*ja].end()))){
				current_pos = 0;
				break;
			}
			else {

				str_temp[*ja].remove(*std::min_element(str_temp[*ja].begin(), str_temp[*ja].end()));
//				cout<<endl<<str_temp[*ja];
//				for (auto v : str_temp[*ja]){
//					std::cout<<v<<":::: ";
//				}
				current_pos++;
			}
		}
		if (current_pos == string(*word).size() && current_pos > max_len)
		{
			max_len = current_pos;
			max_str = string(*word);
		}
//		cout<<"\n";

	}
	cout<<max_str<<"\n";

}

int main(){

	string str;
	string words;
	vector <string> word_list;

	cout<<"Enter main string: ";
	cin>>str;
	cout<<"Enter the dictionary of words by space separated values: ";
	while (cin>>words && words != "-1"){
	word_list.push_back(words);
	}
//	for (int i= 0; i < word_list.size();i++)
//	{
//		cout<<word_list[i]<<"==>\n";
//	}
	dp_lcs(str, word_list);
}
