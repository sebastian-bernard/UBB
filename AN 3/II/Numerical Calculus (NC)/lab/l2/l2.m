mx = 4;
my = 4;
%1.)The rst 4 Legendre polynomials
x = 0:0.1:1;
l1 = x;
l2 = 3/2*x -1/2;
l3 = 5/2*x.^3 - 3/2*x;
l4 = 35/8*x.^4 - 15/4*x.^2 + 3/8;

%subplot(mx, my, 1);
plot(x, l1);