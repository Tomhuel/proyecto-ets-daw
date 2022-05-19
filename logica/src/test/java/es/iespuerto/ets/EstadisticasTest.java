package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstadisticasTest {
    Estadisticas testeo = null;

    @BeforeEach
    public void beforeEach() throws FileNotFoundException  {
        testeo = new Estadisticas(1, 13226, 251, 876, 0, 100.0, 5.0, 50.0, 28.0, 1);
       /** 
        List<Estadisticas> testLista = new ArrayList<>();
        String linea;
        String[] palabrasLinea;
        Scanner bdEstadisticas = new Scanner(new File(
                "/media/daw/TOSHIBA EXT/1º DAW/Entorno Desarrollo/CalcImpact/proyecto-ets-daw/logica/src/test/java/es/iespuerto/ets/Datos/Estadisticas.txt"));
        bdEstadisticas.nextLine();
        while (bdEstadisticas.hasNextLine()) {
            linea = bdEstadisticas.nextLine();
            palabrasLinea = linea.split(";");
            Integer id = Integer.parseInt(palabrasLinea[0]);
            Integer vida = Integer.parseInt(palabrasLinea[1]);
            Integer ataque = Integer.parseInt(palabrasLinea[2]);
            Integer defensa = Integer.parseInt(palabrasLinea[3]);
            Integer maestriaElemental = Integer.parseInt(palabrasLinea[4]);

            Double recargaEnergia = Double.parseDouble(palabrasLinea[5]);
            Double probabilidadCrit = Double.parseDouble(palabrasLinea[6]);
            Double danioCrit = Double.parseDouble(palabrasLinea[7]);
            Double bonoElemental = Double.parseDouble(palabrasLinea[8]);
            Integer idPersonaje = Integer.parseInt(palabrasLinea[9]);
            Estadisticas datos = new Estadisticas(id, vida, ataque, defensa, maestriaElemental, recargaEnergia,
                    probabilidadCrit, danioCrit, bonoElemental, idPersonaje);
            testLista.add(datos);
        }
        bdEstadisticas.close();
        */
    }

    @Test
    public void testGetEstadisticas() {
        assertEquals(testeo, testeo.getEstadisticas(1));
    }

    @Test
    public void testLeerDatos() {
        Exception exepcion1 = assertThrows(FileNotFoundException.class, () -> testeo.leerDatos());
        assertTrue(exepcion1.getMessage().contains("s"));
    }

    @Test
    public void testGetAtqbase() {
        assertEquals(251, testeo.getAtqbase());
    }

    @Test
    public void testGetBonoelemnt() {
        assertEquals(28.0, testeo.getBonoelemnt());
    }

    @Test
    public void testGetCodigo() {
        assertEquals(1, testeo.getCodigo());
    }

    @Test
    public void testGetCodigoPersonaje() {
        assertEquals(1, testeo.getCodigoPersonaje());
    }

    @Test
    public void testGetDefbase() {
        assertEquals(876, testeo.getDefbase());
    }

    @Test
    public void testGetDnCrit() {
        assertEquals(50.0, testeo.getDnCrit());
    }

    @Test
    public void testGetMaestria() {
        assertEquals(0, testeo.getMaestria());
    }

    @Test
    public void testGetProbCrit() {
        assertEquals(5.0, testeo.getProbCrit());
    }

    @Test
    public void testGetRecarga() {
        assertEquals(100.0, testeo.getRecarga());
    }

    @Test
    public void testGetVidabase() {
        assertEquals(13226, testeo.getVidabase());
    }

    @Test
    public void testSetAtqbase() {
        testeo.setAtqbase(200);
        assertEquals(200, testeo.getAtqbase());
    }

    @Test
    public void testSetBonoelemnt() {
        testeo.setBonoelemnt(50.0);
        assertEquals(50.0, testeo.getBonoelemnt());
    }

    @Test
    public void testSetCodigo() {
        testeo.setCodigo(2);
        assertEquals(2, testeo.getCodigo());
    }

    @Test
    public void testSetCodigoPersonaje() {
        testeo.setCodigoPersonaje(2);
        assertEquals(2, testeo.getCodigoPersonaje());
    }

    @Test
    public void testSetDefbase() {
        testeo.setDefbase(900);
        assertEquals(900, testeo.getDefbase());
    }

    @Test
    public void testSetDnCrit() {
        testeo.setDnCrit(100.0);
        assertEquals(100.0, testeo.getDnCrit());
    }

    @Test
    public void testSetMaestria() {
        testeo.setMaestria(234);
        assertEquals(234, testeo.getMaestria());
    }

    @Test
    public void testSetProbCrit() {
        testeo.setProbCrit(47.5);
        assertEquals(47.5, testeo.getProbCrit());
    }

    @Test
    public void testSetRecarga() {
        testeo.setRecarga(236.52);
        assertEquals(236.52, testeo.getRecarga());
    }

    @Test
    public void testSetVidabase() {
        testeo.setVidabase(20502);
        assertEquals(20502, testeo.getVidabase());
    }
}