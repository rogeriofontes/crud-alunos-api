package br.com.unipac.crudalunosapi.model.service.impl;

import br.com.unipac.crudalunosapi.mode.dao.AlunoDAO;
import br.com.unipac.crudalunosapi.model.domain.Aluno;
import br.com.unipac.crudalunosapi.model.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoDAO alunoDAO;

    @Override
    public Aluno salvar(Aluno aluno) {
        return alunoDAO.save(aluno);
    }

    @Override
    public Aluno editar(Long id, Aluno aluno) {
        aluno.setId(id);
        return alunoDAO.save(aluno);
    }

    @Override
    public List<Aluno> list() {
        return alunoDAO.findAll();
    }

    @Override
    public Optional<Aluno> findById(Long id) {
        return alunoDAO.findById(id);
    }

    @Override
    public void delete(Long id) {
        alunoDAO.deleteById(id);
    }
}
