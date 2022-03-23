1;

%f:[a,b] -> R
function estimatedError = myFunction(n)
    %Lagrangian polynomial for n given values  
  x_values = linspace(-5, 5, n+1);
  f_values = 1./(1.+x_values.^2); 
  y_values = linspace(-5, 5, 101);  
    
    %P(y)
  y_aproximation_values = [];
  for i=1:length(y_values)
    y_aproximation_values = [y_aproximation_values barycentric(x_values, f_values, y_values(i))];    
  endfor 
    %f(y), i=0:100
  fy_values = [];
  fy_values = 1./(1.+y_values.^2);
    %Error : max(|f(y) - P(Y)|)
  estimatedError = max(abs(fy_values - y_aproximation_values));    
  
    %plot the function(red - using [y, f(y)] values), and the Lagrange interpolation(blue - using [y, P(y)])
  plot(y_values, fy_values, 'r' ,y_values, y_aproximation_values, 'b');
endfunction

for i=1:4
  x = 2*i;
  subplot(2, 2, i);
  printf("%d. error=%d\n",i ,myFunction(x));
endfor
