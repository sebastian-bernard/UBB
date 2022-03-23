%a.)
format long
x = [-2, -1, 0, 1, 2];
f = 3.^x;
Neville(x, f, 1/2)

%b.)
x = [0, 1, 2, 4, 5];
f = sqrt(x);
Neville(x, f, 3)