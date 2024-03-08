#include <iostream>
#include "Perrito.h"

using namespace std;

struct Nota{
    string nombres_estudiante;
    string materia;
    float nota;
    int semestre;
};

int main() {
    //OBJETO SENCILLO
    /*Nota obj;
    cout << "Ingrese nombre del estudiante: " << endl;
    cin >> obj.nombres_estudiante;// ALMACENA LOS DATOS


    cout << "Ingrese nombre de la materia : " << endl;
    cin >> obj.materia;// ALMACENA LOS DATOS

    cout << "Ingrese el semestre: " << endl;
    cin >> obj.semestre;

    cout << "Ingrese la nota: " << endl;
    cin >> obj.nota;

    cout << "El estudiante " <<obj.nombres_estudiante <<" saco "<<obj.nota<<" en la materia "<<obj.materia <<" del semestre "<<obj.semestre<< endl;
*/

    Perrito *obj1 = new Perrito();

    cout << "El perrito ladro "<< obj1->ladrar() << " veces" <<endl;
    obj1->ladrar();
    obj1->aullar();
    obj1->hacerChichi();


    return 0;
}
