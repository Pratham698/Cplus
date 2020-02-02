#include<stdio.h>
#include<iostream>
#include<conio.h>
#include<stdlib.h>
//This is very best scene//
using namespace std;
class Bank
{
    char name[100],address[200],y;
    int money;
public:
    void open_Account();
    void deposit_Money();
    void withdraw_Money();
    void display_Account();
};

void Bank::open_Account()
{

    cout<<"Enter Name :: ";
    cin.ignore();
    cin.getline(name,100);
    cout<<"Enter Address :: ";
    cin.ignore();
    cin.getline(address,200);
    cout<<"What type of account you  want to open Saving(s)  or Current(C):: ";
    cin>>y;
    cout<<"Enter amount you want to deposit:: ";
    cin>>money;

    cout<<" CONGRATULATION!! Your Account Is Created";
}
void Bank:: deposit_Money()
{
    int money1;
    cout<<"Enter amount you want to deposit:: ";
    cin>>money1;
    money=money+money1;
    cout<<"Total amount you have :: \t "<<money;
}

void Bank::display_Account()
{

    cout<<"Your Name:: \t \n"<<name;
    cout<<"Your Address :: \t \n"<<address;
    cout<<"Account Type :: \t \n"<<y;
    cout<<"Total Money you have  ::\t \n"<<money;

}
void Bank:: withdraw_Money()
{
    float amount;
    cout<<"Enter amount you want to withdraw ";
    cin>>amount;
    money=money-amount;
    cout<<"Now Total amount you have :: \t" << money;


}

int main()
{
    int ch,x;
    Bank obj;
    do{
cout<<"1.Open Account \n";
cout<<"2.Deposit Money \n";
cout<<"3.Withdraw Money \n";
cout<<"4.Display Account \n";
cout<<"5.Exit \n";
  cout<<"Select option from above \n";
  cin>>ch;
switch(ch)
{
case 1:
    cout<<"Open Account \n";
    obj.open_Account();
    break;

case 2:
    cout<<"deposit_Money \n";
    obj.deposit_Money();
    break;

case 3:
    cout<<"withdraw_Money \n";
    obj.withdraw_Money();
    break;

case 4:
    cout<<"display_Account \n";
    obj.display_Account();
    break;

case 5:
    if(ch==5)
        exit(1);

default:
    cout<<"INVALID CHOICE \n";
}
cout<<"\n do you want to select next option then press y";
cout<<"If you want to exit then press n";
x=getche();
if(x=='n'||x=='N')
    exit(0);
}while(x=='y'||x=='Y');

return 0;
}
