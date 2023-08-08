import React, { useState, useEffect } from 'react';
import Box from '@mui/material/Box';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import Button from '@mui/material/Button';
import { ListMedicos, ListPaciente, ListPropietario } from '../Services/Service'

export default function Medicos() {

    const [medicoslist, setMedicos] = useState([]);
    const [pacienteslist, setPacientes] = useState([]);
    const [propietariolist, setPropietario] = useState([]);



    const medicos = {
        medicos_id: ''
    };

    const [m, setM] = useState(medicos);

    const pacientes = {
        pacientes_id: ''

    };
    const [p, setP] = useState(pacientes);

    const propietario = {
        propietario_id: ''

    };
    const [pr, setPR] = useState(propietario);

    const data = {
        fecha: "2023-08-08T06:14:56.660Z"
    }


    const [request, setData] = useState(data);

    const handleChange = (event) => {
        setM({
            ...m,
            medicos_id: event.target.value
        });
    };

    const handleChangePaciente = (event) => {
        setP({
            ...p,
            pacientes_id: event.target.value
        });
    };

    const handleChangePropietario = (event) => {
        setPR({
            ...pr,
            propietario_id: event.target.value
        });
    };

   

    useEffect(() => {
        ListMedicos().then((response) => {
            setMedicos(response);
        })

        ListPaciente().then((response) => {
            setPacientes(response);
        })

        ListPropietario().then((response) => {
            setPropietario(response);
        })

    }, [request]);

    return (
        <Box sx={{ minWidth: 120, margin: 20, }}>
            <FormControl fullWidth>
                <InputLabel id="demo-simple-select-label">Médico</InputLabel>
                <Select
                    labelId="demo-simple-select-label"
                    id="demo-simple-select"
                    value={m.medicos_id}
                    label="Médico"
                    onChange={handleChange}
                >

                    {
                        medicoslist != undefined && medicoslist.map((p) => (
                            <MenuItem key={p.medicos_id} value={p.medicos_id}>{p.nombre} - {p.cedula} </MenuItem>
                        ))
                    }
                </Select>
            </FormControl>
            <br></br>
            <br></br>
            <FormControl fullWidth>
                <InputLabel id="demo-simple-select-label">Paciente</InputLabel>
                <Select
                    labelId="demo-simple-select-label"
                    id="demo-simple-select"
                    value={p.pacientes_id}
                    label="Paciente"
                    onChange={handleChangePaciente}
                >

                    {
                        pacienteslist != undefined && pacienteslist.map((p) => (
                            <MenuItem key={p.pacientes_id} value={p.pacientes_id}>{p.nombrepaciente} - {p.tipo} </MenuItem>
                        ))
                    }
                </Select>
            </FormControl>
            <br></br>
            <br></br>
            <FormControl fullWidth>
                <InputLabel id="demo-simple-select-label">Propietario</InputLabel>
                <Select
                    labelId="demo-simple-select-label"
                    id="demo-simple-select"
                    value={pr.propietario_id}
                    label="Propietario"
                    onChange={handleChangePropietario}
                >

                    {
                        propietariolist != undefined && propietariolist.map((pro) => (
                            <MenuItem key={pro.propietario_id} value={pro.propietario_id}>{pro.nombre}  {pro.apellido_p} {pro.apellido_m}</MenuItem>
                        ))
                    }
                </Select>
            </FormControl>
            <br></br>
            <br></br>
            <Button variant="contained" >Se envia al servicio para guardar la cita</Button>

        </Box>
    );
}

