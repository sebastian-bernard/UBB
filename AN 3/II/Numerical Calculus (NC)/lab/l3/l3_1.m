1;

x = [1930 1940 1950 1960 1970 1980];
y = [123203 131669 150697 179323 203212 226505];
x1 = 1955;
x2 = 1995;

format long
 
floor(barycentric(x, y, x1))