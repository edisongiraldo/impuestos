package impuestos

class Impuesto {

	int periodo
	int subperiodo
	int valor

	static belongsTo = [predio: Predio, concepto: Concepto]

    static constraints = {
    }
}
