package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Recensement;

import java.util.List;
import java.util.Scanner;

public abstract class MenuService {
    public abstract void traiter(List<Recensement> recensements, Scanner scanner) ;
}
