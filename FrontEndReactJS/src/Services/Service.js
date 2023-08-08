import axios from "axios";


export function ListMedicos() {
  const url = `http://localhost:8100/v1/lista_medicos`;
  const promise = axios.post(url);
  const dataPromise = promise.then((response) => response.data);
  return dataPromise;
}

export function ListPaciente() {
    const url = `http://localhost:8100/v1/lista_pacientes`;
    const promise = axios.post(url);
    const dataPromise = promise.then((response) => response.data);
    return dataPromise;
  }

  export function ListPropietario() {
    const url = `http://localhost:8100/v1/lista_propietario`;
    const promise = axios.post(url);
    const dataPromise = promise.then((response) => response.data);
    return dataPromise;
  }