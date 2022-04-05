public E save(E entity) throws ValidationException {
        try {            
            if (tema.getID() == null) { //1
                throw new ValidationException("ID invalid! \n"); //2
            } 
            if (tema.getID().equals("")) {  //3
                throw new ValidationException("ID invalid! \n");//4
            }
            
            if (tema.getDescriere() == null) {  //5
                throw new ValidationException("Descriere invalida! \n");    //6
            }
            if (tema.getDescriere().equals("")) {   //7
                throw new ValidationException("Descriere invalida! \n"); //8
            }           
            if (tema.getDeadline() < 1) {   //9
                throw new ValidationException("Deadline invalid! \n");  //10
            }
            if (tema.getDeadline() > 14) {  //11
                throw new ValidationException("Deadline invalid! \n");  //12
            } 
            if (tema.getDeadline() < tema.getStartline()) { //13
                throw new ValidationException("Deadline invalid! \n");  //14
            }            
            if (tema.getStartline() < 1) {  //15
                throw new ValidationException("Data de primire invalida! \n");     //16
            }   
            if (tema.getStartline() > 14) { //17
                throw new ValidationException("Data de primire invalida! \n");      //18
            }
            if (tema.getStartline() > tema.getDeadline()) { //19
                throw new ValidationException("Data de primire invalida! \n");     //20
            } 
            return entities.putIfAbsent(entity.getID(), entity);    //21
        }
        catch (ValidationException ve) {
            System.out.println("Entitatea nu este valida! \n"); //22
            return null;    //23
    }       
        //  24
    }