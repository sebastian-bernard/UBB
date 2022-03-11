#MULTIPLE ROWS COMMENT IN OCTAVE
#CTRL + R = comment selected rows
#CTRL + SHIFT + R = uncomment selected rows

mx = 2;
my = 2;
%1.) The rst 4 Legendre polynomials
##x = 0:0.1:1;
##l1 = x;
##l2 = 3/2*x -1/2;
##l3 = 5/2*x.^3 - 3/2*x;
##l4 = 35/8*x.^4 - 15/4*x.^2 + 3/8;
##
##subplot(mx, my, 1);
##plot(x, l1);
##
##subplot(mx, my, 2);
##plot(x, l2);
##
##subplot(mx, my, 3);
##plot(x, l3);
##
##subplot(mx, my, 4);
##plot(x, l1);
##
##subplot(mx, my, 4);
##plot(x, l4);

%2.)
  %a.)
##t = -1:0.1:1;
##T_1 = cos(acos(t));
##T_2 = cos(2.^acos(t));
##T_3 = cos(3.^acos(t));
##plot(t, T_1, t, T_2, t, T_3); 
  
  %b.)
##x = -1:0.01:1;
##n = 4;
##T0 = 1;
##T1 = x;
##hold on;
##plot(x, T0);
##plot(x, T1);
##for c = 2:n;  
##  T2 = 2*x.*T1 - T0;
##  plot(x, T2);
##  T0 = T1;
##  T1 = T2;
##end;
##hold off;

%3.)Taylor polynomial of n-th degree, associated to the function f\
##x = -1:0.1:3;
##n = 10; %frst n polynomials
##sum = 1;
##hold on;
##plot(sum);
##for k  = 1:(n-1)
##  sum = sum + x.^k/factorial(k)
##  plot(sum);
##end;
##hold off;

%4.)
x = [];
table = [];
h = 0.25;
k = 6; %order of the polynomial, i = 0:k 

%initialize x points and function results
##for i=0:k  
##  x = [x, 1+i*h];
##end;
##f = sqrt(5.*x.^2+1);
##
##table = f;
##old_line = f;
##for c = 1:k
##  new_line = [];
##  for p=1:k-c+1
##    new_line = [new_line, old_line(p+1)-old_line(p)];
##  end;
##  new_line = [new_line, zeros(1, c)];
##  table = [table; new_line];
##  old_line = new_line;
##end;
##table'

%5.)
x = [2 4 6 8];
f = [4 8 14 16];
table = [];
table = [table; x; f];
n = 4; %order of the polynomial

%formula for devided differences is: 
%(D_kf)(x_i) = ((D_k-1f)(x_i+1) - (D_k-1f)(x_i)) / (x_i+k - x_i)
old_line = f;
for k = 1:n-1 %number of the devided difference
  new_line = [];
  for i=1:n-k %index of current x
    new_line = [new_line, (old_line(i+1)-old_line(i)) / (x(i+k)-x(i))]; 
  end;  
  new_line = [new_line, zeros(1, k)]; %complete with 0 the line that will transform in column, for the places where we have no more numbers to substract
  table = [table; new_line]; %add new line to table, after the line before
  old_line = new_line;  
end;
table = table' %compute and print the transpose of the table

