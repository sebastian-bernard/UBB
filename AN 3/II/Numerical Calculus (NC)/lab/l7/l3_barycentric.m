1;

function retvalue = barycentric(x_values, f_values, x)  
  %initialisation
  m = length(x_values);
  
  %verification
  for i=1:m
    if(x_values(i) == x)
      retvalue = f_values(i);
      return;
    endif
  endfor  
  
  %compute Ai for all points;
  A = [];  
  for i=1:m
    prod = 1;
    for j=1:m    
      if(j != i)      
        prod = prod * (x_values(i) - x_values(j));
      endif    
    endfor    
    A = [A, 1/prod];    
  endfor  
  
  %compute the barycentric form of lagrange interpolation polynomial
  %for given x
  numerator = 0;
  denominator = 0;  
  for i=1:m
    numerator = numerator + A(i) / (x - x_values(i)) * f_values(i);
    denominator = denominator + A(i) / (x - x_values(i));
  endfor  
  retvalue = numerator / denominator;    
endfunction