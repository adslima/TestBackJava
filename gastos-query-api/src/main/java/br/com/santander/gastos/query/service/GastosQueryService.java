package br.com.santander.gastos.query.service;

import br.com.santander.gastos.query.dto.GastosDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface GastosQueryService {
    Page<GastosDTO> consultarUltimosGastos(Long idCliente, Pageable pageable);

    Page<GastosDTO> consultar(Long idCliente, LocalDate data, Pageable pageable);
}