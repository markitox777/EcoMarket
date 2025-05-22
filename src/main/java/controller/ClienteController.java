package controller;

import model.Cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteController {
    public List<Cliente> listaClientes = new ArrayList<Cliente>();

    public boolean agregarCliente(Cliente newCliente) {
        return listaClientes.add(newCliente);
    }

    public List<Cliente> obtenerClientes() {
        return listaClientes;
    }

    public Cliente obtenerClientePorId(int id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdCliente() == id) {
                return cliente;
            }
        }
        return null; // Si no se encuentra, retornamos null
    }

    //Actualizar
    public boolean actualizarCliente(int id, String nombre, String apellido, String correo, Date fechaNacimiento, Cliente clienteActualizado) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getIdCliente() == id) {
                listaClientes.set(i, clienteActualizado);
                cliente.setNombreCliente(nombre);
                cliente.setApellidoCliente(apellido);
                cliente.setCorreoCliente(correo);
                cliente.setFechaNacimiento(fechaNacimiento);
                return true;
            }
        }
        return false; // Si no se encuentra, retornamos false
    }

    public boolean eliminarCliente(int id) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getIdCliente() == id) {
                listaClientes.remove(i);
                return true;
            }
        }
        return false; // Si no se encuentra, retornamos false
    }

}
