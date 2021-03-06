package com.alexandre.tryn5.service;

import java.util.List;

import com.alexandre.tryn5.model.Paciente;
import com.alexandre.tryn5.model.Procedimento;

public interface PacienteService {

    public List<Paciente> GetAll();

    public Paciente GetByExample(Paciente paciente);

    public Paciente UpdatePaciente(String cpf, Paciente newPacienteInfo);

    public Paciente CreatePaciente(Paciente paciente);

    public Paciente AddProcedimento(String cpf, Procedimento procedimento);

    public Paciente GetByCpf(String cpf);

    public Paciente AddAlergia(String cpf, String alergia);
}
