//
// Created by adrestreph on 8/03/2024.
//

#ifndef UNTITLED_PERRITO_H
#define UNTITLED_PERRITO_H
#include <string>
using namespace std;

class Perrito {

public:
    //METODOS
    int ladrar();
    void aullar();
    void hacerChichi();

    //CONSTRUCTOR DEFAULT
    Perrito();

    //CONSTRUCTOR EXPLICITO
    Perrito(const string &nombre, const string &raza);

    //DESTRUCTOR
    virtual ~Perrito();


private:
    //ATRIBUTOS
    string nombre, raza;

};


#endif //UNTITLED_PERRITO_H
