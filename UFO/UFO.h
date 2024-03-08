//
// Created by adrestreph on 8/03/2024.
//

#ifndef UFO_UFO_H
#define UFO_UFO_H
#include <string>
using namespace std;

class UFO{
public:
    //METODOS
    int abducirVaca();
    int abducirHum();
    void volar();
    void aterrizar();


private:
    //ATRIBUTOS
    string tipo, procedencia;
};


#endif //UFO_UFO_H
