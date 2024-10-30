package com.controladores;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dto.clubDTO;

@RestController
@RequestMapping("/api/clubes")
public class UsuarioController {

    private List<clubDTO> clubes = new ArrayList<>();

    @PostMapping("/")
    public clubDTO nuevoClub(@RequestBody clubDTO club) {
        club.setId(clubes.size() + 1); // Asigna un ID único
        clubes.add(club); // Agrega el club a la lista
        return club; // Devuelve el club en formato JSON
    }

    @GetMapping("/")
    public List<clubDTO> obtenerClubes() {
        return clubes; // Devuelve la lista de clubes en formato JSON
    }
}
