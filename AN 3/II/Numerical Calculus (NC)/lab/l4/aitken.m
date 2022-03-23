1;

function returnval = condition(left, right, externalParam)
  if(abs(left - externalParam) <= abs(right - externalParam))
    returnval = 1;
  else
    returnval = 0;
  endif
  
endfunction  
 
function returnval = Aitken(x_values, f_values, x)
    %initialisation   
  m = length(x_values);
  table = [];
    
    %sorting the x_values, ascending order, and f_values accordingly 
  aux = 0;  
  for i = 1:(length(x_values)-1)
    for j = i:length(x_values)
      if (!condition(x_values(i), x_values(j), x))
        aux = x_values(i);
        x_values(i) = x_values(j);
        x_values(j) = aux;
        %
        aux = f_values(i);
        f_values(i) = f_values(j);
        f_values(j) = aux;
      endif
    endfor
  endfor
  table = [f_values]; %consider only the table of f in order to have a matrix; don't add x-column
  table = table';
    %compute the matrix by generating the values under the 1st diagonal, 0 otherwise
  for j = 2: m %in total, m-i computet values for f    
    newLine = [];
    newLine = [zeros(1, j-1), newLine]; %put zeros above the 1st diagonal
    det = 0;
    newValue = 0;
    for i = j:m %1st diag      
      lhs = table(j-1, j-1).*(x_values(i) - x);
      rhs = table(i, j-1).*(x_values(j-1) - x);
      det = lhs - rhs;
      %      
      newValue = 1/(x_values(i) - x_values(j-1)) * det;
      newLine = [newLine, newValue];
    endfor    
    %transpose to add a new line, then transpose it again in order to work on columns
    table = table';
    table = [table; newLine];
    table = table';
  endfor  
  returnval = table(m, m);
endfunction


##%test Aitken
##x = [6, 4, 2];
##f = [3, 2, 1];
##Aitken(x, f, 1)