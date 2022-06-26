package LDELVILLAR.LDELVILLAR.Service;

import LDELVILLAR.LDELVILLAR.Entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    List<Asignatura> listaAsignaturas();

    Asignatura obtenerPorDenominacionOrSigla(String denoSig);

    Asignatura guardarAsignatura(Asignatura asignatura);
}
