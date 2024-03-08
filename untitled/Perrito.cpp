//
// Created by adrestreph on 8/03/2024.
//

#include <iostream>
#include "Perrito.h"

int Perrito::ladrar() {
    return rand() % (10-1)+1;
}

void Perrito::aullar() {
    cout << "Auuuuhhh. . ."<<endl;
}

void Perrito::hacerChichi() {
    cout << "Alza la patica..."<<endl;
}

//CONSTRUCTOR DEFAULT
Perrito::Perrito() {}

//CONSTRUCTOR EXPLICITO
Perrito::Perrito(const string &nombre, const string &raza) : nombre(nombre), raza(raza) {}

//DESTRUCTOR
Perrito::~Perrito() {
delete this;
}

