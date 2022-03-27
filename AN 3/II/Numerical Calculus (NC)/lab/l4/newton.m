1;

function retvalue = Newton(x_values, f_values, x)
  %initialisation
  m = length(x_values);  
  ddif = DDifferences(x_values, f_values, m);
  sum = ddif(1, 2); %sum = f(x0)  
  #prod = x - x_values(1); %first element of the product
  prod = 1;
  
  for i = 1:(m-1)    
    prod = prod * (x - x_values(i)); %last x is omitted by the formula
          
  endfor
  retvalue = sum;
endfunction



##x = [0 1/6 1/2];
##f = [0 1/2 1];
##Newton(x, f, 2)